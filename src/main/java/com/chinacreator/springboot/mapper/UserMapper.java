package com.chinacreator.springboot.mapper;

import java.util.List;
import com.chinacreator.springboot.entity.UserBean;

/**
 * @author hua.tang
 * 
 * @version ����ʱ�䣺2021-9-1 ����12:40:18
 * 
 *          ��˵��
 */
public interface UserMapper {
	//@Select("select user_Name userName from td_sm_user")
	List<UserBean> getAll();
}
