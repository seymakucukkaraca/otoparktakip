<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>yonetici login</title>
    <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body{
            background-color:black;
        }

        .login-container{

            margin-top: 3%;
            margin-bottom: 3%;
        }
        .login-form-1{
            padding: 5%;
            box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.9), 0 10px 45px 0 rgba(0, 0, 0, 0.40);
        }
        .login-form-1 h1{
            text-align: center;
            color: #333;
        }

        .login-form-2 h3{
            text-align: center;
            color: #fff;
        }
        .login-container form{
            padding: 3%;

        }
        .btnSubmit
        {
            margin-left: 10px;
            width: 90%;
            border-radius: 1rem;
            padding: 1.5%;
            border: none;
            cursor: pointer;
        }
        .login-form-1 .btnSubmit{
            font-weight: 900;
            color: #fff;
            margin:auto;
            background-color: black;
        }
        .login-form-2 .btnSubmit{
            font-weight: 900;
            color: royalblue;
            background-color:black;
        }

        .login-form-1 {
            color: royalblue;
            font-weight: 900;
            text-decoration: none;
        }
    </style>
<body background="https://cdn.bmwblog.com/wp-content/uploads/2019/08/BMW-X6-Vantablack-4.jpg">
    <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
</body>
<div class="container login-container">
    <div class="row">
        <div class="col-md-12 login-form-1">
            <h1 align="center" style="color: black">YÖNETİCİ GİRİŞ</h1>
            <spring:url value="/yonetici/yonetici" var="loginURL" />
            <form:form modelAttribute="yonetici" method="post" action="${loginURL}" cssClass="form" >
                <div class="form-group">
                    <input type="text" name="kullaniciadi" class="form-control" placeholder="Kullanıcı Adınızı Giriniz" value="" />
                </div>
                <div class="form-group">
                    <input type="password" name="sifre" class="form-control" placeholder="Şifrenizi Giriniz" value="" />
                </div>
                <div class="form-group">
                    <input type="submit" class="btnSubmit" value="GİRİŞ" style="width: 100%" />
                </div>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
