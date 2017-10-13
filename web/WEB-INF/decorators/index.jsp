<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="keywords" content="cloudnote,dysz,东野升振">
    <meta name="description" content="dysz' cloudnote!">
    <meta name="author" content="dysz">
    <title>
        <sitemesh:title> </sitemesh:title>CloudNote
    </title>

    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap.css" rel="stylesheet">
    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap-theme.css" rel="stylesheet">
    <script>
        function log(o) {
        }
    </script>
</head>

<body class="lang-zh">

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">CloudNote</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">首页 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">菜单1</a></li>
                <li class="dropdown">
                    <a href="#">菜单2 </a>
                </li>
            </ul>
            <c:if test="${empty userInfo or empty userInfo.username}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">注册</a></li>
                    <li >
                        <a href="/login">登录</a>
                    </li>
                </ul>
            </c:if>


            <c:if test="${not empty userInfo and not empty userInfo.username}">
                <ul class="nav navbar-nav navbar-right">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">${userInfo.username} <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/note">进入笔记</a></li>
                            <li><a href="/logout">退出</a></li>
                        </ul>
                    </li>
                </ul>
            </c:if>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<sitemesh:body></sitemesh:body>

<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>Version</b> 0.0.1
    </div>
    <strong>Copyright © 2017-2017 <a href="https://#">dysz' cloudnote</a>.</strong> All rights
    reserved.
</footer>


<script src="/resource/bower_components/jquery/dist/jquery.js"></script>
<script src="/resource/bower_components/bootstrap/dist/js/bootstrap.js"></script>


</body>

</html>