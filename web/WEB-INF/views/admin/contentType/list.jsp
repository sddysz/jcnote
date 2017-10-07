<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="d" tagdir="/WEB-INF/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/9/12
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二级菜单</title>
</head>
<body>

<section class="content">

    <form id="form" action="" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="box-body no-padding">
                <h2>二级菜单列表</h2>
            </div>
        </div>
        <div class="box box-solid">

            <div class="box-body">


                <!-- Check all button -->

                <div class="btn-group">


                    <a href="/admin/contentType/edit" class="btn btn-default btn-sm checkbox-toggle"><i
                            class="fa fa-plus"></i>新建</a>
                </div><!-- /.btn-group -->

            </div>
        </div>

        <div class="box box-solid">

            <div class="box-body no-padding">

                <div class="table-responsive mailbox-messages">
                    <table class="table table-hover table-striped">
                        <tbody>
                        <tr>
                            <th>名称</th>
                            <th>URL名称</th>
                            <th>所属菜单</th>
                            <th style="width: 60px">操作</th>
                        </tr>
                        <c:forEach items="${contentTypeList}" var="item">
                            <tr>
                                <td><a href="/admin/contentType/edit?id=${item.id}" class="btnView"
                                       title="${item.displayName}">${item.displayName}</a>&nbsp;</td>
                                <td>${item.name}</td>
                                <td>${item.menu.displayName}</td>
                                <td><a href="/admin/contentType/delete?id=${item.id}">删除</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table><!-- /.table -->
                </div><!-- /.mail-box-messages -->
            </div>
        </div>

    </form>
</section>
</body>
</html>
