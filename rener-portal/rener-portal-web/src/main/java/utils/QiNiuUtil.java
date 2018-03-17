package utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @Created with IDEA
 * @author:Dick_YangDi
 * @Date:2018/2/3
 * @Time:22:08
 * @JDK versions: 1.8.0_101
 */
public class QiNiuUtil {
    private String accessKey = "n8BvxvE7ByLNqcwKYxuP3OQaXb2HhCiJntyoc4Ra";
    private String secretKey = "UHHfn7q-JiSfBf3MlveRvzMhCWiXP2DphLa-1a_B";
    private String bucket = "13032964614";
    private Configuration cfg = new Configuration(Zone.zone2());
    private UploadManager uploadManager = new UploadManager(cfg);
    private String key = null;
    private String realmName = "http://p045xgfqh.bkt.clouddn.com/";

    public String upload(MultipartFile file) throws IOException {
        String fileName = "";
        if (!file.isEmpty()) {
            byte[] bytes = file.getBytes();
            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(byteInputStream, key, upToken, null, null);
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                fileName = putRet.hash;
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    System.out.println("Qiniu upload exception");
                }
            }
        }
        return realmName + fileName;
    }

    public String uploadFiles(MultipartFile[] files){
        StringBuffer stringBuffer = new StringBuffer();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String s="";
                try {
                    s=upload(files[i]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (i == 0) {
                    stringBuffer.append(s);
                }else{
                    stringBuffer.append("@@");
                    stringBuffer.append(s);
                }
            }
        } else {
            stringBuffer.append("");
        }
        return stringBuffer.toString();
    }
    //删除图片
    public boolean delete(String url){
        boolean flag = true;
        String[] split = url.split("/");
        key=split[split.length-1];
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            bucketManager.delete(bucket, key);
        } catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
            flag=false;
        }
        return flag;
    }
}
