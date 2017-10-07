/**
 * Created by zhaoq on 2016/4/6.
 */
$(function(){
    $("[page-index]:not('.disabled')").click(function () {
        var pageNo = $(this).attr("page-index");
        $(":hidden[name=pageNumber]").val(pageNo);
        $("#mainForm").submit();
    });
});
