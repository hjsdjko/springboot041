package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslunwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslunwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslunwenView;


/**
 * 论文评论表
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:51
 */
public interface DiscusslunwenService extends IService<DiscusslunwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslunwenVO> selectListVO(Wrapper<DiscusslunwenEntity> wrapper);
   	
   	DiscusslunwenVO selectVO(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);
   	
   	List<DiscusslunwenView> selectListView(Wrapper<DiscusslunwenEntity> wrapper);
   	
   	DiscusslunwenView selectView(@Param("ew") Wrapper<DiscusslunwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslunwenEntity> wrapper);

   	

}

