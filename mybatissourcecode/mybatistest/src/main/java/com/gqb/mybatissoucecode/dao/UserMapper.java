package com.gqb.mybatissoucecode.dao;

import com.gqb.mybatissoucecode.entity.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    public User select(int id);
}
