<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/6/14
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-1.11.0.js">
    </script>


</head>
<body>
<h1 align="center">午间新闻</h1>
<div  align="center">
     <form action="${pageContext.request.contextPath}/invitationController/selectAll1" method="post" id="myForm">
         <p>标题：<input type="text" name="title" value="${params.title}">
             <input id="pn" type="hidden" name="pageNum"  value="${params.pageNum}" />

                 <input type="submit" value="搜索">  </p>

     </form>

</div>

<table  border="1" cellspacing="0px" cellpadding="4px" width="80%" align="center">
    <tr>
        <td>编号</td>
        <td>标题</td>
        <td>内容</td>
        <td>作者</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="invitation">
        <tr>

            <td>${invitation.id}</td>
            <td>${invitation.title}</td>
            <td>${invitation.summry}</td>
            <td>${invitation.author}</td>
            <td>${invitation.createdate}</td>
            <td><a href="${pageContext.request.contextPath}/reply_detail/replyAll?rid=${invitation.rid}">查看留言</a></td>
            <td>
               <a href="${pageContext.request.contextPath}/invitationController/deleteById/${invitation.id}">删除</a>||
               </td>
        </tr>

    </c:forEach>

</table>
<table align="center" >
    <tr>
        <td><a href="javascript:toPage(1);">首页</a> </td>
        <td><a href="javascript:toPage(${pageInfo.pageNum>1?pageInfo.pageNum-1:1});">上一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pageNum<pageInfo.pages?pageInfo.pageNum+1:pageInfo.pages});">下一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pages});">尾页</a></td>
       <%-- <td>
            <select id="pageSize" onchange="toPage(1)">
                <option value="2" <c:if test="${pageInfo.pageSize==2}">selected</c:if> >2</option>
                <option value="3" <c:if test="${pageInfo.pageSize==3}">selected</c:if> >3</option>
            </select>
        </td>--%>
        <td>第${pageInfo.pageNum}页||第${pageInfo.pages}页</td>
    </tr>
</table>
</body>
<script type="text/javascript">
    function toPage(v) {


        //给pageNum设值
        $("#pn").val(v);
        //提交表单
        $("#myForm").submit();

    }

</script>

<%--<table align="center" >
    <tr>
        <td><a href="javascript:toPage(1);">首页</a> </td>
        <td><a href="javascript:toPage(${pageInfo.pageNum-1});">上一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pageNum+1});">下一页</a></td>
        <td><a href="javascript:toPage(${pageInfo.pages});">尾页</a></td>
        <td>
            <select id="pageSize" onchange="toPage(1)">
              <option value="2" <c:if test="${pageInfo.pageSize==2}">selected</c:if> >2</option>
                <option value="3" <c:if test="${pageInfo.pageSize==3}">selected</c:if> >3</option>
            </select>
        </td>
        <td>第${pageInfo.pageNum}页||第${pageInfo.pages}页</td>
    </tr>
</table>
</body>
<script type="text/javascript">
   function toPage(pageNum) {
       //获取每页显示的条数
       var ps=$("#pageSize").val();
       //给pageSize设值
       $("#ps").val(ps);
       //给pageNum设值
       $("#pn").val(pageNum);
       //提交表单
       $("#myForm").submit();

   }

</script>--%>
</html>
