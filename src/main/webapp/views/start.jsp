<%--
  Created by IntelliJ IDEA.
  User: olegk
  Date: 21.08.2022
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div>

  <h1>Ты потерял память. Принять вызов НЛО?</h1>
</div>

<div>
  <div>
    <button onclick="location.href='/accept'">Принять вызов</button>
    <button onclick="location.href='/refuse'">Отклонить вызов</button>
  </div>
</div>
<br><br><br><br><br><br>
Статистика:
<%--<p>Имя игрока: <%= request.getParameter("name") %> </p>--%>
<p>Имя игрока: ${firstname} </p>
<p>Фамилия игрока: ${lastname} </p>
<p>Количество игр: ${count}</p>
<p>ip игрока: ${id}</p>


</body>
</html>
