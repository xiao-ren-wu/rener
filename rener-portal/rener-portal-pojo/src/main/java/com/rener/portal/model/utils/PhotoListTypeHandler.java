package com.rener.portal.model.utils;

import com.rener.portal.model.vo.PhotoList;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IDEA
 * author:Dick_YangDi
 * Date:2018/1/24
 * Time:13:10
 * JDK versions: 1.8.0_101
 */
public class PhotoListTypeHandler extends BaseTypeHandler<PhotoList> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, PhotoList photoList, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, photoList.getAsString());
    }

    @Override
    public PhotoList getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return new PhotoList(resultSet.getString(s));
    }

    @Override
    public PhotoList getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return new PhotoList(resultSet.getString(i));
    }

    @Override
    public PhotoList getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return new PhotoList(callableStatement.getString(i));
    }
}
