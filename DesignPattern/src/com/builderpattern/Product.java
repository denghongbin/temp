//建造者设计模式
/* 所谓建造者设计模式：将一个复杂对象的构建与它的表示分类，使得同样的构建过程可以创建不同的表示。
        
       建造者模式有4个角色：
   1， Prodct 产品类   
      通常实现了 模板方法模式，也就是有模板方法和基本方法。
   2，Builder抽象建造者
      规范产品的组件，一般由子类实现。
   3，ConCreteBuilder 具体建造者
      实现抽象类定义的所有方法 ，并返回一个组件好的对象。
   4，Director 导演类
      负责安排已有模块的顺序，然后告诉Builder开始建造。   
*/
package com.builderpattern;

//产品类
public  class Product {
		
	public void doSomething() {
		//独立业务处理
	}

}
