package com.myTraining.core.schedulers;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.commons.scheduler.Scheduler;

@Component(service = Runnable.class)
@Designate(ocd = YellowWorldScheduler.Config.class)
public class YellowWorldScheduler implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(YellowWorldScheduler.class);

    @ObjectClassDefinition(name = "Hellow World Scheduler")
    public @interface Config {
        @AttributeDefinition(name = "Cron Expression", description = "Runs every 5 minutes")
        String scheduler_expression() default "0 0/5 * * * ?";
    }

    @Activate
    @Modified
    protected void activate(Config config) {
        LOG.info("Hellow World Scheduler Activated");
    }

    @Deactivate
    protected void deactivate() {
        LOG.info("Hellow World Scheduler Deactivated");
    }

    @Override
    public void run() {
        LOG.info("Hellow World!");
    }
}

