package com.zhb.forever.mongodb.collection;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
*@author   zhanghb<a href="mailto:zhb20111503@126.com">zhanghb</a>
*@createDate 2018年11月1日下午3:40:32
*/

@Document(collection = "user_info")
public class UserModel implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -819990095946964006L;

    @Id
    private String id;
    
    @Field("name")
    private String name;  
    
    @Field("sex")
    private String sex;  
  
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }  

}


