<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="js/jquery-1.4.3.js"></script>
    <script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
<form action="/mine.form">
<%request.getParameter("login");%>
<span id="span1">В Германии существует тест для тех людей, кто попался пьяным за рулём. <br />
  Это так называемый тест на идиотизм. Редко кто его сдаёт без подготовки. <br />
  На этом определённые фирмы делают деньги, подготавливая попавшихся к сдаче. <br />
  Очень интересные вопросы, вот некоторые из них.<br />
  <b><input type="text" name="login" value="Введите свое имя" /></b><br />
<input onclick="set_html1();" type="submit" value="Начать тест" /></span>
</form>
</body>
</html>