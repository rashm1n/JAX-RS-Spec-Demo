package com.example.service.beans.param;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;

public class MyBeanParam {
    @QueryParam("param1")
    private String pathParam1;

    @QueryParam("param2")
    private String pathParam2;

    @HeaderParam("header1")
    private String headerParam1;

    @Override
    public String toString() {
        return "MyBeanParam{" +
                "pathParam1='" + pathParam1 + '\'' +
                ", pathParam2='" + pathParam2 + '\'' +
                ", headerParam1='" + headerParam1 + '\'' +
                '}';
    }

    public String getPathParam1() {
        return pathParam1;
    }

    public void setPathParam1(String pathParam1) {
        this.pathParam1 = pathParam1;
    }

    public String getPathParam2() {
        return pathParam2;
    }

    public void setPathParam2(String pathParam2) {
        this.pathParam2 = pathParam2;
    }

    public String getHeaderParam1() {
        return headerParam1;
    }

    public void setHeaderParam1(String headerParam1) {
        this.headerParam1 = headerParam1;
    }
}
