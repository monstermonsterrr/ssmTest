package com.kim.service;

import com.kim.model.userInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author AnneRose
 * @date 2022/9/13 16:50
 * @Version v1.0
 */

public interface UserService {
     void saveUser(Map<String,Object> params);

     List<userInfo> selectAll();
}
