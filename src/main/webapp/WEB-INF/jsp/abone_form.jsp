<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Add Abone</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
    <spring:url value="/abone/addAbone" var="addURL" />
    <h2>Yeni Abone Ekle</h2>

    <form:form modelAttribute="aboneForm" method="post" action="${addURL}" cssClass="form" >
        <form:hidden path="id"/>


        <div class="form-group">
            <label>Ad</label>
            <form:input path="ad" cssClass="form-control" id="ad" />
        </div>

        <div class="form-group">
            <label>Soyad</label>
            <form:input path="soyad" cssClass="form-control" id="soyad" />
        </div>

        <div class="form-group">
            <label>Tc No</label>
            <form:input path="tc" cssClass="form-control" id="tc" />
        </div>

        <div class="form-group">
            <label>Telefon Numarası</label>
            <form:input path="telefonno" cssClass="form-control" id="telefonno" />
        </div>

        <div class="form-group">
            <label>Başlangıç Tarihi</label>
            <form:input path="baslangictarihi" type="date" cssClass="form-control"  id="baslangictarihi" name="trip-start"/>
        </div>

        <div class="form-group">
            <label>Bitiş Tarihi</label>
            <form:input path="bitistarihi" type="date" cssClass="form-control"  id="bitistarihi" name="trip-start"/>
        </div>

        <div class="form-group">
            <label>Konum</label>
            <form:input path="konum" cssClass="form-control" id="konum" />
        </div>

        <div class="form-group">
            <label>Plaka</label>
            <form:input path="plaka" cssClass="form-control" id="plaka" />
        </div>



        <button type="submit" class="btn btn-success">Yeni Abone Ekle</button>
    </form:form>

</div>

</body>
</html>