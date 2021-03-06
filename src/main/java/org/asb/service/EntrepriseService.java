package org.asb.service;

import java.util.List;

import org.asb.dao.EntrepriseDao;
import org.asb.model.Entrepise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EntrepriseService {

	@Autowired
	EntrepriseDao entrepriseDao;

	@RequestMapping(value = "/entreprise", method = RequestMethod.POST)
	public Entrepise saveEntrep(@RequestBody Entrepise entrep) {
		entrepriseDao.save(entrep);
		return entrep;
	}

	@RequestMapping(value = "/entreprise", method = RequestMethod.PUT)
	public Entrepise updateEntrep(@RequestBody Entrepise entrep) {
		entrepriseDao.save(entrep);
		return entrep;
	}

	@RequestMapping(value = "/entreprise", method = RequestMethod.GET)
	public List<Entrepise> getEntrep() {
		return entrepriseDao.findAll();
	}

	@RequestMapping(value = "/entreprise/{id}", method = RequestMethod.GET)
	public Entrepise getEntrp(@PathVariable Long id) {
		return entrepriseDao.findOne(id);
	}

	@RequestMapping(value = "/entreprise/{id}", method = RequestMethod.DELETE)
	public void deleteEntrep(@PathVariable Long id) {
		entrepriseDao.delete(id);
	}

}
