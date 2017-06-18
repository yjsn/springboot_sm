$(function(){
	//用户点击注册
	$("#submit").click(function(){
		var userName=$("#register input[name='userName']").val();
		var userPwd=$("#register input[name='userPwd']").val();
		var confirmPwd=$("#register input[name='confirmPwd']").val();
		var data={};
		if(check(userName, userPwd, confirmPwd)){
			data['userName']=userName;
			data['userPwd']=userPwd;
			$.ajax(
		        	{
		            type:"post",
		            url:'/user/add',
		            dataType:"json",
		            contentType: 'application/json',
		            data:JSON.stringify(data),
		            async:false,
		            processData:false,                       
		            success:function(result)
		            {
		            	if(result.code=="0000"){
		            		alert("注册成功");
		            	}else{
		            		alert(result.message);
		            	}
		            },
		        })
		}
		
	});
	
	function check(userName,userPwd,confirmPwd){
		if(userName==""){
			alert("用户名不能为空");
			return false;
		}
		
		if(userPwd==""){
			alert("密码不能为空");
			return false;
		}
		
		if(confirmPwd==""){
			alert("确认密码不能为空");
			return false;
		}
		
		if(userPwd != confirmPwd){
			alert("两次输入密码不相同");
			return false;
		}
		return true;
	}
})