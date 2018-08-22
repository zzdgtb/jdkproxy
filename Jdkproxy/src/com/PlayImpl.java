package com;

/**
 * 测试类--测试接口实现
 * @author lenovo
 *
 */
public class PlayImpl implements Play{

	@Override
	public void say() {
		System.out.println("yeyeyeyeye");
		
	}

	@Override
	public void play() {
		System.out.println("i am playing ");
		
	}

}
