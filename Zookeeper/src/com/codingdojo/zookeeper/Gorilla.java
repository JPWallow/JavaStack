package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwThings( ) {
		System.out.println("The gorilla expends energy by throwing something!");
		this.setEnergy(-5);
	}
	
	public void eatBanana( ) {
		System.out.println("The gorilla regains energy by eatting a banana!");
		this.setEnergy(10);
	}
	
	public void climbThings( ) {
		System.out.println("The gorilla expends energy by climbing a tree!");
		this.setEnergy(-10);
	}
	
}
