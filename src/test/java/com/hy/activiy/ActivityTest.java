package com.hy.activiy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hy.model.Activity;
import com.hy.service.Impl.ActivityServiceImpl;

/**  
* ActivityTest
* Creater by chenhaiyang on 2020年4月29日
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityTest {

	@Autowired
	ActivityServiceImpl activityServiceImpl;
	
	@Test
	public void t1(){
		Activity activityById = activityServiceImpl.getActivityById("2008",4l);
		System.out.println(activityById);
	}
	
}
