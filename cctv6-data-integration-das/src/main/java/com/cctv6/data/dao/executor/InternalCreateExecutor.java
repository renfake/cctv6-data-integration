package com.cctv6.data.dao.executor;

import java.lang.reflect.Method;

/**
 * 
 * @author wdong
 *
 */
public interface InternalCreateExecutor {
	public int internalCreate(Method method, Object args);
}
