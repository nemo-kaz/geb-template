package org.star.scenario

import geb.spock.GebReportingSpec
import org.star.page.*


class WhenNLS extends GebReportingSpec {
    def "アラビア語もいける"() {
        given: "管理者としてログインする"
        to TopPage
        login "admin", "admin"
        at DashBoardPage
        when: "TestTagページにアクセスする"
        and: "Nameに乱数、Descriptionに'عالم مرحبا هناكを入力する"
        and: "'作成'をクリックする"
        then: "'Tag(id:xx)を作成しました。'のメッセージが表示される"
        when: "'Filter Me'をクリックする"
        and: "Nameの'Equal To'を選択する"
        and: "値をNameに使用した乱数を設定する"
        and: "'Apply'をクリックする"
        then: "追加したタグが一覧に含まれる"
    }
}
