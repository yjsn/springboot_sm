package com.ly.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.common.Constants;
import com.ly.entity.User;
import com.ly.service.UserService;

/**
 * @Description:用户对外接口提供服务层
 * @author liuyang
 * @data  2017-6-17 上午10:10:32
 *
 */
@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;
	
	/**
	 * 用户注册接口
	 * @param user 用户信息对象
	 * @return 返回json数据
	 */
	@ResponseBody
	@RequestMapping("/add")
	public String addUser(User user){
		//注册参数较验
		if(null == user || StringUtils.isBlank(user.getUserName()) || 
				StringUtils.isBlank(user.getUserPwd()))//必填参数较验不通过
			return returnBaseResult(Constants.RESULT_CODE_CHECK_FAIL, "用户名密码不能为空");
		boolean result = userService.addUser(user);
		if(result) return returnBaseResult(Constants.RESULT_CODE_SUCCESS, "注册成功");
		return returnBaseResult(Constants.RESULT_CODE_FAIL, "注册失败，数据保存异常");
	}
}
