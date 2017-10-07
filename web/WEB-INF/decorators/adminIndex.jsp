<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ include file="/common/taglibs.jsp" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>贝特姆大数据研究院 - 后台管理</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="/resource/bootstrap/css/bootstrap.min.css">
    <!-- Select2 -->
    <link rel="stylesheet" href="/resource/plugins/select2/select2.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="/resource/dist/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="/resource/dist/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/resource/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="/resource/dist/css/skins/_all-skins.min.css">
    <!-- iCheck for checkboxes and radio inputs -->
    <link rel="stylesheet" href="/resource/plugins/iCheck/all.css">
    <!-- Morris chart -->
    <link rel="stylesheet" href="/resource/plugins/morris/morris.css">
    <!-- jvectormap -->
    <link rel="stylesheet" href="/resource/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <!-- Date Picker -->
    <link rel="stylesheet" href="/resource/plugins/datepicker/datepicker3.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="/resource/plugins/daterangepicker/daterangepicker-bs3.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="/resource/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="/resource/plugins/html5shiv/html5shiv.min.js"></script>
    <script src="/resource/plugins/respond/respond.min.js"></script>
    <![endif]-->


    <!-- jQuery 2.1.4 -->
    <script src="/resource/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="/resource/plugins/jQueryUI/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
        $.widget.bridge('uibutton', $.ui.button);
    </script>
    <!-- Bootstrap 3.3.5 -->
    <script src="/resource/bootstrap/js/bootstrap.min.js"></script>
    <!-- Morris.js charts -->
    <script src="/resource/plugins/raphael/raphael-min.js"></script>
    <script src="/resource/plugins/morris/morris.min.js"></script>
    <!-- Sparkline -->
    <script src="/resource/plugins/sparkline/jquery.sparkline.min.js"></script>
    <!-- jvectormap -->
    <script src="/resource/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="/resource/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="/resource/plugins/knob/jquery.knob.js"></script>
    <!-- daterangepicker -->
    <script src="/resource/plugins/moment/moment.min.js"></script>
    <script src="/resource/plugins/daterangepicker/daterangepicker.js"></script>
    <!-- datepicker -->
    <script src="/resource/plugins/datepicker/bootstrap-datepicker.js"></script>
    <!-- Bootstrap WYSIHTML5 -->
    <script src="/resource/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <!-- Slimscroll -->
    <script src="/resource/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="/resource/plugins/fastclick/fastclick.min.js"></script>
    <!-- iCheck 1.0.1 -->
    <script src="/resource/plugins/iCheck/icheck.min.js"></script>
    <!-- Select2 -->
    <script src="/resource/plugins/select2/select2.full.js"></script>
    <!-- AdminLTE App -->
    <script src="/resource/dist/js/app.min.js"></script>
    <script src="/resource/framework/framework.js"></script>

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="/index" class="logo" style="padding-left: 0px;">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><img src="/resource/image/logo.png" style="height: 50px;"/></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><img src="/resource/image/logo.png" style=" margin-top: 0px"/></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu ">
                        <a href="javascript:void(0);" class="dropdown-toggle " data-toggle="dropdown">
                            <i class="fa fa-gears"></i>
                        </a>
                        <ul class="dropdown-menu setting" >
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="/admin/user/edit"><i class="fa fa-users text-aqua"></i>修改密码</a>
                                    </li>
                                    <li>
                                        <a href="/logout"><i class="fa fa-retweet text-red"></i>注销</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header"></li>
                <li class="active treeview">
                    <ul class="treeview-menu">
                        <li><a href="/admin/content/list"><i class="fa fa-circle-o"></i> 内容列表</a></li>
                        <li><a href="/admin/content/edit"><i class="fa fa-circle-o"></i> 添加内容</a></li>
                        <li><a href="/admin/contentType/list"><i class="fa fa-circle-o"></i> 二级菜单列表</a></li>
                        <li><a href="/admin/contentType/edit"><i class="fa fa-circle-o"></i> 添加二级菜单</a></li>
                        <li><a href="/admin/firstpage/banner"><i class="fa fa-circle-o"></i> Banner列表</a></li>
                        <li><a href="/admin/firstpage/news"><i class="fa fa-circle-o"></i> 新闻预览</a></li>
                        <li><a href="/admin/news/list"><i class="fa fa-circle-o"></i> 新闻列表</a></li>
                        <li><a href="/admin/news/edit"><i class="fa fa-circle-o"></i> 添加新闻</a></li>
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Main content -->
        <sitemesh:body>模板页，此区域需要被替换</sitemesh:body>
    </div><!-- /.content-wrapper -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0
        </div>
        <strong>Copyright &copy; 2016 <a href="http://www.bdmri.com">贝特姆大数据研究员</a>.</strong> All rights reserved.
    </footer>

</div><!-- ./wrapper -->


</body>
<script>
    $(".setting a").click(function(){
        var a = $(this);
        if(a.attr("href") != "#"){
            addTabs({ id: $(this).text(), title: $(this).text(), close: true, url:$(this).attr("href") });
            //点击设置菜单，打开tab后隐藏下拉菜单
            $(".setting").dropdown("toggle");
            return false;
        }
    });
    $(function(){
        $("[page-index]:not('.disabled')").click(function () {
            var pageNo = $(this).attr("page-index");
            $(":hidden[name=pageNumber]").val(pageNo);
            $("#mainForm").submit();
        });
    });
</script>
</html>