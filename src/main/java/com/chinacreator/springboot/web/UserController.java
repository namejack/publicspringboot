package com.chinacreator.springboot.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.chinacreator.springboot.entity.UserBean;
import com.chinacreator.springboot.mapper.UserMapper;
/**
 * 
 * @author hua.tamg
 *
 */
@RestController
@RequestMapping("user/")
public class UserController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/getUserList")
	public JSONObject getUserList() {
		JSONObject json = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		List<UserBean> list = userMapper.getAll();
		System.out.println(list);
		map.put("data", list);
		json.put("result", map);
		return json;
	}
}
