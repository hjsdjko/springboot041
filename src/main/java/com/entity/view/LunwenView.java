package com.entity.view;

import com.entity.LunwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 论文
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@TableName("lunwen")
public class LunwenView  extends LunwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwenView(){
	}
 
 	public LunwenView(LunwenEntity lunwenEntity){
 	try {
			BeanUtils.copyProperties(this, lunwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
