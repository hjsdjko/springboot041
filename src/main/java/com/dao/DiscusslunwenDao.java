package com.dao;

import com.entity.DiscusslunwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslunwenVO;
import com.entity.view.DiscusslunwenView;


/**
 * 论文评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
public interface DiscusslunwenDao extends BaseMapper<DiscusslunwenEntity> {
	
	List<DiscusslunwenVO> selectListVO(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);
	
	DiscusslunwenVO selectVO(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);
	
	List<DiscusslunwenView> selectListView(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);

	List<DiscusslunwenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);

	
	DiscusslunwenView selectView(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);
	

}
