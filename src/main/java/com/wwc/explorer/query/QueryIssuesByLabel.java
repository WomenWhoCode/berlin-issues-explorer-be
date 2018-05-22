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

    public static String queryByLabelGoodFirstIssue() {
        return "{\"query\":\"" + request + "\", \"variables\" : \"" + queryVariableLabelNameGoodFirstIssue + "\"}";
    }
}
