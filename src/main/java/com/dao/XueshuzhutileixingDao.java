package com.dao;

import com.entity.XueshuzhutileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshuzhutileixingVO;
import com.entity.view.XueshuzhutileixingView;


/**
 * 学术主题类型
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface XueshuzhutileixingDao extends BaseMapper<XueshuzhutileixingEntity> {
	
	List<XueshuzhutileixingVO> selectListVO(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);
	
	XueshuzhutileixingVO selectVO(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);
	
	List<XueshuzhutileixingView> selectListView(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);

	List<XueshuzhutileixingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);

	
	XueshuzhutileixingView selectView(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);
	

}
