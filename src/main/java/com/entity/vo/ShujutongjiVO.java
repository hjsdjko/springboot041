package com.entity.vo;

import com.entity.ShujutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数据统计
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public class ShujutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户数量
	 */
	
	private Integer yonghushuliang;
		
	/**
	 * 论文发布数量
	 */
	
	private Integer lunwenfabushuliang;
				
	
	/**
	 * 设置：用户数量
	 */
	 
	public void setYonghushuliang(Integer yonghushuliang) {
		this.yonghushuliang = yonghushuliang;
	}
	
	/**
	 * 获取：用户数量
	 */
	public Integer getYonghushuliang() {
		return yonghushuliang;
	}
				
	
	/**
	 * 设置：论文发布数量
	 */
	 
	public void setLunwenfabushuliang(Integer lunwenfabushuliang) {
		this.lunwenfabushuliang = lunwenfabushuliang;
	}
	
	/**
	 * 获取：论文发布数量
	 */
	public Integer getLunwenfabushuliang() {
		return lunwenfabushuliang;
	}
			
}
