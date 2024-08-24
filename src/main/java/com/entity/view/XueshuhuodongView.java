package com.entity.view;

import com.entity.XueshuhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学术活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@TableName("xueshuhuodong")
public class XueshuhuodongView  extends XueshuhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshuhuodongView(){
	}
 
 	public XueshuhuodongView(XueshuhuodongEntity xueshuhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, xueshuhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
