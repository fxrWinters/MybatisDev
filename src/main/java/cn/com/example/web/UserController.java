package cn.com.example.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.example.entity.User;
import cn.com.example.service.UserServcie;

@Controller
@RequestMapping("/admin/user")
public class UserController {
	@Autowired
	private UserServcie userService;
	
	/**
	 * ÐÂ½¨
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/create.do", method = RequestMethod.POST)
	@ResponseBody
	public void create(HttpServletRequest request, HttpServletResponse response) {
		String userName = StringUtils.defaultIfBlank(request.getParameter("userName"), "guest");
		
		User user = new User();
		user.setName(userName);
		
		userService.create(user);
	}
}
