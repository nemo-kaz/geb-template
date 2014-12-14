package org.star.page

/**
 * Created by Xipf on 14/12/14.
 */
class TestCasePage {
    static url = "testCase"
    static at = {
        //不変条件
        $("h1").text() == "Test Caseリスト"
    }

    static content = {
    }
}
