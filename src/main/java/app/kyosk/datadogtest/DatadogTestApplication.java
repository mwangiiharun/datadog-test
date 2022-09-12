package app.kyosk.datadogtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.datadog.EnableDatadogMetrics;

@SpringBootApplication
@EnableDatadogMetrics
public class DatadogTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatadogTestApplication.class, args);
    }

}
