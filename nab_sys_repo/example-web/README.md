# 何をするものか

Nablarchの提供するシステムリポジトリの利用方法を学ぶためのもの。
https://nablarch.github.io/docs/LATEST/doc/application_framework/application_framework/libraries/repository.html

# やってること

なんらかの文字列を返却するExampleUtilの内容をプロファイルごとに切り替えている。

TopAction#indexからExampleUtil#getValueを呼び出し、取得した値を画面に表示している。

## プロファイルと設定されている実装クラス

|プロファイル|設定されている実装クラス|設定しているファイル|
|-|-|-|
|-(main)|`jp.co.example.util.DateExampleProvider`|`main/resources/web-component-configuration.xml`|
|development|なし(mainが使用される)|なし|
|development2|`jp.co.example.util.FixedExampleProvider`|`env/dev2/resources/db-for-webui_dev.xml`|
|development3|`jp.co.example.util.SettingExampleProvider`|`env/dev3/resources/db-for-webui_dev.xml`|

## 動作確認

以下のコマンドをそれぞれ実行し、画面の文字を確認しましょう
* mvn clean compile waitt:run
* mvn -P development2 clean compile waitt:run
* mvn -P development3 clean compile waitt:run

# 演習

## 1. 実装クラスの作成と設定

以下の実装クラスを作成・設定し、画面に表示させましょう
* `jp.co.example.util.ExampleProvider`を継承する
* プロパティを二つ持ちxmlから設定できる
* `getValue`で連結した文字列を表示する。

## 2. Util含め一から自分で作る

以下のものを実装しましょう。

よくある要求である単体テストでは固定の値を返却するAPIを用意し、それ以降のテストでは本来の取得元から値を取得できるよう実装する。

あくまでこれは演習用の問題です。Nablarchはコードに対する管理機能はここよりもいいものがあります。

### interfase
* `CodeNameManager` インターフェース
* 全ての `jp.co.example.entity.CodeName` を返却する `getAllCodeNames`
* 指定したCodeIdに一致する `jp.co.example.entity.CodeName` を返却する `getCodeNames(String)`
### Utilクラス
* `CodeUtil` クラス
* staticなメソッドのみ提供するためコンストラクタは `private` にすること
* システムリポジトリの `CodeNameManager` を取得する。`getManager()`
* `getAllCodeNames` : 取得した `CodeNameManager` の 同名メソッドに処理を委譲する
* `getCodeNames(String)` : 取得した `CodeNameManager` の 同名メソッドに処理を委譲する
### 各実装クラス
以下の二つの実装クラスを用意すること
* DBのコードTからデータを取得する `DbCodeNameManager`
* 設定ファイルに設定した内容からデータを取得する `MockCodeNameManager`

# H2に格納されているデータを確認する方法

以下の手順で確認する。

1.「mvn waitt:run」でアプリを起動している場合は終了させる。

2.h2/bin/h2.batを実行する。

3.しばらく待つとブラウザが起動するので、各項目に以下の通りに入力し、[Connect]ボタンをクリックする。

| 項目     | 値                  |
|:---------|:--------------------|
|JDBC URL  |jdbc:h2:../db/SAMPLE |
|User Name |SAMPLE               |
|Password  |SAMPLE               |

4.左側のペインのテーブル名をクリックすると、クリックしたテーブルに対するSELECT文が生成される。

5.[Run]ボタンをクリックすると、生成したSELECT文が実行され、テーブルのデータを確認することができる。

6.使用終了時は、左上のdisconnectボタン(赤色で書かれたアイコンのボタン)をクリックして切断する。
  **切断を忘れると、WebアプリからH2に接続できなくなる。**
