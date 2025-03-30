package com.myTraining.core.jobs;

import org.apache.sling.event.jobs.Job;
import org.apache.sling.event.jobs.consumer.JobConsumer;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
    service = JobConsumer.class,
    property = {JobConsumer.PROPERTY_TOPICS + "=com/myproject/job/helloworld"}
)
public class HelloWorldSlingJob implements JobConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldSlingJob.class);

    @Override
    public JobResult process(Job job) {
        LOG.info("Hello World from Sling Job!");
        return JobResult.OK;
    }
}
