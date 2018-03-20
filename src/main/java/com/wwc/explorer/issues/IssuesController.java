package com.wwc.explorer.issues;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class IssuesController {

    @RequestMapping("/")
    public String index() {
        return "Stay tuned. This service will soon start serving github issues for opensource newbies.";
    }

    @RequestMapping("/issues")
    @ResponseBody
    public String issues() {

        Issues list = new Issues("java");

        return list.getIssues();
    }

}
