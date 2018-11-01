package com.zhb.forever.mongodb.client;

import com.zhb.forever.framework.spring.bean.locator.SpringBeanLocator;
import com.zhb.forever.mongodb.Constants;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月1日下午4:06:36
*/

public class MongoDBClientFactory {

    public static MongoDBClient getMongoDBClientBean() {
        Object bean = SpringBeanLocator.getInstance(
                Constants.MONGODB_CLIENT_CONF).getBean(
                        Constants.MONGODB_CLIENT);
        return (MongoDBClient) bean;
    }

}


