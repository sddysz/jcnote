<%--
  Created by IntelliJ IDEA.
  User: dongye
  Date: 2016/8/17
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ tag body-content="scriptless" pageEncoding="UTF-8" %>
<%@ attribute name="message" required="true" rtexprvalue="true" type="cn.dongyeshengzhen.framework.model.MsgModel" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${message != null}">
    <div class="alert <c:if test="${message.status == 1}">alert-success</c:if><c:if test="${message.status != 1}">alert-warning</c:if> alert-dismissable fade in">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
        <c:if test="${message.status != 1}"><h4><i class="icon fa fa-ban"></i>警告</h4></c:if>
        ${message.message}
    </div>
    <script type="text/javascript">
        setTimeout('$(".alert").alert("close");', 2000);
    </script>
</c:if>
