<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--自作クラスのインポートを忘れずに。
 ※パッケージに所属していないクラスはインポートできません--%>
<%@ page import="bean.MemberBean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	//⑦リクエストスコープからMemberインスタンスの取得
	MemberBean mb = (MemberBean)request.getAttribute("member");
	%>

<!-- ⑧結果表示用のHTMLの生成 -->
		<p>
		名前は<%=mb.getLastName() %><%=mb.getFirstName() %><br>
		メールは<%=mb.getMail() %><br>
		年齢は<%=mb.getAge() %>才<br>
		<%
		String gen;
		if(mb.getGender() == 0 ){
			gen = "男";
		} else if(mb.getGender() == 1) {
			gen = "女";
		} else {
			gen = "不明";
		}
		%>
		性別は<%=gen %>です<br>
		ログインIDは<%=mb.getId() %><br>
		パスワードは<%=mb.getPw() %><br>

<!-- おまけ→ <p><%= mb.showMyData() %></p>  -->

</body>
</html>