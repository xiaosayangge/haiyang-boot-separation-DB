package com.hy.interceptor;

import java.sql.Connection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.util.Assert;

import com.hy.util.GsonUtils;

/**  
* SeparationInterceptor
* Creater by chenhaiyang on 2020年4月29日
*/
@Intercepts({@Signature(type=StatementHandler.class,args={Connection.class,Integer.class},method="prepare")})
public class SeparationInterceptor implements Interceptor {

	private final String TABLE_NAME_TEMP="activity_table_name";
	
	private final String TABLE_NAME="activity_";
	
	
	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#intercept(org.apache.ibatis.plugin.Invocation)
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		MetaObject metaObject = SystemMetaObject.forObject(invocation.getTarget());
		String[] getterNames = metaObject.getGetterNames();
		System.out.println(Arrays.toString(getterNames));
		
		BoundSql boundSql = (BoundSql) metaObject.getValue("boundSql");
		String sql=boundSql.getSql();
		
		if(sql.contains(TABLE_NAME_TEMP)){
			Object parameterObject = boundSql.getParameterObject();
			Assert.notNull(parameterObject,"分表查询参数不能为空");
			String promNo="";
			if(parameterObject instanceof String){
				promNo=parameterObject.toString();
			}else{
				 promNo=(String) ((HashMap)parameterObject).get("promNo");
			}
			String replaceSql=sql.replaceAll(TABLE_NAME_TEMP, TABLE_NAME+promNo);
			metaObject.setValue("boundSql.sql", replaceSql);
		}
		return invocation.proceed();
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#plugin(java.lang.Object)
	 */
	@Override
	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		return Plugin.wrap(target, this);
	}

	/* (non-Javadoc)
	 * @see org.apache.ibatis.plugin.Interceptor#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub
		
	}

}
