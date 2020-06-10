<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録画面</title>
</head>
<body>
	【あなたの情報を入力してください。】<br>
	<form action="/RequestScopeSample/result" method="post">
		苗字：<input type="text" name="sei"><br>
		名前：<input type="text" name="mei"><br>
		mail：<input type="email" name="mail"><br>
		年齢：<input type="text" name="age"><br>
		性別：
		<input type="radio" name="gender" value="0">男性
		<input type="radio" name="gender" value="1">女性<br>
		<br>
		【登録するIDとPWを入力してください。】<br>
		ユーザID：<input type="text" name="id"><br>
		PW：<input type="password" name="pw"><br>
		<input type="submit" value="送信">
	</form>

</body>
</html>