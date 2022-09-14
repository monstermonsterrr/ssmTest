package com.kim.service.impl;

import com.kim.dao.mapper.userInfoMapper;
import com.kim.model.userInfo;
import com.kim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author AnneRose
 * @date 2022/9/13 16:50
 * @Version v1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private userInfoMapper userInfoMapper;
    @Override
    public void saveUser(Map<String, Object> params) {

    }

    @Override
    public List<userInfo> selectAll() {
        List<userInfo> userList = userInfoMapper.selectAll();
        return userList;
    }
}
