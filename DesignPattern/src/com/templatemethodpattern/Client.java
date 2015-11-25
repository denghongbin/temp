package com.templatemethodpattern;

/*
 * 
 * 场景类
 * */
public class Client {

	public static void main(String[] args) {
		
		TemplateMethodPattern class1 = new ClassOne();
		TemplateMethodPattern class2 = new ClassTwo();
		
		//调用模板方法
		class1.templateMethod();
		class2.templateMethod();

	}

}
