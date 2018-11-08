package com.zhb.forever.nosql.mongodb;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.zhb.forever.nosql.mongodb.client.MongoDBClient;
import com.zhb.forever.nosql.mongodb.client.MongoDBClientFactory;
import com.zhb.forever.nosql.mongodb.collection.UserModel;


/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月1日下午4:09:26
*/

public class MongoDBClientTest {
    
    private Logger logger = LoggerFactory.getLogger(MongoDBClientTest.class);
    
    private MongoDBClient client = MongoDBClientFactory.getMongoDBClientBean();
    
    @Test
    @Transactional
    public void saveOrUpdateTest() {
        UserModel user = new UserModel();
        user.setId("123");
        user.setName("zhb-张会彬");
        user.setSex("男");
        client.save(user);
        
        List<UserModel> users = client.findByProp("sex", "男", UserModel.class);
        if (null != users) {
            for (UserModel userModel : users) {
                logger.info(userModel.getId() + "--" + userModel.getName() + "--" + userModel.getSex());
            }
        }
        
        
    }


}


