<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><sitemesh:title></sitemesh:title></title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <![endif]-->
    <link rel="stylesheet" href="/resource/css/css2.css">

    <!-- jQuery 2.1.4 -->
    <script src="/resource/js/jquery-1.7.2.min.js"></script>
    <!-- jQuery UI 1.11.4 -->

    <script type="text/javascript" src="/resource/js/common.js"></script>
    <script type="text/javascript" src="/resource/js/jquery.flexslider-min.js"></script>
    <script type="text/javascript" src="/resource/js/Marquee.js"></script>
    <script type="text/javascript" src="/resource/plugins/moment/moment.min.js"></script>
    <sitemesh:head></sitemesh:head>
    <style>
        @media only screen and (max-width: 768px) {
            .slides li {
                height: 90px !important;
            }

            .slides li:nth-of-type(1) {
                background: url() no-repeat !important;
                background-size: 100% auto !important;
            }
        }
    </style>
</head>
<body bgcolor="#F0F0F0">
<dy:menu></dy:menu>


<sitemesh:body></sitemesh:body>


<div style="display: none; right: 10px;" class="back-to" id="toolBackTop">
    <a title="返回顶部" onclick="window.scrollTo(0,0);return false;"
       href="http://www.creawor.com/content.aspx?cateId=57#top" class="back-top">
        返回顶部</a>
</div>
<div class="frilinkbg">
    <div class="container frilink">
        <dy:footer></dy:footer>
        <dl class="fri_r" style="padding-left: 45px;width: 440px;">
            <dt>
            <h1>联系我们</h1>
            <div>联系电话：13361217116 </div>
            <div>电子邮箱：<a style="color: white" href="mailto:QingDaoBDM@126.com">QingDaoBDM@126.com</a></div>
            <div>微信号:qingdaobtm</div>
            <div>公司地址：青岛市市南区南京路2号绮丽大厦1502</div>
            </dt>
            <dd>
                <img src="/resource/image/ewm.png">
            </dd>
        </dl>
    </div>
</div>
<div class="footerbg">
    <div class="container footer">
        <img src="/resource/image/logo01.png">
        <div style="margin-top:27px;">版权所有 	青岛贝特姆大数据研究院有限公司  鲁ICP备15013205号-1 Copyright 2015-2016 Bdmri All Rights Reserved
            <br>
            <div style="margin-top:0;">
                <img src="/resource/image/beian.png" style="margin-top: 0;">
                <a target="_blank" href="javascrip:void(0)"
                   style="display:inline-block;text-decoration:none;height:20px;line-height:20px;"><img
                        src="" style="float:left;">
                    <p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">鲁ICP备15013205号-1</p></a></div>
        </div>
    </div>
</div>
<style>
    .back-to A {
        COLOR: #3354aa;
        TEXT-DECORATION: none;
        BORDER-BOTTOM: 0px;
        BORDER-LEFT: 0px;
        PADDING-BOTTOM: 0px;
        MARGIN: 0px;
        OUTLINE-style: none;
        OUTLINE-COLOR: invert;
        PADDING-LEFT: 0px;
        OUTLINE-WIDTH: 0px;
        PADDING-RIGHT: 0px;
        BACKGROUND: none transparent scroll repeat 0% 0%;
        FONT-SIZE: 100%;
        VERTICAL-ALIGN: baseline;
        BORDER-TOP: 0px;
        BORDER-RIGHT: 0px;
        PADDING-TOP: 0px
    }

    .back-to A:hover {
        BORDER-BOTTOM: medium none;
        COLOR: #444
    }

    .back-to {
        Z-INDEX: 999;
        POSITION: fixed;
        WIDTH: 110px;
        BOTTOM: 35px;
        OVERFLOW: hidden;
        RIGHT: 10px
    }

    .back-to .back-top {
        TEXT-INDENT: -9999em;
        OUTLINE-style: none;
        OUTLINE-COLOR: invert;
        OUTLINE-WIDTH: 0px;
        WIDTH: 40px;
        DISPLAY: block;
        BACKGROUND: url(/resource/image/back-top.png) no-repeat 0px 0px;
        FLOAT: right;
        HEIGHT: 40px;
        MARGIN-LEFT: 10px
    }

    .back-to .back-top:hover {
        BACKGROUND-POSITION: -40px 0px
    }

    @media only screen and (max-width: 768px) {
        .back-to .back-top {
            TEXT-INDENT: -9999em;
            OUTLINE-style: none;
            OUTLINE-COLOR: invert;
            OUTLINE-WIDTH: 0px;
            WIDTH: 30px;
            DISPLAY: block;
            BACKGROUND: url(/resource/image/back-top_mi.png) no-repeat 0px 0px;
            FLOAT: right;
            HEIGHT: 30px;
            MARGIN-LEFT: 10px
        }

        .back-to .back-top:hover {
            BACKGROUND-POSITION: -30px 0px
        }

        .online_qqbox {
            display: none;
        }
    }
</style>
<meta name="format-detection" content="telephone=no">
<script type="text/javascript">
    $(document).ready(function () {
        var menu = 2;
        if (menu != -1)
            $("#nav0" + menu).addClass("nav_a_selected");
    });

    $(document).ready(function () {
        var bt = $('#toolBackTop');
        var sw = $(document.body)[0].clientWidth;

        var limitsw = (sw - 840) / 2 - 80;
        if (limitsw > 0) {
            limitsw = parseInt(limitsw);
            bt.css("right", 10);
        }

        $(window).scroll(function () {
            var st = $(window).scrollTop();
            if (st > 30) {
                bt.show();
            } else {
                bt.hide();
            }
        });
    })
</script>
<script>

    var _cId = 16;
    var _cateId = 56;
    var _inId = "0";
    $(function () {
        if (_cId == 16) {
            $("#topImg").css("display", "none");
        }
        //if (_cId == 19) {
        //    $("#subnav2").css("display","none");
        //}

        $("#subnav2Div" + _cateId).addClass("subnav2Selection");
        function changeSelectSubNav2(_id) {
            if (_id == 72) {
                location.href = "infonews.aspx";
            } else {
                location.href = "content.aspx?cateId=" + _id;
            }
        }

        function ToggleCode(obj, codeurl) {
            $(obj).children("img").eq(0).attr("src", codeurl + "?time=" + Math.random());
            return false;
        }
    })

</script>

</body>
</html>