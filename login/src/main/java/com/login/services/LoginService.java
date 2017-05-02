package com.login.services;

import com.login.data.entity.Login;
import com.login.data.entity.Response;
import com.login.data.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by haier_1 on 5/2/2017.
 */
@Service
public class LoginService {

    LoginRepository loginRepository;

   @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public  Response getAuthentication(Login data){
        Response response = new Response();

        Login user = this.loginRepository.findByEmailAndAndPassword(data.getEmail() , data.getPassword());

        if(user != null){
            response.setResponse("Success");
            response.setCode(200);
        }
        else {
            response.setResponse("Authentication failed");
            response.setCode(500);
        }

        return response;
    }
}
