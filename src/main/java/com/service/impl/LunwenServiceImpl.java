package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LunwenDao;
import com.entity.LunwenEntity;
import com.service.LunwenService;
import com.entity.vo.LunwenVO;
import com.entity.view.LunwenView;

@Service("lunwenService")
public class LunwenServiceImpl extends ServiceImpl<LunwenDao, LunwenEntity> implements LunwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenEntity> page = this.selectPage(
                new Query<LunwenEntity>(params).getPage(),
                new EntityWrapper<LunwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenEntity> wrapper) {
		  Page<LunwenView> page =new Query<LunwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<LunwenVO> selectListVO(Wrapper<LunwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenVO selectVO(Wrapper<LunwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenView> selectListView(Wrapper<LunwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenView selectView(Wrapper<LunwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
