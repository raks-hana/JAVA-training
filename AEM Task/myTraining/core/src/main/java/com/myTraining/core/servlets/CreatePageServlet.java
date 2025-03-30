package com.myTraining.core.servlets;


import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.WCMException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(
    service = Servlet.class
)
@SlingServletPaths("/bin/createPage")
public class CreatePageServlet extends SlingSafeMethodsServlet {

    private static final Logger LOG = LoggerFactory.getLogger(CreatePageServlet.class);

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String parentPath = "/content/myTraining/us/en";
        String pageName = request.getParameter("pageName");

        if (pageName == null || pageName.isEmpty()) {
            response.getWriter().write("Page name is required");
            return;
        }

        try {
            PageManager pageManager = request.getResourceResolver().adaptTo(PageManager.class);
            if (pageManager != null) {
                Page page = pageManager.create(parentPath, pageName, "/conf/mysite/settings/wcm/templates/content-page", pageName, true);
                response.getWriter().write("Page Created: " + page.getPath());
                LOG.info("Page Created at: {}", page.getPath());
            } else {
                LOG.error("PageManager is null");
            }
        } catch (WCMException e) {
            LOG.error("Error creating page", e);
            response.getWriter().write("Error creating page");
        }
    }
}
