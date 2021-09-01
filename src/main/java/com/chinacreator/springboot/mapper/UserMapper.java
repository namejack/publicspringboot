package com.chinacreator.springboot.mapper;

import java.util.List;
import com.chinacreator.springboot.entity.UserBean;

/**
 * @author hua.tang
 * 
 * @version 创建时间：2021-9-1 下午12:40:18
 * 
 *          类说明
 */
public interface UserMapper {
	//@Select("select user_Name userName from td_sm_user")
	List<UserBean> getAll();
}
