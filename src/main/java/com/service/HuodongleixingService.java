package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongleixingView;


/**
 * 活动类型
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface HuodongleixingService extends IService<HuodongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongleixingVO> selectListVO(Wrapper<HuodongleixingEntity> wrapper);
   	
   	HuodongleixingVO selectVO(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
   	
   	List<HuodongleixingView> selectListView(Wrapper<HuodongleixingEntity> wrapper);
   	
   	HuodongleixingView selectView(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongleixingEntity> wrapper);

   	

}

