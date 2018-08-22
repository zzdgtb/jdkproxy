package com;

import annotation.After;
import annotation.Before;
import annotation.MyAspect;

/**
 * 增强
 * @author lenov
 *
 */
@MyAspect
public class Aspect {

	@Before(annotation = "annotation.MyPointCut")
	public void beforeSay(){
		System.out.println("before say...");
	}
	
	@After(annotation = "annotation.MyPointCut")
	public void eat(){
		System.out.println("I want  to eat...");
	}
	
	@Before(annotation = "annotation.PlayPointCut")
	public void beforePlay(){
		System.out.println("before say... hahahhhhhhhhhhhh");
	}
}
