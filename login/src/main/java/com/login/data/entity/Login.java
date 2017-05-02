package com.login.data.entity;

import javax.persistence.*;

/**
 * Created by haier_1 on 5/1/2017.
 */
@Entity
@Table(name = "LOGIN")
public class Login {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASS")
    private  String password;

    public Login() {
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
