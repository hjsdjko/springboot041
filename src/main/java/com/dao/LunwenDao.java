package com.dao;

import com.entity.LunwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenVO;
import com.entity.view.LunwenView;


/**
 * 论文
 * 
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface LunwenDao extends BaseMapper<LunwenEntity> {
	
	List<LunwenVO> selectListVO(@Param("ew") Wrapper<LunwenEntity> wrapper);
	
	LunwenVO selectVO(@Param("ew") Wrapper<LunwenEntity> wrapper);
	
	List<LunwenView> selectListView(@Param("ew") Wrapper<LunwenEntity> wrapper);

	List<LunwenView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenEntity> wrapper);

	
	LunwenView selectView(@Param("ew") Wrapper<LunwenEntity> wrapper);
	

}
