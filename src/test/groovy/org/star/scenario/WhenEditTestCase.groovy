package org.star.scenario

import geb.spock.GebReportingSpec

/**
 * テストケースに複数タグを設定し登録した後、編集を行う
 */
class WhenEditTestCase extends GebReportingSpec {
    def "テストケース編集時に登録した通りに編集画面に表示される"() {
        //タグ作成画面に移動
        //Name(タグ１)を入力
        //Description(タグ１)を入力
        //作成ボタンをクリック

        //Name(タグ２)を入力
        //Description(タグ２)を入力
        //作成ボタンをクリック

        //テストケース画面に移動
        //Name(ケース１)を入力
        //Scenario(シナリオ１)を入力
        //Tags(タグ１、タグ２)を選択
        //作成をクリック

        //作成したテストケースの編集画面を表示
        //Nameにケース１が入力されているか
        //Scenarioにシナリオ１が入力されているか
        //Tagsにタグ１、タグ２が選択されているか


    }
}
