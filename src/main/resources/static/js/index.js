$(function(){
	//注册接口
	$("#reg").click(function(){
		window.location.href="/user/init?flag=reg";
	});
	
	//登陆接口
	$("#login").click(function(){
		window.location.href="/user/init?flag=login";
	});
})