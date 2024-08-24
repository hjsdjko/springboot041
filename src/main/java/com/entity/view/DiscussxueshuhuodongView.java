package com.entity.view;

import com.entity.DiscussxueshuhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学术活动评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
@TableName("discussxueshuhuodong")
public class DiscussxueshuhuodongView  extends DiscussxueshuhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxueshuhuodongView(){
	}
 
 	public DiscussxueshuhuodongView(DiscussxueshuhuodongEntity discussxueshuhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, discussxueshuhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
