package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuodongbaomingEntity;
import com.entity.view.HuodongbaomingView;

import com.service.HuodongbaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动报名
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@RestController
@RequestMapping("/huodongbaoming")
public class HuodongbaomingController {
    @Autowired
    private HuodongbaomingService huodongbaomingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongbaomingEntity huodongbaoming,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			huodongbaoming.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuodongbaomingEntity> ew = new EntityWrapper<HuodongbaomingEntity>();

		PageUtils page = huodongbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongbaoming), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongbaomingEntity huodongbaoming, 
		HttpServletRequest request){
        EntityWrapper<HuodongbaomingEntity> ew = new EntityWrapper<HuodongbaomingEntity>();

		PageUtils page = huodongbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongbaoming), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongbaomingEntity huodongbaoming){
       	EntityWrapper<HuodongbaomingEntity> ew = new EntityWrapper<HuodongbaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongbaoming, "huodongbaoming")); 
        return R.ok().put("data", huodongbaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongbaomingEntity huodongbaoming){
        EntityWrapper< HuodongbaomingEntity> ew = new EntityWrapper< HuodongbaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongbaoming, "huodongbaoming")); 
		HuodongbaomingView huodongbaomingView =  huodongbaomingService.selectView(ew);
		return R.ok("查询活动报名成功").put("data", huodongbaomingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongbaomingEntity huodongbaoming = huodongbaomingService.selectById(id);
        return R.ok().put("data", huodongbaoming);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongbaomingEntity huodongbaoming = huodongbaomingService.selectById(id);
        return R.ok().put("data", huodongbaoming);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongbaomingEntity huodongbaoming, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huodongbaoming);
        huodongbaomingService.insert(huodongbaoming);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongbaomingEntity huodongbaoming, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huodongbaoming);
        huodongbaomingService.insert(huodongbaoming);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongbaomingEntity huodongbaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongbaoming);
        huodongbaomingService.updateById(huodongbaoming);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<HuodongbaomingEntity> list = new ArrayList<HuodongbaomingEntity>();
        for(Long id : ids) {
            HuodongbaomingEntity huodongbaoming = huodongbaomingService.selectById(id);
            huodongbaoming.setSfsh(sfsh);
            huodongbaoming.setShhf(shhf);
            list.add(huodongbaoming);
        }
        huodongbaomingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongbaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
