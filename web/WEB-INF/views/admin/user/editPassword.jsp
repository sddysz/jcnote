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
    <title></title>
</head>
<body>

<section class="content">

    <form id="form" action="/admin/user/save" method="post" class="form-horizontal">
        <div class="box box-solid">

            <div class="box-body">
                <h4>修改密码</h4>
                </div>
            </div>


        <div class="box box-solid">

            <div class="box-body">
                <div>
                    <div>

                        <div class="form-group col-sm-7">

                            <label for="oldpwd" class="col-sm-2 control-label">旧密码：</label>
                            <div class="col-sm-9">
                                <input id="oldpwd" name="oldpwd" class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group col-sm-7">

                            <label for="newPwd" class="col-sm-2 control-label">新密码：</label>
                            <div class="col-sm-9">
                                <input id="newPwd" name="newPwd" class="form-control" type="password">
                            </div>
                        </div>

                        <div class="form-group col-sm-7">

                            <label for="againPwd" class="col-sm-2 control-label">确认密码：</label>
                            <div class="col-sm-9">
                                    <input id="againPwd" name="againPwd" class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group col-sm-6">

                            <button type="button" id="subForm" class="btn btn-info pull-right">提交</button>
                        </div>

                    </div>
                </div>

            </div>
        </div>
    </form>
    <script>
        $("#subForm").click(function () {

            if($("#oldpwd").val()==""||$("#oldpwd").val()==undefined){
                alert("请输入旧密码");
                return false;
            }
            if($("#newPwd").val()==""||$("#oldpwd").val()==undefined){
                alert("请输入新密码");
                return false;
            }
            if($("#againPwd").val()==""||$("#oldpwd").val()==undefined){
                alert("请确认新密码");
                return false;
            }
            if($("#newPwd").val()!=$("#againPwd").val()){
                alert("两次输入的密码不一致");
                return false;
            }
            $("#form").submit();
        });
    </script>
</section>
</body>
</html>
