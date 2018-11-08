package com.zhb.forever.nosql.redis.client;

import com.zhb.forever.framework.spring.bean.locator.SpringBeanLocator;
import com.zhb.forever.nosql.redis.Constants;

public class RedisClientFactory {
    
    public static RedisClient getRedisClientBean() {
        Object bean = SpringBeanLocator.getInstance(
                Constants.REDIS_CLIENT_CONF).getBean(
                        Constants.REDIS_CLIENT);
        return (RedisClient) bean;
    }

}
