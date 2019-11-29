package com.mooyle.goden.web.controller;

import com.mooyle.goden.common.Result;
import com.mooyle.goden.common.po.UserInfo;
import com.mooyle.goden.common.util.ResultUtil;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther marse
 * @Date 2019/11/28 19:48
 */
@RestController
@RequestMapping("/user")
public class UserLoginController {

    @PostMapping("/login")
    public Result userLogin(UserInfo userInfo) {
        return ResultUtil.success(userInfo);
    }
}
