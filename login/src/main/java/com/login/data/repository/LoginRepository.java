package com.login.data.repository;

import com.login.data.entity.Login;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by haier_1 on 5/2/2017.
 */
public interface LoginRepository extends CrudRepository<Login , Long> {

    Login findByEmailAndAndPassword(String email , String password);
}
