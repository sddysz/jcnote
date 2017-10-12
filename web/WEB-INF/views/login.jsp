<%--
  Created by IntelliJ IDEA.
  User: dysz
  Date: 2017-10-8
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="keywords" content="cloudnote,dysz,东野升振">
    <meta name="description" content="dysz' cloudnote!">
    <meta name="author" content="dysz">
    <title>login</title>

    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap.css" rel="stylesheet">
    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/resource/bower_components/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="/resource/bower_components/Ionicons/css/ionicons.css" rel="stylesheet">
    <link href="/resource/plugins/iCheck/square/blue.css" rel="stylesheet">
    <link href="/resource/adminLTE/css/alt/AdminLTE-bootstrap-social.css" rel="stylesheet">
    <link href="/resource/adminLTE/css/AdminLTE.css" rel="stylesheet">
    <link href="/resource/css/login.css" rel="stylesheet">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>CloudNote</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>

        <form action="/login" method="post">
            <div >
                <p class="text-red">${error}</p>
            </div>
            <div class="form-group has-feedback">
                <input  name='username' type="username" class="form-control" placeholder="Email">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input name="password" type="password" class="form-control" placeholder="Password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <div class="icheckbox_square-blue" aria-checked="false" aria-disabled="false" style="position: relative;"><input type="checkbox" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div> Remember Me
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <div class="social-auth-links text-center">
            <p>- OR -</p>
            <a href="#" class="btn btn-block btn-social btn-weixin btn-flat"><i class="fa fa-weixin"></i> Sign in using
                WeChat</a>
            <a href="#" class="btn btn-block btn-social btn-qq btn-flat"><i class="fa fa-qq"></i> Sign in using
                QQ</a>
        </div>
        <!-- /.social-auth-links -->

        <a href="#">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 2.2.3 -->
<script src="/resource/bower_components/jquery/dist/jquery.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="/resource/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="/resource/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });
</script>



<script>

</script>
</body>

</html>