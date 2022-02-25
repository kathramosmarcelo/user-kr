package com.kramomar.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("User")
public class User {
//user
@Id
public String Id;
	
public String NameUser;
public String IdDocument;
public String NameDocument;
public String NroPhone;
public String ImeiPhone;
public String Email;

}
