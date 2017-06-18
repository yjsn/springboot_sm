<!DOCTYPE html>  
  
<html lang="en">  
<head> 
	<meta charset="utf-8" /> 
	<title>欢迎页面</title> 
	<style> 
	body{ text-align:center} 
	.div{ margin:0 auto; width:400px; height:200px; border:1px solid #000;font-size:20px} 
	/* css注释：为了观察效果设置宽度 边框 高度等样式 */ 
	</style> 
</head> 
<body>  
    <h2>
      hello word
    </h2>
    
    <div class="div">
    	<div>
    		请填写注册信息
    	</div>
    	<div>
    		<form id="register">
    			<div><input name="userName" value="" placeholder="请填写用户名"/></div>
    			<div><input name="userPwd" value="" placeholder="密码"/></div>
    			<div><input name="confirmPwd" value="" placeholder="确认密码"/></div>
    			<div><input id="submit" type="button" value="注册"></div>
    		</form>
    	</div>
    </div>
    
    <script type="text/javascript" src="../js/jquery-3.2.0.min.js"></script>
    <script type="text/javascript" src="../js/user.js"></script>
</body>  
 
</html>  