package org.star.scenario

import geb.spock.GebReportingSpec
import org.star.page.TestCasePage
import org.star.page.TestTagPage

/**
 * テストケースに複数タグを設定し登録した後、編集を行う
 */
class WhenEditTestCase extends GebReportingSpec {
    def "テストケース編集時に登録した通りに編集画面に表示される"() {
        //トップページに移動し、管理者としてログイン
        given: "トップページに移動し、管理者としてログイン"
        //タグ作成画面に移動
        to TestTagPage
        when: "タグ作成画面にアクセス"
        login "admin", "admin"
        then: "タグ作成画面が表示される"
        at TestTagPage
//        when: "Name(タグ１)を入力"
//        and: "Description(タグ１)を入力"
//        and: "作成ボタンをクリック"
//        then: "タグ１が登録されている"
//        when: "Name(タグ２)を入力"
//        and: "Description(タグ２)を入力"
//        and: "作成ボタンをクリック"
//        then: "タグ２が登録されている"
//        when: "テストケースページに移動"
//        to TestCasePage
//        then: "テストケースページに移動されていること"
//        at TestCasePage
//        when: "Name(ケース１)を入力"
//        and: "Scenario(シナリオ１)を入力"
//        and: "Tags(タグ１、タグ２)を選択"
//        and: "作成をクリック"
//        then: "Nameにケース１が入力されているか"
//        and: "Scenarioにシナリオ１が入力されているか"
//        and: "Tagsにタグ１、タグ２が選択されているか"


    }
}
