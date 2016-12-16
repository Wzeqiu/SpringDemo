<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }

        * body {
            background-color: #f2f2f2;
        }

    </style>
</head>
<body>

<c:forEach items="${itemsList }" var="item">
    <div style="float: left;width: 100%; height: 200px;">
      ${item.name }
        ${item.price }
        <fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
       ${item.detail }
       <a href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a>
    </div>
</c:forEach>
<%--</table>--%>
</body>
</html>