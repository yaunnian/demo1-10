package com.leyou.service;

import com.leyou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Boolean check(String data, Integer type) {
        User user=new User();

        switch (type){
            case 1:
                user.setUsername(data);
                break;
            case 2:
                user.setPhone(data);
                break;
        }
        return userMapper.selectCount(user) == 0;
    }
}
