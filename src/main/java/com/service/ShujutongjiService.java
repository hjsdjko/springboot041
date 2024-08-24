package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujutongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujutongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujutongjiView;


/**
 * 数据统计
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface ShujutongjiService extends IService<ShujutongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujutongjiVO> selectListVO(Wrapper<ShujutongjiEntity> wrapper);
   	
   	ShujutongjiVO selectVO(@Param("ew") Wrapper<ShujutongjiEntity> wrapper);
   	
   	List<ShujutongjiView> selectListView(Wrapper<ShujutongjiEntity> wrapper);
   	
   	ShujutongjiView selectView(@Param("ew") Wrapper<ShujutongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujutongjiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShujutongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShujutongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShujutongjiEntity> wrapper);



}

