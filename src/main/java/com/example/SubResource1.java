package com.example;

import javax.ws.rs.GET;

public class SubResource1 {
    @GET
    public String  getMethod(){
        return "Inside Sub Resource";
    }
}
