package org.star.page

import geb.Page

class DashBoardPage extends Page{
    static url = "home"
    static at = {
        //不変条件
        $("h1").text() == "Dash Board"
    }

    static content = {
    }
}
