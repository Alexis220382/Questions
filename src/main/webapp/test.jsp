<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<p>В Германии существует тест для тех людей, кто попался пьяным за рулём. <br>
  Это так называемый тест на идиотизм. Редко кто его сдаёт без подготовки. <br>
  На этом определённые фирмы делают деньги, подготавливая попавшихся к сдаче. <br>
  Очень интересные вопросы, вот некоторые из них.</p>
<form action="/mine.form">
  <p><b><input type="text" name="login" value="Введите свое имя" /></b></p>
  <p><b>1. В некоторых месяцах 30 дней, в некоторых 31. В скольких месяцах в году 28 дней?</b><Br>
    <input type="radio" name="month" value="inallmonth"> Во всех месяцах<Br>
    <input type="radio" name="month" value="february"> В одном феврале<Br>
    <input type="radio" name="month" value="infour"> В четырех<Br>
  </p>
  <p><b>2. Что можно видеть с закрытыми глазами?</b><Br>
    <input type="radio" name="closeeyes" value="dreams"> Сны<Br>
    <input type="radio" name="closeeyes" value="nothing"> Ничего<Br>
    <input type="radio" name="closeeyes" value="bloodmagistral"> Кровеносные сосуды<Br>
  </p>
  <p><b>3. Что в огне не горит и в воде не тонет?</b><Br>
    <input type="radio" name="water" value="wood"> Дерево<Br>
    <input type="radio" name="water" value="ice"> Лед<Br>
    <input type="radio" name="water" value="shit"> Экскременты<Br>
  </p>
  <p><b>4. Что нужно делать, когда видишь зелёного человечка?</b><Br>
    <input type="radio" name="greenman" value="gohome"> Спрятаться дома и ждать пока он не уйдет<Br>
    <input type="radio" name="greenman" value="goinhospital"> Идти к наркологу<Br>
    <input type="radio" name="greenman" value="gothrowroad"> Переходить улицу (это рисунок на зеленом сигнале светофора)<Br>
  </p>
  <p><b>5. Назовите пять дней, не называя чисел (1, 2, 3,..) и названий дней (понедельник, вторник, среда…)?</b><Br>
    <input type="radio" name="dayofweek" value="impossible"> Это не выполнимо<Br>
    <input type="radio" name="dayofweek" value="yeaterday"> Позавчера, вчера, сегодня, завтра, послезавтра<Br>
    <input type="radio" name="dayofweek" value="holyday"> Предпредвыходной, предвыходной, выходной, послевыходной, послепослевыходной<Br>
  </p>
  <p><b>6. Из какой посуды нельзя ничего поесть?</b><Br>
    <input type="radio" name="utensils" value="dirty"> Из грязной<Br>
    <input type="radio" name="utensils" value="thin"> С тонким горлом<Br>
    <input type="radio" name="utensils" value="empty"> Из пустой<Br>
  </p>
  <p><b>7. На какой вопрос нельзя ответить «нет»?</b><Br>
    <input type="radio" name="no" value="run"> Ты бежишь?<Br>
    <input type="radio" name="no" value="here"> Ты здесь?<Br>
    <input type="radio" name="no" value="alive"> Ты жив?<Br>
  </p>
  <p><b>8. Сколько будет 2+2*2?</b><Br>
    <input type="radio" name="howmuch" value="six"> 6<Br>
    <input type="radio" name="howmuch" value="eight"> 8<Br>
    <input type="radio" name="howmuch" value="ten"> 10<Br>
  </p>
  <p><input type="submit" name="ok" value="Ответить" /></p>
</form>
</body>
</html>
