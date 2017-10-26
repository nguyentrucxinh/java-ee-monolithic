package com.github.nguyentrucxinh.rest;

import com.github.nguyentrucxinh.model.HelloWorld;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Path("/hello-world")
public class HelloWorldEndpoint {

    @POST
    @Consumes({"application/xml", "application/json"})
    public Long create(HelloWorld helloWorld) {
        return helloWorld.getId();
    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public void delete(@PathParam("id") Long id) {
        System.out.println(id);
    }

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{id:[0-9][0-9]*}")
    public HelloWorld findById(@PathParam("id") Long id) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setId(1L);
        helloWorld.setMessage("Message 1");
        return helloWorld;
    }

    @GET
    @Produces({"application/xml", "application/json"})
    public List<HelloWorld> listAll() {
        HelloWorld helloWorld1 = new HelloWorld();
        helloWorld1.setId(1L);
        helloWorld1.setMessage("Message 1");

        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setId(2L);
        helloWorld2.setMessage("Message 2");

        List<HelloWorld> helloWorlds = new ArrayList<>();
        helloWorlds.add(helloWorld1);
        helloWorlds.add(helloWorld2);

        return helloWorlds;
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes({"application/xml", "application/json"})
    public void update(@PathParam("id") Long id, HelloWorld helloWorld) {
        System.out.printf(id + helloWorld.getId() + helloWorld.getMessage());
    }

}
