<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/9/6
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
</head>
<body>


<div id="subnav2" class="subnav2 container">

    <c:forEach items="${contentTypeList}" var="item">
        <div id="subnav${item.name}" onclick="clickType('${item.name}')"
             class="subnavclick <c:if test="${item.id eq content.type.id}">subnav2Selection</c:if>">
                ${item.displayName}
        </div>
    </c:forEach>


</div>
<div class="content container">
    <div class="leftbar">
        <ul>
            <li class="menu_selected"><a>${content.type.displayName}</a><i class="icon_downarrow"></i></li>
            <h1 id="ContentList" class="hideleftbar">
                <c:forEach items="${contentList}" var="item">
                    <li><a id="leftbarItem172" href="/nav_${item.type.menu.name}/${item.type.name}/${item.id}"
                           class="leftbarList <c:if test="${item.id eq content.id}" >hideleftbar_selected</c:if>">${item.title}</a>
                    </li>
                </c:forEach>

            </h1>
        </ul>
        <div class="menubg"></div>
    </div>
    <div id="divContent" class="rightbar"><h1>
        <span style="line-height:1.5;"><span style="line-height:1;"></span><span
                style="font-family:'Microsoft YaHei';">${news.title}</span></span>
    </h1>
        ${news.content}
    </div>
</div>
<script>

    function clickType(typeName) {
        location.href = "/nav_${content.type.menu.name}/" + typeName;
    }


</script>
</body>
</html>
