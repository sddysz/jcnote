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


        <div id="mainContainer" class="clearfix">


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
            <div class="noteSplit" id="notebookSplitter"></div>

            <div id="noteAndEditor">

                <div id="noteList">
                    <div class="clearfix" id="notesAndSort" style="position: relative">
                        <div class="pull-left">
                            <!-- 我的笔记本 -->
                            <div class="dropdown" id="myNotebookNavForListNav">
                                <a class="ios7-a">
                                    <span id="curNotebookForListNote">msg . all</span>
                                </a>
                            </div>

                            <!-- 共享的笔记本 -->
                            <div class="dropdown" id="sharedNotebookNavForListNav" style="display: none">
                                <a class="ios7-a">
                                    <span id="curSharedNotebookForListNote">msg . all</span>
                                </a>
                            </div>
                        </div>
                        <!-- tag search -->
                        <div class="pull-left" id="tagSearch"></div>
                        <!-- sort type -->
                        <div id="sortType">
                            <div class="dropdown">
                                <a class="ios7-a dropdown-toggle" id="dropdownMenu1"
                                   data-toggle="dropdown">
                                    </i><i class="fa fa-th-list"></i>
                                </a>
                                <ul class="dropdown-menu" role="menu"
                                    aria-labelledby="dropdownMenu1"
                                >
                                    <li role="presentation"><a data-view="snippet" class="view-style view-snippet"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Snippet View
                                    </a></li>
                                    <li role="presentation"><a data-view="list" class="view-style view-list"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        List View
                                    </a></li>
                                    <li role="presentation" class="divider"></li>
                                    <li role="presentation"><a data-sorter="dateCreatedASC"
                                                               class="sorter-style sorter-dateCreatedASC"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Date Created <i class="fa fa-sort-alpha-asc"></i>
                                    </a></li>
                                    <li role="presentation"><a data-sorter="dateCreatedDESC"
                                                               class="sorter-style sorter-dateCreatedDESC"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Date Created <i class="fa fa-sort-alpha-desc"></i>
                                    </a></li>
                                    <li role="presentation" class="divider"></li>
                                    <li role="presentation"><a data-sorter="dateUpdatedASC"
                                                               class="sorter-style sorter-dateUpdatedASC"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Date Updated <i class="fa fa-sort-alpha-asc"></i>
                                    </a></li>
                                    <li role="presentation"><a data-sorter="dateUpdatedDESC"
                                                               class="sorter-style sorter-dateUpdatedDESC checked"
                                                               role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Date Updated <i class="fa fa-sort-alpha-desc"></i>
                                    </a></li>
                                    <li role="presentation" class="divider"></li>
                                    <li role="presentation"><a data-sorter="titleASC"
                                                               class="sorter-style sorter-titleASC" role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Title <i class="fa fa-sort-alpha-asc"></i>

                                    </a></li>
                                    <li role="presentation"><a data-sorter="titleDESC"
                                                               class="sorter-style sorter-titleDESC" role="menuitem">
                                        <i class="fa fa-check"></i>
                                        Title <i class="fa fa-sort-alpha-desc"></i>
                                    </a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- 笔记列表 -->
                    <!-- wrap 为了slimScroll -->
                    <div id="noteItemListWrap">
                        <ul id="noteItemList">


                        </ul>
                    </div>
                </div>

                <div class="noteSplit" id="noteSplitter"></div>
                <div class="editor_container">
                <textarea name="editor" id="editor" rows="10" cols="80">

            </textarea>
                </div>
            </div>
        </div>
    </div>

</div>
<!-- ./wrapper -->


<script src="/resource/bower_components/jquery/dist/jquery.js"></script>
<script src="/resource/bower_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="/resource/adminLTE/js/adminlte.js"></script>
<script src="/resource/plugins/jstree/jstree.js"></script>
<script src="/resource/js/note.js"></script>
<script src="/resource/plugins/template.js"></script>
<script src="/resource/bower_components/ckeditor/ckeditor.js"></script>

<script>
    var totalpage = 1;
    var curPage = 1;
    var ckeditor;
    $(function () {
        Resize.init();
        $('#container').on('changed.jstree', function (e, data) {
            notebookId = data.node.id;
            $.get("/note/getNotePage", {pageNumber: 1, notebookId: notebookId},
                function (noteList, status) {
                    totalpage = data.totalPages;
                    curPage = data.number + 1;
                    //var template = require('template_js')

                    noteList = noteList.content;
                    html = '';
                    if (noteList && noteList.length > 0) {
                        noteList.forEach(function (note, index) {
                            html = html + '   <li href="#" class="item item-my" data-seq="1" ' +
                                '        noteid="' + note.noteId +
                                '">' +
                                '        <div class="item-blog"><i class="fa fa-bold" title="blog"></i></div>' +
                                '        <div class="item-setting"><i class="fa fa-cog" title="setting"></i></div>' +
                                '        <div class="item-desc"><p class="item-title">' + note.title + '</p>' +
                                '            <p class="item-info"><i class="fa fa-book"></i> <span' +
                                '                    class="note-notebook">'+note.notebook.notebookId+'</span> <i class="fa fa-clock-o"></i> <span' +
                                '                    class="updated-time">' + note.updatedTime + '</span></p>' +
                                '            <p class="desc">' + note.updatedTime +
                                '                </p></div>' +
                                '    </li>';
                        })
                    }
                    $("#noteItemList").html(html);
                    $(".item").click(function () {
                        console.log("clcik");
                        noteid = $(this)[0].getAttribute("noteid");

                        $.get("/note/getNote", {noteId: noteid}, function (data) {
                            $("#editor").val(data.content.content);




                            if (ckeditor) ckeditor.destroy(true);
                            ckeditor = CKEDITOR.replace("editor");
                        })
                    })
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
        ckeditor = CKEDITOR.replace('editor', {height: '480px', width: '100%'});
    });





</script>
</body>
</html>
