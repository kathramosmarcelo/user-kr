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

@Id
public String id;
	
public String name_user;
public String id_document;
public String name_document;
public String nro_phone;
public String imei_phone;
public String Email;

}
