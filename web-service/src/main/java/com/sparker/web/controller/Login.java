package com.sparker.web.controller;

import com.sparker.model.Credential;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */
@RestController
public class Login {

    @RequestMapping(value = "login/{user}/{pass}")
    public Credential hello(@PathVariable(value = "user")String username, @PathVariable(value="pass") String password) {
        //TODO login using OAuth2 mechanisms and from data access layer
        return new Credential(username, password);
    }

}
