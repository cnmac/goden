package com.mooyle.goden.service.user;

import com.mooyle.goden.dao.mapper.GodenUserMapper;
import com.mooyle.goden.domain.model.GodenUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIml implements UserService{

    @Autowired
    GodenUserMapper godenUsersMapper;

    @Override
    public GodenUser getUsers(Long uid) {
        return godenUsersMapper.selectByPrimaryKey(uid);
    }
}
