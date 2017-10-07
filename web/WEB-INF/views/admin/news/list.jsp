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
    <title>新闻列表</title>
</head>
<body>
<d:message message="${message}"></d:message>
<section class="content">

    <form id="form" action="" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="box-body no-padding">
                <h2>新闻列表</h2>
            </div>
        </div>
        <div class="box box-solid">

            <div class="box-body">


                <!-- Check all button -->

                <div class="btn-group">


                    <a href="/admin/news/edit" class="btn btn-default btn-sm checkbox-toggle"><i
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
                            <th>类型</th>
                            <th>更新时间</th>
                            <th>创建时间</th>
                        </tr>
                        <c:forEach items="${newsList}" var="item">
                            <tr>
                                <td><input type="checkbox" name="checkSelect" value="${item.id}"
                                           id="checkSelect_${item.id}"/></td>
                                <td><a href="/admin/news/edit?id=${item.id}" class="btnView"
                                       title="${item.title}">${item.title}</a>&nbsp;</td>
                                <td>${item.type}</td>
                                <td>${item.updateTime}&nbsp;</td>
                                <td>${item.createTime}&nbsp;</td>
                                <td>&nbsp;</td>
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
