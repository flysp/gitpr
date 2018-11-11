package com.jxedu.git.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GitDO {

     private  String  id;

     private String tel;
     
     private String  account;

     private String status;

     private String password;

     private String address;
}
