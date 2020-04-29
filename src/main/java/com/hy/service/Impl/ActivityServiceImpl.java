package com.hy.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.mapper.ActivityMapper;
import com.hy.model.Activity;

/**  
* ActivityServiceImpl
* Creater by chenhaiyang on 2020年4月29日
*/
@Service
public class ActivityServiceImpl {

	
	@Autowired
	private ActivityMapper activityMapper;
	
	
	public Activity getActivityById(String promNo,Long id){
		return activityMapper.queryActivityById(promNo,id);
	}
	
}
