package test;

import com.Aspect;
import com.Play;
import com.PlayImpl;

import annotation.MyAspect;
import proxy.CustomHandle;

public class ProxyTest {
	public static void main(String[] args) {
		PlayImpl p=new PlayImpl();
		Aspect aspect= new Aspect();
		CustomHandle h=new CustomHandle(p,aspect);
		Play pl=(Play)h.getProxy();
		pl.say();
		System.out.println("=========================");
		pl.play();
	}
}
