<%--
  Created by IntelliJ IDEA.
  User: dysz
  Date: 2017-10-8
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>${userinfo.username}-Cloudnote</title>

    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap.css" rel="stylesheet">
    <link href="/resource/bower_components/bootstrap/dist/css/bootstrap-theme.css" rel="stylesheet">
    <link rel="stylesheet" href="/resource/bower_components/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resource/bower_components/Ionicons/css/ionicons.min.css">
    <link href="/resource/adminLTE/css/AdminLTE.css" rel="stylesheet">
    <link rel="stylesheet" href="/resource/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="/resource/plugins/jstree/themes/default/style.css">
    <link rel="stylesheet" href="/resource/css/note.css">

</head>
<body class="skin-blue sidebar-mini" style="height: auto; min-height: 100%;">
<div class="wrapper" style="height: auto; min-height: 100%;">

    <header class="main-header">

        <!-- Logo -->
        <a href="index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>C</b>DN</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Cloud</b>Note</span>
        </a>

        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>
            <!-- Navbar Right Menu -->
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">4</span>
                        </a>
                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-bell-o"></i>
                            <span class="label label-warning">10</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">You have 10 notifications</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                        </a>
                                    </li>

                                </ul>
                            </li>
                            <li class="footer"><a href="#">View all</a></li>
                        </ul>
                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-flag-o"></i>
                            <span class="label label-danger">9</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">You have 9 tasks</li>


                        </ul>
                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs"> Pierce</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    dysz

                                </p>
                            </li>
                            <!-- Menu Body -->

                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">Profile</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">Sign out</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- Control Sidebar Toggle Button -->
                    <li>
                        <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                    </li>
                </ul>
            </div>

        </nav>
    </header>

    <div class="content-wrapper" style="min-height: 960px;">

    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar" style="height: auto;">

            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat">
                  <i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu tree" data-widget="tree">
                <li class="header">MAIN NAVIGATION</li>
                <div id="container">

                </div>


            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->

        <!-- Content Header (Page header) -->
        <section class="content-header">

        </section>
        <div class="noteSplit" id="notebookSplitter"></div>
        <!-- Main content -->
        <div id="noteAndEditor" >

            <div id="noteList" >
                <div class="clearfix" id="notesAndSort" style="position: relative">
                    <div class="pull-left">

                        <div class="dropdown" id="myNotebookNavForListNav">
                            <a class="ios7-a">
                                <span id="curNotebookForListNote">最新</span>
                            </a>
                        </div>


                        <div class="dropdown" id="sharedNotebookNavForListNav" style="display: none">
                            <a class="ios7-a">
                                <span id="curSharedNotebookForListNote">最新</span>
                            </a>
                        </div>
                    </div>

                    <div class="pull-left" id="tagSearch"></div>

                    <div id="sortType">
                        <div class="dropdown">
                            <a class="ios7-a dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">
                                <i class="fa fa-th-list"></i>
                            </a>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                <li role="presentation"><a data-view="snippet" class="view-style view-snippet checked"
                                                           role="menuitem">
                                    <i class="fa fa-check"></i>
                                    摘要视图
                                </a></li>
                                <li role="presentation"><a data-view="list" class="view-style view-list"
                                                           role="menuitem">
                                    <i class="fa fa-check"></i>
                                    列表视图
                                </a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a data-sorter="dateCreatedASC"
                                                           class="sorter-style sorter-dateCreatedASC" role="menuitem">
                                    <i class="fa fa-check"></i>
                                    创建时间 <i class="fa fa-sort-alpha-asc"></i>
                                </a></li>
                                <li role="presentation"><a data-sorter="dateCreatedDESC"
                                                           class="sorter-style sorter-dateCreatedDESC" role="menuitem">
                                    <i class="fa fa-check"></i>
                                    创建时间 <i class="fa fa-sort-alpha-desc"></i>
                                </a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a data-sorter="dateUpdatedASC"
                                                           class="sorter-style sorter-dateUpdatedASC" role="menuitem">
                                    <i class="fa fa-check"></i>
                                    更新时间 <i class="fa fa-sort-alpha-asc"></i>
                                </a></li>
                                <li role="presentation"><a data-sorter="dateUpdatedDESC"
                                                           class="sorter-style sorter-dateUpdatedDESC checked"
                                                           role="menuitem">
                                    <i class="fa fa-check"></i>
                                    更新时间 <i class="fa fa-sort-alpha-desc"></i>
                                </a></li>
                                <li role="presentation" class="divider"></li>
                                <li role="presentation"><a data-sorter="titleASC" class="sorter-style sorter-titleASC"
                                                           role="menuitem">
                                    <i class="fa fa-check"></i>
                                    标题 <i class="fa fa-sort-alpha-asc"></i>

                                </a></li>
                                <li role="presentation"><a data-sorter="titleDESC" class="sorter-style sorter-titleDESC"
                                                           role="menuitem">
                                    <i class="fa fa-check"></i>
                                    标题 <i class="fa fa-sort-alpha-desc"></i>
                                </a></li>
                            </ul>
                        </div>
                    </div>
                </div>


                <div id="noteItemListWrap">
                    <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 100%;">
                        <ul id="noteItemList" style="overflow: hidden; width: auto; height: 100%;">
                            <li href="#" class="item item-my item-active" data-seq="0"
                                noteid="59e0c18582115d36c3000005">
                                <div class="item-blog"><i class="fa fa-bold" title="blog"></i></div>
                                <div class="item-setting"><i class="fa fa-cog" title="setting"></i></div>
                                <div class="item-desc"><p class="item-title"></p>
                                    <p class="item-info"><i class="fa fa-book"></i> <span
                                            class="note-notebook">123</span> <i class="fa fa-clock-o"></i> <span
                                            class="updated-time">2017-10-13 21:36:56</span></p>
                                    <p class="desc">发发发</p></div>
                            </li>



                        </ul>
                        <div class="slimScrollBar"
                             style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 7px; z-index: 99; right: 1px; height: 548px;"></div>
                        <div class="slimScrollRail"
                             style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div>
                    </div>
                </div>
            </div>

            <!-- Info boxes -->
        </div>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->




</div>
<!-- ./wrapper -->


<script src="/resource/bower_components/jquery/dist/jquery.js"></script>
<script src="/resource/bower_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="/resource/adminLTE/js/adminlte.js"></script>
<script src="/resource/plugins/jstree/jstree.js"></script>
<script src="/resource/js/note.js"></script>
<script>
    var totalpage = 1;
    var curPage = 1;

    $(function () {
        Resize.init();
        $('#container').on('changed.jstree', function (e, data) {
            notebookId = data.node.id;
            $.get("/note/getNotePage", {pageNumber: 1, notebookId: notebookId},
                function (data, status) {
                    totalpage = data.totalPages;
                    curPage = data.number + 1;
                    console.log(data);
                });


        }).jstree({

            "plugins": ["dnd", "contextmenu", "types", "themes", "state"],
            "types": {
                "default": {
                    "icon": false // 删除默认图标
                },
            },
            'core': {
                'data': {
                    "url": "/notebook/getList",
                    "dataType": "json"
                },
                "themes": {"stripes": true},
                "check_callback": true
            }
        });
    });

</script>
</body>
</html>
