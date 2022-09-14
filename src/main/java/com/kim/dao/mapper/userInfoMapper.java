package com.kim.dao.mapper;

import com.kim.model.userInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface userInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(String userid);

    List<userInfo> selectAll();

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKey(userInfo record);


}