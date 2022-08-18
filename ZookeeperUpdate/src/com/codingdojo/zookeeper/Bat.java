package com.codingdojo.zookeeper;

public class Bat extends Mammal {

	public int energyLevel = 300;
	
	public void fly( ) {
		System.out.println("Whoosh, the bat takes flight!");
		this.setEnergy(-50);
	}
	
	public void eatHumans( ) {
		System.out.println("Gulp... the bat enjoys a meal.");
		this.setEnergy(25);
	}
	
	public void attackTown( ) {
		System.out.println("The crackling of a fire is all that can be heard as the town turns to ash.");
		this.setEnergy(-100);
	}
	
}
