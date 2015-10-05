function set_html1() {
    $('#span1').html('<form action="/mine.form"><span id="span2"><b>1. В некоторых месяцах 30 дней, в некоторых 31. В скольких месяцах в году 28 дней?</b><br />' +
        '<input type="radio" name="month" value="inallmonth"> Во всех месяцах<br />' +
        '<input type="radio" name="month" value="february"> В одном феврале<br />' +
        '<input type="radio" name="month" value="infour"> В четырех<br />' +
        '<input onclick="set_html2();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 0 вопросов<br />' +
        'Осталось ответить на 8 вопросов</span></form>');
}
function set_html2(){
    $('#span2').html('<form action="/mine.form"><span id="span3"><b>2. Что можно видеть с закрытыми глазами?</b><br />' +
        '<input type="radio" name="closeeyes" value="dreams"> Сны<br />' +
        '<input type="radio" name="closeeyes" value="nothing"> Ничего<br />' +
        '<input type="radio" name="closeeyes" value="bloodmagistral"> Кровеносные сосуды<br />' +
        '<input onclick="set_html3();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 1 вопрос<br />' +
        'Осталось ответить на 7 вопросов</span></form>');
}
function set_html3(){
    $('#span3').html('<form action="/mine.form"><span id="span4"><b>3. Что в огне не горит и в воде не тонет?</b><br />' +
        '<input type="radio" name="water" value="wood"> Дерево<br />' +
        '<input type="radio" name="water" value="ice"> Лед<br />' +
        '<input type="radio" name="water" value="shit"> Экскременты<br />' +
        '<input onclick="set_html4();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 2 вопроса<br />' +
        'Осталось ответить на 6 вопросов</span></form>');
}
function set_html4(){
    $('#span4').html('<form action="/mine.form"><span id="span5"><b>4. Что нужно делать, когда видишь зелёного человечка?</b><br />' +
        '<input type="radio" name="greenman" value="gohome"> Спрятаться дома и ждать пока он не уйдет<br />' +
        '<input type="radio" name="greenman" value="goinhospital"> Идти к наркологу<br />' +
        '<input type="radio" name="greenman" value="gothrowroad"> Переходить улицу (это рисунок на зеленом сигнале светофора)<br />' +
        '<input onclick="set_html5();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 3 вопроса<br />' +
        'Осталось ответить на 5 вопросов</span></form>');
}
function set_html5(){
    $('#span5').html('<form action="/mine.form"><span id="span6"><b>5. Назовите пять дней, не называя чисел (l, 2, 3,..) и названий дней (понедельник, вторник, среда…)?</b><br />' +
        '<input type="radio" name="dayofweek" value="impossible"> Это не выполнимо<br />' +
        '<input type="radio" name="dayofweek" value="yeaterday"> Позавчера, вчера, сегодня, завтра, послезавтра<br />' +
        '<input type="radio" name="dayofweek" value="holyday"> Предпредвыходной, предвыходной, выходной, послевыходной, послепослевыходной<br />' +
        '<input onclick="set_html6();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 4 вопросов<br />' +
        'Осталось ответить на 4 вопроса</span></form>');
}
function set_html6(){
    $('#span6').html('<form action="/mine.form"><span id="span7"><b>6. Из какой посуды нельзя ничего поесть?</b><br />' +
        '<input type="radio" name="utensils" value="dirty"> Из грязной<br />' +
        '<input type="radio" name="utensils" value="thin"> С тонким горлом<br />' +
        '<input type="radio" name="utensils" value="empty"> Из пустой<br />' +
        '<input onclick="set_html7();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 5 вопросов<br />' +
        'Осталось ответить на 3 вопроса</span></form>');
}
function set_html7(){
    $('#span7').html('<form action="/mine.form"><span id="span8"><b>7. На какой вопрос нельзя ответить «нет»?</b><br />' +
        '<input type="radio" name="no" value="run"> Ты бежишь?<br />' +
        '<input type="radio" name="no" value="here"> Ты здесь?<br />' +
        '<input type="radio" name="no" value="alive"> Ты жив?<br />' +
        '<input onclick="set_html8();" type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 6 вопросов<br />' +
        'Осталось ответить на 2 вопроса</span></form>');
}
function set_html8(){
    $('#span8').html('<form action="/mine.form"><span><b>8. Сколько будет 2+2*2?</b><br />' +
        '<input type="radio" name="howmuch" value="six"> 6<br />' +
        '<input type="radio" name="howmuch" value="eight"> 8<br />' +
        '<input type="radio" name="howmuch" value="ten"> 10<br />' +
        '<input type="submit" value="Следующий вопрос" /><br />' +
        'Отвечено на 7 вопросов<br />' +
        'Осталось ответить на 1 вопрос</span></form>');
}
