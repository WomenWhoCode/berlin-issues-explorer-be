package com.wwc.explorer.query;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueryIssuesByLabelTest {

    @Test
    public void test_graphQL_search_query() {
        assertEquals("{\"query\":\"query queryIssue($labelName: String!) {search( query:$labelName, type: ISSUE, last:100){edges{cursor node{... on Issue{ id  title  url labels(last:100) { edges { node { name } } }repository { name url primaryLanguage{ name } }              }       }    }  }}\", \"variables\" : \"{\\\"labelName\\\" : \\\"label:\\\\\\\"good first issue\\\\\\\"  state:open\\\"}\"}",
                QueryIssuesByLabel.queryByLabelGoodFirstIssue());
    }
}
