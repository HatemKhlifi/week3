package org.asb.dao;

import java.io.Serializable;

import org.asb.model.Entrepise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseDao extends JpaRepository<Entrepise, Serializable> {

}
