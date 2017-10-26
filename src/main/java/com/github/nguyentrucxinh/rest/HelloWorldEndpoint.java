package com.github.nguyentrucxinh.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello-world")
public class HelloWorldEndpoint {

    @GET
    public String getClichedMessage() {
        return "Hello world";
    }
}
