package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshuzhutileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshuzhutileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshuzhutileixingView;


/**
 * 学术主题类型
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface XueshuzhutileixingService extends IService<XueshuzhutileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshuzhutileixingVO> selectListVO(Wrapper<XueshuzhutileixingEntity> wrapper);
   	
   	XueshuzhutileixingVO selectVO(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);
   	
   	List<XueshuzhutileixingView> selectListView(Wrapper<XueshuzhutileixingEntity> wrapper);
   	
   	XueshuzhutileixingView selectView(@Param("ew") Wrapper<XueshuzhutileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshuzhutileixingEntity> wrapper);

   	

}

