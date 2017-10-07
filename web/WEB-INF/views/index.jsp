<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhaoq
  Date: 2016/3/16
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<div class="flexslider">
    <ul class="slides">
        <c:forEach items="${banners}" var="item">
            <li>
                <a href="${item.url}"><img
                        src="${item.path}" draggable="false"></a></li>
        </c:forEach>
    </ul>


</div>
<div class="container">
    <div class="float_news container">
        <div id="marquee5">

            <ul id="newsList" style="height: 1140px;">
                <c:forEach items="${newsList}" var="news">
                    <c:choose>
                        <c:when test="${news.type eq 0}">
                            <li><a href="${news0Url}" class="news_tag01"><h1>公</h1>
                                <h2><span>NEWS</span>
                                    <p>司新闻</p></h2>
                            </a>
                                <a href="/infonews/${news.id}">${news.title}</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="${news0Url}" class="news_tag01 news_tag02"><h1>行</h1>
                                <h2><span>NEWS</span>
                                    <p>业动态</p></h2>
                            </a>
                                <a href="/infonews/${news.id}">${news.title}</a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </ul>
        </div>
    </div>
    <ul class="i_content i_content01">
        <c:forEach items="${newsUp}" var="item">
            <li>
                <i style="background: url(${item.path})" onclick="javascript:void(0);"></i>
                <a href="${item.url}">${item.title}</a>
                <div>
                    <p>${item.text}</p>
                </div>
            </li>
        </c:forEach>
    </ul>
    <a href="http://www.creawor.com/content.aspx?cateId=56&amp;id=172" class="center_banner"><img
            src="/resource/image/center_banner01.jpg"></a>
    <ul class="i_content i_content01">
        <c:forEach items="${newsDown}" var="item">
            <li>
                <i style="background: url(${item.path})" onclick="javascript:void(0);"></i>
                <a href="${item.url}">${item.title}</a>
                <div>
                    <p>${item.text}</p>
                </div>
            </li>
        </c:forEach>
    </ul>
</div>
<script>
    $(function () {
        $('.flexslider').flexslider({
            directionNav: true,
            pauseOnAction: true
        });
        //滚动新闻
        $('#marquee5').kxbdSuperMarquee({
            isEqual: false,
            distance: 57,
            time: 4,
            direction: 'up'
        });
    });
</script>

</body>

</html>
