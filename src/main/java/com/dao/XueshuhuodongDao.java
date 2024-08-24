package com.dao;

import com.entity.XueshuhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshuhuodongVO;
import com.entity.view.XueshuhuodongView;


/**
 * 学术活动
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface XueshuhuodongDao extends BaseMapper<XueshuhuodongEntity> {
	
	List<XueshuhuodongVO> selectListVO(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);
	
	XueshuhuodongVO selectVO(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);
	
	List<XueshuhuodongView> selectListView(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);

	List<XueshuhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);

	
	XueshuhuodongView selectView(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);
	

}
