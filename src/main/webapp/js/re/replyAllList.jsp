<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/6/14
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>留言回复</title>
</head>
<body>
  <table border="1" cellpadding="4px" cellspacing="0px">
      <tr>
          <td>留言编号</td>
          <td>留言数目</td>
          <td>留言内容</td>
          <td>留言作者</td>
          <td>留言时间</td>
          <td>操作</td>
      </tr>
      <c:forEach items="${reply_details}" var="re">
          <tr>
              <td>${re.rid}</td>
              <td>${re.invid}</td>
              <td>${re.content}</td>
              <td>${re.author}</td>
              <td>${re.createdate}</td>
              <td><a href="saveRe.jsp">添加留言</a></td>
          </tr>
      </c:forEach>
      
  </table>
</body>
</html>
