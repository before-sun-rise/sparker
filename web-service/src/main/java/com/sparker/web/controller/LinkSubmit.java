package com.sparker.web.controller;

import com.sparker.model.WebLink;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */

@RestController
public class LinkSubmit {

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public
    @ResponseBody
    Object createWebLink(@RequestBody WebLink webLink, BindingResult bindingResult) throws Exception {
        //TODO check session credential and do the following
        return null;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public
    @ResponseBody
    Object deleteWebLink(@RequestBody WebLink webLink, BindingResult bindingResult) {
        //TODO check session credential and do the following
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public
    @ResponseBody
    Object updateWebLink(@RequestBody WebLink webLink, BindingResult bindingResult) {
        //TODO check session credential and do the following
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public
    @ResponseBody
    Object rateWebLink(@RequestBody WebLink webLink, BindingResult bindingResult) {
        //TODO check session credential and do the following
        return null;
    }


}
