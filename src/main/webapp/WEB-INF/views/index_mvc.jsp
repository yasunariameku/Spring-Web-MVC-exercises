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
  <form:form action="result" modelAttribute="index_mvc">
    <div>
      名前：<form:input path="name" /><br>
      商品：<form:select path="product_id">
        <form:options items="${productList}" itemLabel="product_name" itemValue="product_id" />
      </form:select>
    </div>
    <form:button>送信</form:button>
  </form:form>
</body>
</html>
