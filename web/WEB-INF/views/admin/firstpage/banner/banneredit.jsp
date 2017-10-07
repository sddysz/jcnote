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
    <title>编辑Banner</title>

    <style>
        .img-thumbnail{
            max-height: 3px;
            max-width: 50px;
        }
    </style>
</head>

<body>

<section class="content">

    <form id="form" action="/admin/firstpage/banner/save?id=${banner.id}" method="post" class="form-horizontal">
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
                                <input id="title" name="title" class="form-control" value="${banner.title}">
                            </div>
                        </div>

                        <div class="form-group col-sm-7">

                            <label for="title" class="col-sm-2 control-label">URL：</label>
                            <div class="col-sm-9">
                                <input id="url" name="url" class="form-control" value="${banner.url}">
                            </div>
                        </div>

                        <div class="form-group col-sm-7">

                            <label for="upload" class="col-sm-2 control-label">图片：</label>
                            <div class="col-sm-9">
                                <input type="file" id="upload" name="upload" class="form-control">
                                <input type="hidden" id="path" name="path" value="${banner.path}">
                            </div>
                        </div>

                        <div class="col-xs-6 col-md-3">
                            <img id="imageView" src="${banner.path}" alt="请上传图片" class="img-thumbnail" style=" max-height: 80px;max-width: 150px;">
                        </div>

                        <div class="form-group col-sm-7">

                            <label for="orderId" class="col-sm-2 control-label">排序：</label>
                            <div class="col-sm-9">
                                <input id="orderId" name="orderId" type="number" class="form-control "
                                       value="${banner.orderId}">
                            </div>
                        </div>


                    </div>
                </div>
            </div>
        </div>
        </div>
        <script type="application/javascript" src="/resource/uploader/ajaxfileupload.js?t=2"></script>
        <script>

            var file_input_change = function () {

                var files = $("#upload")[0].files;
                if (files.length < 1) {
                } else {
                    upload();
                }
            }
            $("#upload").change(file_input_change);
            function upload() {
                $.ajaxFileUpload({
                    url: '/files/upload',//用于文件上传的服务器端请求的Action地址
                    type: "post",//请求方法
                    secureuri: false,//一般设置为false
                    fileElementId: 'upload',//文件id属性
                    dataType: "JSON",//返回值类型 一般设置为json,一定要大写,否则可能会出现一些bug
                    success: function (msg) {
                        var json = eval("(" + $(msg).text() + ")");
                        $("#imageView").attr("src", json.localPath);
                        $("#path").val(json.localPath);
                    },
                    error: function (data, status) {
                    }
                });
                $("#upload").change(file_input_change);
            }
        </script>
    </form>
</section>
</body>
</html>
