package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshuhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshuhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshuhuodongView;


/**
 * 学术活动
 *
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
public interface XueshuhuodongService extends IService<XueshuhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshuhuodongVO> selectListVO(Wrapper<XueshuhuodongEntity> wrapper);
   	
   	XueshuhuodongVO selectVO(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);
   	
   	List<XueshuhuodongView> selectListView(Wrapper<XueshuhuodongEntity> wrapper);
   	
   	XueshuhuodongView selectView(@Param("ew") Wrapper<XueshuhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshuhuodongEntity> wrapper);

   	

}

