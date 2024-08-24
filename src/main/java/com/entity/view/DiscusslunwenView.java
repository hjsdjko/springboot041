package com.entity.view;

import com.entity.DiscusslunwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 论文评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
@TableName("discusslunwen")
public class DiscusslunwenView  extends DiscusslunwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslunwenView(){
	}
 
 	public DiscusslunwenView(DiscusslunwenEntity discusslunwenEntity){
 	try {
			BeanUtils.copyProperties(this, discusslunwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
