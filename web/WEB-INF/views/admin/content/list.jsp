<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="d" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="dy" uri="http://www.dongyeshengzhen.cn/tags/form" %>

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
    <title>内容列表</title>
</head>
<body>
<section class="content">

    <form id="mainForm" action="/admin/content/list" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="box-body no-padding">
                <h2>内容列表</h2>
            </div>
        </div>
        <div class="box box-solid">

            <div class="box-body">


                <!-- Check all button -->

                <div class="btn-group">


                    <a href="/admin/content/edit" class="btn btn-default btn-sm checkbox-toggle"><i
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
                            <th><input type="checkbox" name="checkAll" id="checkSelect" value="全选"/></th>
                            <th>标题</th>
                            <th>所属菜单</th>
                            <th>类型</th>

                            <th>更新时间</th>
                            <th>是否发布</th>
                            <th style="width: 60px">删除</th>
                        </tr>
                        <c:forEach items="${contentList}" var="item">
                            <tr>
                                <td><input type="checkbox" name="checkSelect" value="${item.id}"
                                           id="checkSelect_${item.id}"/></td>
                                <td><a href="/admin/content/edit?id=${item.id}" class="btnView"
                                       title="${item.title}">${item.title}</a>&nbsp;</td>
                                <td>${item.type.menu.displayName}</td>
                                <td>${item.type.displayName}&nbsp;</td>
                                <td>${item.updateTime}&nbsp;</td>
                                <td><c:if test="${item.isDisplay eq 1}">是</c:if><c:if test="${item.isDisplay !=1}">否</c:if></td>
                                <td><c:if test="${(item.isNews != 1)&&(item.isNews != 0)}"><a href="/admin/content/delete?id=${item.id}">删除</a></c:if></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table><!-- /.table -->

                </div><!-- /.mail-box-messages -->
                <div class="box-footer ">
                    <dy:pageData data="${page}"></dy:pageData>
                </div>
            </div>
        </div>

    </form>
</section>
</body>
</html>
