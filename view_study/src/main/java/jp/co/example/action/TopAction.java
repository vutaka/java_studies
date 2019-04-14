package jp.co.example.action;

import jp.co.example.util.ExampleUtil;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

/**
 * 
 */
public class TopAction {

    /**
     * @param request リクエストコンテキスト
     * @param context HTTPリクエストの処理に関連するサーバ側の情報
     * @return HTTPレスポンス
     */
    public HttpResponse index(HttpRequest request, ExecutionContext context) {

        return new HttpResponse("/WEB-INF/view/index.jsp");
    }


}
