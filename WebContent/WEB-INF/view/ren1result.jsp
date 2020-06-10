<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--自作クラスのインポートを忘れずに。
 ※パッケージに所属していないクラスはインポートできません--%>
<%@ page import="bean.ren1bean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	ren1bean mb = (ren1bean)request.getAttribute("member");
	%>

<!-- ⑧結果表示用のHTMLの生成 -->
		<p>
		<h1>学籍番号:<%=mb.getGakuseki() %></h1><br>
		<h1>名前:<%=mb.getName() %></h1><br>

</body>
</html>