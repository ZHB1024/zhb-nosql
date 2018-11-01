package com.zhb.forever.mongodb.client;

import java.util.List;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月1日下午3:26:34
*/

public interface MongoDBClient {
    
    <T> void save(T entity);
    
    <T> List<T> findAll(Class<T> entityName);
    
    <T> List<T> findByProp(String propName, Object propValue,Class<T> entityName);
    
}


