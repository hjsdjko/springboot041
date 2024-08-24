package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 数据统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@TableName("shujutongji")
public class ShujutongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujutongjiEntity() {
		
	}
	
	public ShujutongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 统计日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjiriqi;
	
	/**
	 * 用户数量
	 */
					
	private Integer yonghushuliang;
	
	/**
	 * 论文发布数量
	 */
					
	private Integer lunwenfabushuliang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：统计日期
	 */
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
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
