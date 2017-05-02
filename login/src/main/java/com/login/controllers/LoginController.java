package com.login.controllers;

/**
 * Created by haier_1 on 5/1/2017.
 */
import com.login.data.entity.Login;
import com.login.data.entity.Response;
import com.login.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(method = RequestMethod.GET)
    public Response login(@RequestParam Map<String,String> requestParams){
        Login loginInfo = new Login(requestParams.get("email") , requestParams.get("pass"));

        return loginService.getAuthentication(loginInfo);
    }
}
