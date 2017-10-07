$(function(){
	//主导航
	$(".singleNav").mouseover(function(){
		$(".navhidebg").slideUp(500);
	});
	$(".mainNav").mouseover(function(){
		var navId=$(this)[0].id;
		$(".navhide div").hide();
		$(".navhide div[for='"+navId+"']").show();
		$(".navhidebg").slideDown(500);
	});
	$(".navbox").mouseleave(function(){
		$(".navhidebg").slideUp(500)
	});

	//汉堡菜单
	$(".icon_menu").toggle(function(){
		$(".menuhide div").slideDown(200);
	},function(){
		$(".menuhide div").slideUp(200);
	})
	$(".menuhide h1").hide();
	$(".menuhide_span").click(function(){
		$(this).siblings().children("h1").slideUp(200);
		$(this).children("h1").slideDown(200);
	})

	//隐藏内容列表下拉
	$(".menu_selected").show();
	$(".icon_downarrow").toggle(function(){
		$(".hideleftbar").slideDown(200);
		$(".icon_downarrow").css("background","url(/image/icon_arrowu.png) center no-repeat");
	},function(){
		$(".menu_selected").siblings().slideUp(200);
		$(".icon_downarrow").css("background","url(/image/icon_arrowd.png) center no-repeat");
	})
});