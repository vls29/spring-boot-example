package uk.co.vsf.example.spring.controller;

import java.util.GregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co.vsf.example.spring.domain.Gender;
import uk.co.vsf.example.spring.domain.User;

@RestController()
public class UserController {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable(required = true) final Long id) {
        logger.info("Retrieving by id. id=[" + id + "]");
        final User user = new User(id, "Fred", "Bloggs", new GregorianCalendar(), Gender.MALE);
        logger.info(String.format("id=[%s] firstname=[%s] surname=[%s]",
                user.getId(),
                user.getFirstname(),
                user.getSurname()));
        return user;
    }
}
