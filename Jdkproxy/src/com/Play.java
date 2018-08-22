package com;

import annotation.MyPointCut;
import annotation.PlayPointCut;

/**
 * 测试接口
 * @author 
 *
 */
public interface Play {
	
	/**
	 * 自定义切入点
	 */
	@MyPointCut
	public void say();
	
	/**
	 * 自定义切入点
	 */
	@PlayPointCut
	public void play();
	
}
