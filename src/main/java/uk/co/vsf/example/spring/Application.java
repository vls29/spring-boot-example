package uk.co.vsf.example.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);

        logger.info("initialised");
    }

}