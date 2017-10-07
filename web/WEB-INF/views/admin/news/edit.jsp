<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>编辑内容</title>
</head>
<body>

<section class="content">

    <form id="form" action="/admin/news/save?id=${news.id}" method="post" class="form-horizontal">
        <div class="box box-solid">
            <div class="btn-group">
                <button type="button" class="btn btn-default" onclick="history.back()">返回</button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="submit" class="btn btn-info">提交</button>
            </div>
        </div>

        <div class="box box-solid">

            <div class="box-body">
                <div class="row">
                    <div>

                        <div class="form-group col-sm-7">

                            <label for="title" class="col-sm-2 control-label">标题：</label>
                            <div class="col-sm-9">
                                <input id="title" name="title" class="form-control" value="${news.title}">
                            </div>
                        </div>


                        <div class="form-group col-sm-7">
                            <label for="type" class="col-sm-2 control-label">类型：</label>
                            <div class="col-sm-9">
                                <select id="type" name="type" class="form-control" value="${news.type}">
                                    <option value="0">新闻</option>
                                    <option value="1">动态</option>
                                </select>
                            </div>
                        </div>


                        <div class="form-group col-sm-12">
                            <div class="col-sm-12">
                                <script id="container" name="content" style="height:500px;margin:0px auto;"
                                        type="text/plain">${news.content}</script>
                                <script src="/resource/ueditor/ueditor.config.js" type="text/javascript"></script>
                                <script src="/resource/ueditor/ueditor.all.min.js" type="text/javascript"></script>
                                <!-- 实例化编辑器 -->
                                <script type="text/javascript">
                                    var ue = UE.getEditor('container');
                                    ue.setHeight(500);
                                </script>
                            </div>
                        </div>


                    </div>
                </div>

            </div>
        </div>

    </form>
</section>
</body>
</html>
