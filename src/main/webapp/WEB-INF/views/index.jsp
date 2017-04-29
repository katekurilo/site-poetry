<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; ISO-8859-1;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Poetry MK</title>
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>
<h1 class="title-site">Poetry</h1>

<h1 class="links"><a href="${contextPath}welcome">My page</a> </h1>
<div class="links">
    <h4><a href="${contextPath}/login">Log in</a> |
        <a href="${contextPath}/registration">Create an account</a></h4>
</div>


<c:if test="${not empty poems}">

    <c:forEach items="${poems}" var="poem">
        <div id="poem-box">
                <div id="title"> ${poem.name}</div>
            <br>
                <div id="poem">${poem.poem}</div>
            <br>
                <div><i>(${poem.author})</i></div>
            <br>
        </div>
    </c:forEach>
</c:if>



</body>
</html>
