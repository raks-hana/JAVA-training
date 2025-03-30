package com.myTraining.core.servlets;

import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component(
    service = Servlet.class
)
@SlingServletPaths("/bin/searchContent")
public class SearchServlet extends SlingSafeMethodsServlet {

    private static final Logger LOG = LoggerFactory.getLogger(SearchServlet.class);

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String searchText = request.getParameter("query");
        if (searchText == null || searchText.isEmpty()) {
            response.getWriter().write("Search query is required");
            return;
        }

        try {
            QueryBuilder queryBuilder = request.getResourceResolver().adaptTo(QueryBuilder.class);
            Map<String, String> predicateMap = new HashMap<>();
            predicateMap.put("path", "/content/myTraining");
            predicateMap.put("type", "cq:Page");
            predicateMap.put("fulltext", searchText);
            predicateMap.put("p.limit", "10");

            Query query = queryBuilder.createQuery(PredicateGroup.create(predicateMap), request.getResourceResolver().adaptTo(Session.class));
            SearchResult result = query.getResult();

            List<Hit> hits = result.getHits();
            for (Hit hit : hits) {
                response.getWriter().write("Found Page: " + hit.getPath() + "\n");
                LOG.info("Found Page: {}", hit.getPath());
            }
        } catch (Exception e) {
            LOG.error("Search error", e);
            response.getWriter().write("Error searching content");
        }
    }
}

