<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <meta charset="utf-8">

</head>
<body>
<h2>文件上传</h2>
<form action="upload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file">
    <input type="submit" value="提交">
</form>



</body>
</html>