package com.myTraining.core.event;

import org.apache.sling.api.SlingConstants;
import org.apache.sling.api.resource.Resource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
    service = EventHandler.class,
    property = {
        EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceAdded",
        EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceChanged",
        EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceRemoved"
    }
)
public class CustomEventHandler implements EventHandler {

    private static final Logger LOG = LoggerFactory.getLogger(CustomEventHandler.class);

    @Override
    public void handleEvent(Event event) {
        String resourcePath = (String) event.getProperty(SlingConstants.PROPERTY_PATH);
        LOG.info("Resource event triggered at path: {}", resourcePath);
    }
}
