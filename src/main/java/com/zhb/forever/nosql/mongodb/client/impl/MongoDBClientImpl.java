package com.zhb.forever.nosql.mongodb.client.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.zhb.forever.nosql.mongodb.client.MongoDBClient;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月8日下午2:12:19
*/

public class MongoDBClientImpl implements MongoDBClient {

    private Logger logger = LoggerFactory.getLogger(MongoDBClientImpl.class);
    
    protected MongoTemplate mongoTemplate;
    
    @Override
    public <T> void save(T entity) {
        mongoTemplate.save(entity);
    }

    @Override
    public <T> List<T> findAll(Class<T> entityName) {
        return mongoTemplate.findAll(entityName);
    }

    @Override
    public <T> List<T> findByProp(String propName, Object propValue,Class<T> entityName) {
        Query query = new Query();
        // 参数
        Criteria criteria = new Criteria(propName);  
        criteria.is(propValue);  
        query.addCriteria(criteria);
        
        return mongoTemplate.find(query, entityName);

    }
    

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}


