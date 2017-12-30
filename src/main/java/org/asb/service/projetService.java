package org.asb.service;

import java.util.List;

import org.asb.dao.ProjetDao;
import org.asb.model.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projetService {

	@Autowired
	private ProjetDao projetDao;

	@RequestMapping(value = "/projet", method = RequestMethod.POST)
	public Projet saveBatiment(@RequestBody Projet projet) {
		projetDao.save(projet);
		return projet;
	}

	@RequestMapping(value = "/projet", method = RequestMethod.PUT)
	public Projet updateBatiment(@RequestBody Projet projet) {
		projetDao.save(projet);
		return projet;
	}

	@RequestMapping(value = "/projet", method = RequestMethod.GET)
	public List<Projet> getBatiments() {
		return projetDao.findAll();
	}

	@RequestMapping(value = "/projet/{id}", method = RequestMethod.GET)
	public Projet getBatiment(@PathVariable Long id) {
		return projetDao.findOne(id);
	}

	@RequestMapping(value = "/projet/{id}", method = RequestMethod.DELETE)
	public void deleteBatiment(@PathVariable Long id) {
		projetDao.delete(id);
	}

}