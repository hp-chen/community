package com.community.mapper;

import com.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_in,token,gon_create,gmt_modified) " +
            "values (#{name},#{accountId},#{token},#{gmtCreate},#{motModified})")
    void insert(User user);
}
