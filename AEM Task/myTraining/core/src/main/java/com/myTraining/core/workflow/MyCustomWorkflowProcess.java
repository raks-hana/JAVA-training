package com.myTraining.core.workflow;

import org.apache.sling.api.resource.Resource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.adobe.granite.workflow.exec.WorkflowProcess;

@Component(
    service = WorkflowProcess.class,
    property = { "process.label=My Custom Workflow Process" }
)
public class MyCustomWorkflowProcess implements WorkflowProcess {

    private static final Logger LOG = LoggerFactory.getLogger(MyCustomWorkflowProcess.class);

    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        try {
            String payloadPath = workItem.getWorkflowData().getPayload().toString();
            LOG.info("Executing Custom Workflow Process for page: {}", payloadPath);

            // Fetch the page resource
            Resource resource = workflowSession.adaptTo(Resource.class);
            if (resource != null) {
                String pageTitle = resource.getValueMap().get("jcr:title", String.class);
                LOG.info("Page Title: {}", pageTitle);
            } else {
                LOG.warn("Resource not found for path: {}", payloadPath);
            }

            // Adding custom metadata
            workItem.getWorkflow().getMetaDataMap().put("customKey", "Custom Metadata Value");

        } catch (Exception e) {
            LOG.error("Error in Custom Workflow Process", e);
        }
    }
}
