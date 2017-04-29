<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<h1 class="text-center"><a href="${contextPath}index">Poetry</a> </h1>

<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="post" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Admin Page ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>
    </c:if>
</div>

<form action="${contextPath}/admin" method="post" >
    <input type="text" name="name" placeholder="Name"/><p/>
    <textarea placeholder="poem" name="poem" cols="40" rows="3"></textarea><p/>
    <input type="author" name="author" placeholder="Author"/><p/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <button type="submit">Submit</button>
</form>

</body>
</html>