package com.provider.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.provider.provider.dubbo.service.DubboDemoService;

public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
       // DubboDemorService dubboDemorService = (DubboDemorService)context.getBean("dubboDemorService"); // 获取远程服务代理
       
 
        DubboDemoService dubboDemorService = (DubboDemoService)context.getBean("dubboDemoService"); // 获取远程服务代理
        String hello = dubboDemorService.hello("dingweijian"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
        System.in.read();
	}

	
	/* public void run() {  
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
	                new String[]{"applicationConsumer.xml"});    
	        context.start();    
	    
	        DubboDemoService demoService = (DubboDemoService) context.getBean("dubboDemoService"); // get    
	                                                                                // service    
	                                                                                // invocation    
	        // proxy    
	        String hello = demoService.deal("nihao"); // do invoke!    
	    
	        System.out.println(Thread.currentThread().getName() + " "+hello);    
	    }  */  
	 
}
