package com.myTraining.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(
    service = Servlet.class
)
@SlingServletResourceTypes(
    resourceTypes = "myTraining/components/sample",
    methods = {"GET", "POST"},
    extensions = "json"
)
public class SampleServlet extends SlingAllMethodsServlet {

    private static final Logger LOG = LoggerFactory.getLogger(SampleServlet.class);

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        LOG.info("Inside SampleServlet GET method");
        response.setContentType("application/json");
        response.getWriter().write("{\"message\":\"Hello from SampleServlet!\"}");
    }

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        LOG.info("Inside SampleServlet POST method");
        response.getWriter().write("POST request received");
    }
}

