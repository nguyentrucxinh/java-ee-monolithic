package com.github.nguyentrucxinh.web.api;

import com.github.nguyentrucxinh.domain.HelloWorld;
import com.github.nguyentrucxinh.repository.HelloWorldRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;

@Stateless
@Path("/hello-world")
public class HelloWorldEndpoint {

    @Inject
    private HelloWorldRepository helloWorldRepository;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(HelloWorld helloWorld) {
        return Response.created(UriBuilder.fromResource(HelloWorldEndpoint.class).path(String.valueOf(helloWorld.getId())).build()).build();
    }

    @DELETE
    @Path("/{id:[0-9][0-9]*}")
    public Response delete(@PathParam("id") Long id) {
        return Response.noContent().build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{id:[0-9][0-9]*}")
    public Response findById(@PathParam("id") Long id) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setId(1L);
        helloWorld.setMessage("Message 1");
        return Response.ok(helloWorld).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<HelloWorld> listAll() {
        return helloWorldRepository.findAll();
    }

    @PUT
    @Path("/{id:[0-9][0-9]*}")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("id") Long id, HelloWorld helloWorld) {
        return Response.noContent().build();
    }

}
