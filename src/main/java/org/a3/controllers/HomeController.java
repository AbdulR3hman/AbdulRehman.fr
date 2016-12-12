package org.a3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abdulr3hman on 12/12/2016.
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String homePage(Model model)
    {
        return "hello world";
    }
}
