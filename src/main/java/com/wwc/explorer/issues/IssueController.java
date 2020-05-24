package com.wwc.explorer.issues;

import com.wwc.explorer.github.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IssueController {

    @Autowired
    IssueService issueService;

    @RequestMapping("/")
    public String index() {
        return "Stay tuned. This service will soon start serving github issues for opensource newbies.";
    }

    @RequestMapping("/issues")
    public Response issues() {

        return issueService.getAllIssues();
    }

    @RequestMapping("/issues/ufg")
    public Response upForGrabs() {
        return issueService.getUpForGrabs();
    }

    @RequestMapping("/issues/bf")
    public Response beginnerFriendly() {
        return issueService.getBeginnerFriendly();
    }

    @RequestMapping("/issues/fto")
    public Response firstTimersOnly() {
        return issueService.getFirstTimersOnly();
    }

    @RequestMapping("/issues/newcomer")
    public Response newComer() {
        return issueService.getNewComer();
    }

    @RequestMapping("/issues/jumpin")
    public Response jumpIn() {
        return issueService.getJumpIn();
    }
}
