package com.hy.conrtoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
* ActivityConrtoller
* Creater by chenhaiyang on 2019年4月2日
*/
@RestController
@RequestMapping("/activity/")
public class ActivityConrtoller {

	
	@RequestMapping("test")
	public String test(){
		return "hello";
	}
	
}
