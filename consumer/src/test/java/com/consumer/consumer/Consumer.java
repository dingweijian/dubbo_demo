package com.consumer.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.provider.provider.dubbo.service.DubboDemoService;

public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
       
 
        DubboDemoService dubboDemoService = (DubboDemoService)context.getBean("dubboDemoService"); // 获取远程服务代理
        String hello = dubboDemoService.hello(" : dingweijian"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
        System.in.read();
	}

}
