package com.app.fruits;

     abstract class Fruit {
	 protected String color;
     protected double weight;
     protected String name;
     protected boolean isFresh;
     
      public Fruit(){}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public abstract String taste();

	@Override
	public String toString() {
		return "Fruit[name"+name+",color="+color+",weight="+weight+"]";

	}
	
	
     
	
	
	
	
}
