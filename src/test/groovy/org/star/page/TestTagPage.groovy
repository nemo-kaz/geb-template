package org.star.page

/**
 * Created by Xipf on 14/12/14.
 */
class TestTagPage {
    static url = "tag"
    static at = {
        //不変条件
        $("h1").text() == "Tagリスト"
    }
    static content = {
        header(required:true) {module NotLoginHeaderModule}
    }
    def login(username, password){
        header.name = username
        header.password = password
        header.login.click()
    }

}
