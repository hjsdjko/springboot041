package com.entity.vo;

import com.entity.LunwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 论文
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public class LunwenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学术主题类型
	 */
	
	private String xueshuzhutileixing;
		
	/**
	 * 学术内容
	 */
	
	private String xueshuneirong;
		
	/**
	 * 论文摘要
	 */
	
	private String lunwenzhaiyao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 关键词
	 */
	
	private String guanjianci;
		
	/**
	 * 作者信息
	 */
	
	private String zuozhexinxi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：学术主题类型
	 */
	 
	public void setXueshuzhutileixing(String xueshuzhutileixing) {
		this.xueshuzhutileixing = xueshuzhutileixing;
	}
	
	/**
	 * 获取：学术主题类型
	 */
	public String getXueshuzhutileixing() {
		return xueshuzhutileixing;
	}
				
	
	/**
	 * 设置：学术内容
	 */
	 
	public void setXueshuneirong(String xueshuneirong) {
		this.xueshuneirong = xueshuneirong;
	}
	
	/**
	 * 获取：学术内容
	 */
	public String getXueshuneirong() {
		return xueshuneirong;
	}
				
	
	/**
	 * 设置：论文摘要
	 */
	 
	public void setLunwenzhaiyao(String lunwenzhaiyao) {
		this.lunwenzhaiyao = lunwenzhaiyao;
	}
	
	/**
	 * 获取：论文摘要
	 */
	public String getLunwenzhaiyao() {
		return lunwenzhaiyao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：关键词
	 */
	 
	public void setGuanjianci(String guanjianci) {
		this.guanjianci = guanjianci;
	}
	
	/**
	 * 获取：关键词
	 */
	public String getGuanjianci() {
		return guanjianci;
	}
				
	
	/**
	 * 设置：作者信息
	 */
	 
	public void setZuozhexinxi(String zuozhexinxi) {
		this.zuozhexinxi = zuozhexinxi;
	}
	
	/**
	 * 获取：作者信息
	 */
	public String getZuozhexinxi() {
		return zuozhexinxi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
