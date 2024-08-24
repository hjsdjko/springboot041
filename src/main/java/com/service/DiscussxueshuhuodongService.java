package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxueshuhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxueshuhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxueshuhuodongView;


/**
 * 学术活动评论表
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
public interface DiscussxueshuhuodongService extends IService<DiscussxueshuhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxueshuhuodongVO> selectListVO(Wrapper<DiscussxueshuhuodongEntity> wrapper);
   	
   	DiscussxueshuhuodongVO selectVO(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);
   	
   	List<DiscussxueshuhuodongView> selectListView(Wrapper<DiscussxueshuhuodongEntity> wrapper);
   	
   	DiscussxueshuhuodongView selectView(@Param("ew") Wrapper<DiscussxueshuhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxueshuhuodongEntity> wrapper);

   	

}

