<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
  <h1>何か値の表示</h1>
  <div>何かしろ値：<n:write name="testValue" /></div>
  <h1>全コードの表示</h1>
  <c:forEach var="code" items="${allCode}">
    <div>
      <n:write name="code.codeId" />:<n:write name="code.codeName" />
    </div>
  </c:forEach>
  <h1>ID指定コードの表示</h1>
  <c:forEach var="code" items="${codeList}">
  <div>
    <n:write name="code.codeId" />:<n:write name="code.codeName" />
  </div>
</c:forEach>
</body>
</html>
