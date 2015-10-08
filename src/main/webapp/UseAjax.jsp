<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="js/start.js"></script>
</head>
<body>
    <%if (request.getParameter("button1") == null
            && request.getParameter("button2") == null
            && request.getParameter("button3") == null
            && request.getParameter("button4") == null
            && request.getParameter("button5") == null
            && request.getParameter("button6") == null
            && request.getParameter("button7") == null
            && request.getParameter("button8") == null){%>
        <form action="/attribute.form">
            <p>В Германии существует тест для тех людей, кто попался пьяным за рулём. <br />
                Это так называемый тест на идиотизм. Редко кто его сдаёт без подготовки. <br />
                На этом определённые фирмы делают деньги, подготавливая попавшихся к сдаче. <br />
                Очень интересные вопросы, вот некоторые из них. <br /><br />
                Введите свое имя и нажмите кнопку "Сдать тест". <br />
                <input type="text" name="login" /><br />
            <input type="submit" name="button1" value="Сдать тест" onclick="start()" /></p>
        </form>
    <%} else {%>
        <% if (request.getParameter("button1") != null){%>
            <p>${questions1}</p>
        <%} else {%>
            <% if (request.getParameter("button2") != null){%>
                <p>${questions2}</p>
            <%} else {%>
                <% if (request.getParameter("button3") != null){%>
                    <p>${questions3}</p>
                <%} else {%>
                    <% if (request.getParameter("button4") != null){%>
                        <p>${questions4}</p>
                    <%} else {%>
                        <% if (request.getParameter("button5") != null){%>
                            <p>${questions5}</p>
                        <%} else {%>
                            <% if (request.getParameter("button6") != null){%>
                                <p>${questions6}</p>
                            <%} else {%>
                                <% if (request.getParameter("button7") != null){%>
                                    <p>${questions7}</p>
                                <%} else {%>
                                    <% if (request.getParameter("button8") != null){%>
                                        <p>${questions8}</p>
                                    <%}%>
                                <%}%>
                            <%}%>
                        <%}%>
                    <%}%>
                <%}%>
            <%}%>
        <%}%>
    <%}%>
</body>
</html>
