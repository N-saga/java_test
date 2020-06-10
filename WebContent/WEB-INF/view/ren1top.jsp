<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録画面</title>
</head>
<body>
	<form action="/RequestScopeSample/ren1servlet" method="post">
		学籍番号：<input type="text" name="gakuseki"><br>
		名前：<input type="text" name="name"><br>
		<input type="submit" value="送信">
	</form>

</body>
</html>