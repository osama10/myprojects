package com.login.data.entity;

/**
 * Created by haier_1 on 5/1/2017.
 */
public class Response {
    private String response;
    private int code;

    public Response() {
    }

    public Response(String response, int code) {
        this.response = response;
        this.code = code;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
