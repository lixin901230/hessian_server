package com.lx.hessian.service.impl;

import com.lx.hessian.service.IHelloService;

public class HelloServiceImpl implements IHelloService {

	public String sayHello(String name) throws Exception {
		
		return "Hello "+name+" , this is my first Hessian!";
	}

}
