package com.dao;

import com.entity.DiscussxueshuhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxueshuhuodongVO;
import com.entity.view.DiscussxueshuhuodongView;


/**
 * 学术活动评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
public interface DiscussxueshuhuodongDao extends BaseMapper<DiscussxueshuhuodongEntity> {
	
	List<DiscussxueshuhuodongVO> selectListVO(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);
	
	DiscussxueshuhuodongVO selectVO(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);
	
	List<DiscussxueshuhuodongView> selectListView(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);

	List<DiscussxueshuhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);

	
	DiscussxueshuhuodongView selectView(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);
	

}
