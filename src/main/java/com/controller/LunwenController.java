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

import com.entity.LunwenEntity;
import com.entity.view.LunwenView;

import com.service.LunwenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 论文
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@RestController
@RequestMapping("/lunwen")
public class LunwenController {
    @Autowired
    private LunwenService lunwenService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LunwenEntity lunwen,
		HttpServletRequest request){
        EntityWrapper<LunwenEntity> ew = new EntityWrapper<LunwenEntity>();

		PageUtils page = lunwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lunwen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LunwenEntity lunwen, 
		HttpServletRequest request){
        EntityWrapper<LunwenEntity> ew = new EntityWrapper<LunwenEntity>();

		PageUtils page = lunwenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lunwen), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LunwenEntity lunwen){
       	EntityWrapper<LunwenEntity> ew = new EntityWrapper<LunwenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lunwen, "lunwen")); 
        return R.ok().put("data", lunwenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LunwenEntity lunwen){
        EntityWrapper< LunwenEntity> ew = new EntityWrapper< LunwenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lunwen, "lunwen")); 
		LunwenView lunwenView =  lunwenService.selectView(ew);
		return R.ok("查询论文成功").put("data", lunwenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LunwenEntity lunwen = lunwenService.selectById(id);
        return R.ok().put("data", lunwen);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LunwenEntity lunwen = lunwenService.selectById(id);
        return R.ok().put("data", lunwen);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LunwenEntity lunwen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(lunwen);
        lunwenService.insert(lunwen);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LunwenEntity lunwen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(lunwen);
        lunwenService.insert(lunwen);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LunwenEntity lunwen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lunwen);
        lunwenService.updateById(lunwen);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lunwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
