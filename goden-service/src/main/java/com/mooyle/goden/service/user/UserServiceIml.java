package com.mooyle.goden.service.user;

import com.mooyle.goden.dao.mapper.GodenUsersMapper;
import com.mooyle.goden.domain.model.GodenUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIml implements UserService{
    @Autowired
    GodenUsersMapper godenUsersMapper;

    @Override
    public GodenUsers getUsers(Long uid) {
        return godenUsersMapper.getUserByID(uid);
    }
}
