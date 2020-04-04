<%--
  Created by IntelliJ IDEA.
  User: otonashi
  Date: 2020/3/18
  Time: 下午 04:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<!Doctype HTML>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
  <h2 style="color: blue;">Congratulations!</h2>
  <p>
      Your answer: <span style="color: firebrick"><%= request.getAttribute("answer") %></span> is correct!
      <br>
      You are a professional baseball fan!
  </p>
</body>
</html>
