package com.mzdee.rest.test;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import com.mzdee.rest.OrderService;

import javax.ws.rs.core.Application;

public class OrderServicesTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(
        		OrderService.class
        		);
    }

    @Test
    public void ordersPathParamTest() throws Exception{
        String response = target("orders/453").request().get(String.class);
        Assert.assertTrue("orders 453".equals(response));
    }

    @Test
    public void ordersFixedPathTest() throws Exception{
        String response = target("orders/summary").request().get(String.class);
        System.out.println(response);
        Assert.assertTrue("orders summary".equals(response));
    }
}
