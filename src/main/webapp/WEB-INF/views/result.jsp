<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Web MVC Test</title>
</head>
<body>
  <p>結果画面</p>
  <p>${fn:escapeXml(name)}さんが下記の商品を選択しました</p>
  <p>商品：${fn:escapeXml(products.product_name)}</p>
  <p>金額：${fn:escapeXml(products.price)}</p>
  <a href="index_mvc">戻る</a>
</body>
</html>