<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/8/17
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/taglibs.jsp" %>
<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ attribute name="id" required="true" rtexprvalue="true" %>
<%@ attribute name="accept" required="false" rtexprvalue="true" %>
<%@ attribute name="callback" required="false" rtexprvalue="true" %>
<%@ attribute name="failCallback" required="false" rtexprvalue="true" %>
<%@ attribute name="selectedCallback" required="false" rtexprvalue="true" %>
<%@ attribute name="cancelCallback" required="false" rtexprvalue="true" %>
<%@ attribute name="startUploadCallback" required="false" rtexprvalue="true" %>
<div class="input-group input-group-sm">
    <input type="text" id="${id}_fileName" readonly class="form-control">
    <input type="file" id="${id}_file" name="upload" style="display: none"
           accept="${accept}">
                    <span class="input-group-btn">
                      <button id="${id}_picker" class="btn btn-primary btn-flat" type="button">选择文件</button>

                    </span>
</div>


<script type="application/javascript" src="/resource/upload/ajaxfileupload.js?t=2"></script>
<script type="text/javascript">


    $("#${id}_picker").click(function () {
        $("#${id}_file").trigger("click");
    });
    var file_input_change = function () {

        var files = $("#${id}_file")[0].files;
        if (files.length < 1) {
            $("#${id}_fileName").val("");
            var cancelCallback = window["${cancelCallback}"];
            (cancelCallback && typeof cancelCallback == "function") && cancelCallback();
        } else {
            $("#${id}_fileName").val(files[0].name);
            var selectedCallback = window["${selectedCallback}"];
            (selectedCallback && typeof selectedCallback == "function") && selectedCallback(files[0].name);
            ${id}upload();
        }
    }
    $("#${id}_file").change(file_input_change);

    function ${id}upload() {
        var startUploadCallback = window["${startUploadCallback}"];
        (startUploadCallback && typeof startUploadCallback == "function") && startUploadCallback();
        $.ajaxFileUpload({
            url: '/files/upload',//用于文件上传的服务器端请求的Action地址
            type: "post",//请求方法
            secureuri: false,//一般设置为false
            fileElementId: '${id}_file',//文件id属性
            dataType: "JSON",//返回值类型 一般设置为json,一定要大写,否则可能会出现一些bug
            success: function (msg) {
                var json = eval("(" + $(msg).text() + ")");
                var callback = window["${callback}"];
                (callback && typeof callback == "function") && callback(json);
            },
            error: function (data, status) {
                var failCallback = window["${failCallback}"];
                (failCallback && typeof failCallback == "function") && failCallback(data, status);
            }
        });
        $("#${id}_file").change(file_input_change);
    }

</script>
