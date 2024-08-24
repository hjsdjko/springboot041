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


import com.dao.ShujutongjiDao;
import com.entity.ShujutongjiEntity;
import com.service.ShujutongjiService;
import com.entity.vo.ShujutongjiVO;
import com.entity.view.ShujutongjiView;

@Service("shujutongjiService")
public class ShujutongjiServiceImpl extends ServiceImpl<ShujutongjiDao, ShujutongjiEntity> implements ShujutongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujutongjiEntity> page = this.selectPage(
                new Query<ShujutongjiEntity>(params).getPage(),
                new EntityWrapper<ShujutongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujutongjiEntity> wrapper) {
		  Page<ShujutongjiView> page =new Query<ShujutongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShujutongjiVO> selectListVO(Wrapper<ShujutongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujutongjiVO selectVO(Wrapper<ShujutongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujutongjiView> selectListView(Wrapper<ShujutongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujutongjiView selectView(Wrapper<ShujutongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShujutongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShujutongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShujutongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
