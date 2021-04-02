package com.example;

import com.example.beans.param.MyBeanParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("basic")
public class BasicResource {

    @GET
    @Produces("text/plain")
    // media type format type/subtype. type - general category , subtype - what kind of data category. text/plain, text/html etc.
    public String basicGet() {
        return "inside basic get method";
    }

    @Path("/{name}")
    @GET
    @Produces("text/plain")
    public String basicGetWithPathParam(@PathParam("name") String name) {
        return "hello! " + name;
    }

    @Path("/mimeDemo")
    @GET
    @Produces("text/plain")
    public String getPlainText() {
        return "Plain Text Mime";
    }

    @Path("/mimeDemo")
    @GET
    @Produces("text/html")
    public String getHTML() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Demo Heading</h1>\n" +
                "\n" +
                "<p>Demo paragraph.</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    @GET
    @Path("/query")
    @Produces("text/plain")
    public String queryParam(@QueryParam("param1") @DefaultValue("def val 1") String param1,
                             @QueryParam("param2") @DefaultValue("def val 2") String param2) {
        return "params are " + param1 + " " + param2;
    }

    @GET
    @Path("/queryContext")
    @Produces("text/plain")
    public String queryParamContext(@Context UriInfo uriInfo, @Context HttpHeaders httpHeaders) {
        MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
        MultivaluedMap<String, String> headers = httpHeaders.getRequestHeaders();
        return "params are " + queryParameters.get("param1") + " " + queryParameters.get("param2");
    }

    @GET
    @Path("/beanparam")
    @Produces("text/plain")
    public String beanParam(@BeanParam MyBeanParam myBeanParam) {
        return myBeanParam.toString();
    }

    @Path("subresource")
    public SubResource1 getSubResource() {
        return new SubResource1();
    }
}
