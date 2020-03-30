package com.furkankara;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextOlayTazelemeIsleyicisi implements ApplicationListener<ContextRefreshedEvent> {


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("ContextStoppedEvent (Context Olay Tazeleme) ");
		
	}



}
