<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>ParkAlani</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
    <spring:url value="/aracGiris/addAracGiris" var="addURL" />
    <h2>Yeni Arac Giris Ekle</h2>

    <form:form modelAttribute="parkAlaniForm" method="post" action="${addURL}" cssClass="form" >
        <form:hidden path="id"/>

        <div class="form-group">
            <label>Sıra</label>
            <form:input path="tc" cssClass="form-control" id="tc" />
        </div>

        <div class="form-group">
            <label>Doluluk Oranı</label>
            <form:input path="dolulukOrani" cssClass="form-control" id="dolulukOrani" />
        </div>

        <button type="submit" class="btn btn-success">Yeni Araç Giriş Ekle</button>
    </form:form>

</div>
</body>
</html>