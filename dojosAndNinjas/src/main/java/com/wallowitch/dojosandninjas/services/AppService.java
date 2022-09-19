package com.wallowitch.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallowitch.dojosandninjas.models.Dojo;
import com.wallowitch.dojosandninjas.models.Ninja;
import com.wallowitch.dojosandninjas.repositories.DojoRepository;
import com.wallowitch.dojosandninjas.repositories.NinjaRepository;

@Service
public class AppService {
	@Autowired
	private DojoRepository dRepo;
	@Autowired
	private NinjaRepository nRepo;
	
	public List<Dojo> allDojos(){
		return this.dRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
}
