package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	public void setEnergy(int energy) {
		energyLevel += energy;
	}
}
