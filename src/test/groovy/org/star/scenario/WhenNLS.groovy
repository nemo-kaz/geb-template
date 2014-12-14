package org.star.scenario

import geb.spock.GebReportingSpec
import org.star.page.*


class WhenNLS extends GebReportingSpec {
    def "アラビア語もいける"() {
        given: "トップページにアクセスする"
        to TopPage
        when: "管理者としてログインすると"
        login "admin", "admin"
        then: ""
        // ログインする
        // TestTagページにアクセスする
        // Nameに乱数、Descriptionに"عالم مرحبا هناك"を入力する
        // 作成をクリックする
        // Tagリストに登録したタグが含まれるのを確認する
        /// "Filter Me"をクリックする
        /// Nameの"Equal To"を選択する
        /// 値をNameに使用した乱数を設定する
        /// "Apply"をクリックする
        /// 追加したタグが一覧に含まれる
    }
}
