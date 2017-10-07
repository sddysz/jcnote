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

<link rel="stylesheet" href="/resource/css/css.css">
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
    <div id="divContent" class="rightbar">
        <ul class="infonews01" id="NewsList">
        </ul>
        <div style="text-align: center;">
            <ul class="pagenum">
                <li style="cursor:pointer" onclick="goPage(1)">首页</li>
                <li style="cursor:pointer" onclick="goPage(2)">上一页</li>
                <li style="cursor:pointer" onclick="goPage(3)">下一页</li>
                <li style="cursor:pointer" onclick="goPage(4)">末页</li>
                <li>当前<span id="curPage"></span>/<span id="pageCount"></span>页</li>
            </ul>
            <div class="page_goto">
                <span>转到</span>
                <input type="text" id="gotoPageIndex">
                <button style="cursor:pointer" type="button" onclick="goPage(5)"></button>
            </div>
        </div>
    </div>
</div>
<script>
    var type =${type};
    var totalpage;
    var curPage;
    function clickType(typeName) {
        location.href = "/nav_${content.type.menu.name}/" + typeName;
    }
    function goPage(index) {
        if (index == 1) {
            getPage(1, type);
        } else if (index == 2) {
            if (curPage > 1) {
                getPage(1, type);
            }

        } else if (index == 3) {
            if (curPage <=totalpage-1) {
                getPage(1, type);
            }
        } else if (index == 4) {
            getPage(totalpage, type);
        } else if (index == 5) {
            var pageNum = Number($("#gotoPageIndex").val());
            if (pageNum <= totalpage) {
                getPage(pageNum, type);
            }
        }
    }
    function getPage(pageNum, type) {
        $.get("/news/getList", {pageNumber: pageNum, type: type}, function (page) {
            $("#NewsList").empty();
            for (i = 0; i < page.content.length; i++) {
                item = page.content[i];
                var time = new Date(item.createTime);
                var m = moment(time);
                var li = "<a href='/infonews/" + item.id + "'> <li><div>" + item.title + "</div> <span>" + m.format("YYYY-MM-DD") + " </span></li> </a>";
                $("#NewsList").append(li);
            }

            $("#curPage").html(page.number + 1);
            $("#pageCount").html(page.totalPages);
            totalpage = page.totalPages;
            curPage = page.number + 1;
        });
    }

    $(document).ready(function () {
        getPage(1, ${type});
    });
</script>
</body>
</html>
