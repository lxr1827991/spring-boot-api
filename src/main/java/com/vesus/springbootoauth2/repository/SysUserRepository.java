package com.vesus.springbootoauth2.repository;

import com.vesus.springbootoauth2.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public class SysUserRepository  {

	
    public SysUser getUserByName( String name) {
    	System.out.println(name);
    	return null;
    }
}
