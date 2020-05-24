package com.wwc.explorer.query;

public class QueryIssuesByLabel {

    /**
     * Request can be put together here:
     * https://developer.github.com/v4/explorer/
     */

    private static String request =
            "query queryIssue($labelName: String!) {" +
                    "search( query:$labelName, type: ISSUE, last:100){" +
                    "edges{" +
                    "cursor " +
                    "node{" +
                    "... on Issue{ id  title  url " +
                    "labels(last:100) { edges { node { name } } }" +
                    "repository { name url primaryLanguage{ name } }" +
                    "              }" +
                    "       }" +
                    "    }" +
                    "  }" +
                    "}";

    private static String queryVariableLabelNameGoodFirstIssue = "{\\\"labelName\\\" : \\\"label:\\\\\\\"good first issue\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameGoodFirstIssue2 = "{\\\"labelName\\\" : \\\"label:\\\\\\\"good-first-issue\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameUpForGrabs = "{\\\"labelName\\\" : \\\"label:\\\\\\\"up for grabs\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameUpForGrabs2 = "{\\\"labelName\\\" : \\\"label:\\\\\\\"up-for-grabs\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameBeginnerFriendly = "{\\\"labelName\\\" : \\\"label:\\\\\\\"beginner friendly\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameBeginnerFriendly2 = "{\\\"labelName\\\" : \\\"label:\\\\\\\"beginner-friendly\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameFirstTimersOnly = "{\\\"labelName\\\" : \\\"label:\\\\\\\"first timers only\\\\\\\"  state:open\\\"}";
    private static String getQueryVariableLabelNameFirstTimersOnly2 = "{\\\"labelName\\\" : \\\"label:\\\\\\\"first-timers-only\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameNewcomer = "{\\\"labelName\\\" : \\\"label:\\\\\\\"newcomer\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameNewComer = "{\\\"labelName\\\" : \\\"label:\\\\\\\"new comer\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameJumpIn = "{\\\"labelName\\\" : \\\"label:\\\\\\\"jump in\\\\\\\"  state:open\\\"}";
    private static String queryVariableLabelNameJumpIn2 = "{\\\"labelName\\\" : \\\"label:\\\\\\\"jump-in\\\\\\\"  state:open\\\"}";

    public static String queryByLabelGoodFirstIssue() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameGoodFirstIssue + "\"}";
    }

    public static String queryByLabelGoodFirstIssue2() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameGoodFirstIssue2 + "\"}";
    }

    public static String queryByLabelUpForGrabs() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameUpForGrabs + "\"}";
    }

    public static String queryByLabelUpForGrabs2() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameUpForGrabs2 + "\"}";
    }

    public static String queryByLabelBeginnerFriendly() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameBeginnerFriendly + "\"}";
    }

    public static String queryByLabelBeginnerFriendly2() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameBeginnerFriendly2 + "\"}";
    }

    public static String queryByLabelFirstTimersOnly() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameFirstTimersOnly + "\"}";
    }

    public static String queryByLabelFirstTimersOnly2() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + getQueryVariableLabelNameFirstTimersOnly2 + "\"}";
    }

    public static String queryByLabelNewcomer() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameNewcomer + "\"}";
    }

    public static String queryByLabelNewComer() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameNewComer + "\"}";
    }

    public static String queryByLabelJumpIn() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameJumpIn + "\"}";
    }

    public static String queryByLabelJumpIn2() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameJumpIn2 + "\"}";
    }
}
