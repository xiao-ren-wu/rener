package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @Created with IDEA
 * @author:GaoPan
 * @Date:2018/1/31
 * @Time:2:31
 * @JDK versions: 1.8.0_101
 */
public class CustomMapper extends ObjectMapper {
    public CustomMapper() {
        this.setSerializationInclusion(Include.NON_NULL);
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}
