package com.lucasian.batch.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public @ResponseBody List<String> getSampleData() {
        return Arrays.asList("Uno", "Dos", "Tres");
    }

}
