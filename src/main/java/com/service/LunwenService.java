package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenView;


/**
 * 论文
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface LunwenService extends IService<LunwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenVO> selectListVO(Wrapper<LunwenEntity> wrapper);
   	
   	LunwenVO selectVO(@Param("ew") Wrapper<LunwenEntity> wrapper);
   	
   	List<LunwenView> selectListView(Wrapper<LunwenEntity> wrapper);
   	
   	LunwenView selectView(@Param("ew") Wrapper<LunwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenEntity> wrapper);

   	

}

