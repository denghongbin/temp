
//模板方法设计模式
/* 所谓模板方法设计模式：定义一个操作中的算法的框架，而将一些步骤延迟到子类中，
        使得子类可以不改变一个算法的结构即可重定义该算法的某些特性
        
        仅仅使用了java的继承机制 。    
        抽象模板的方法分为两类：1，基本方法：是由子类实现的方法，并且在模板方法被调用。
                     2，模板方法：可以有一个或几个 ，一般是一个具体方法，实现对基本方法的调度，完成固定逻辑。    
        
*/
package com.templatemethodpattern;

//抽象模板
public abstract class TemplateMethodPattern {
	
   //基本方法1
   protected abstract void methodOne();
   //基本方法2
   protected abstract void methodTwo();
   
   public void templateMethod() {
	   
	   //调用基本方法 完成相关逻辑
	   this.methodOne();
	   this.methodTwo();
	
   }
   	
}
