package com.example.service;

import javax.ws.rs.GET;

public class SubResource1 {
    @GET
    public String  getMethod(){
        return "Inside Sub Resource";
    }
}
