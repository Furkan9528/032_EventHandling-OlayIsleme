package com.furkankara;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		appCtx.start(); //Ayaga kaldiriliyor.
		
		Sozler sozler = appCtx.getBean("sozlerBean",Sozler.class);
		sozler.ekranaYaz();
		
		appCtx.refresh();
		sozler.ekranaYaz();
		
		appCtx.stop();
		sozler.ekranaYaz();
		appCtx.close();
		
	}

}
