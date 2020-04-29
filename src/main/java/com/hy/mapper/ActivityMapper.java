package com.hy.mapper;

import org.apache.ibatis.annotations.Param;

import com.hy.model.Activity;

/**  
* ActivityMapper
* Creater by chenhaiyang on 2020年4月29日
*/
public interface ActivityMapper {
	
	
	Activity queryActivityById(@Param("promNo") String promNo, @Param("id") Long id);

}
