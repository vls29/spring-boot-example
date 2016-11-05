package uk.co.vsf.example.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        logger.info("Received request");
        return "Hello World";
    }
}
