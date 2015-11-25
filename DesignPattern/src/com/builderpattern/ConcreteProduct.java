package com.builderpattern;

//具体建造者
public class ConcreteProduct extends Builder{
    Product product = new Product();
	
	@Override
	public void setPart() {
		// TODO Auto-generated method stub		
	}

	@Override
	public Product buildProduct() {
		
		return product;
	}

}
