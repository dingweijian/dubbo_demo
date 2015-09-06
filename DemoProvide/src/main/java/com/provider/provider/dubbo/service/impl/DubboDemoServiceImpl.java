package com.provider.provider.dubbo.service.impl;




import org.springframework.stereotype.Service;

import com.provider.provider.dubbo.service.DubboDemoService;

@Service("dubboDemoService")
public class DubboDemoServiceImpl implements DubboDemoService {

	public String hello(String name) {
		
		return "hello"+name;
	}

}
