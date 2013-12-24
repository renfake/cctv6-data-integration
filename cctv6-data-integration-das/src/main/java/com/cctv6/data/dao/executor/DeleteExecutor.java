package com.cctv6.data.dao.executor;

/**
 * 
 * @author wdong
 *
 * @param <T>
 */
public interface DeleteExecutor<T> {

    public void delete(T persistentObject);
       
}
