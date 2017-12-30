package org.asb.dao;

import java.io.Serializable;

import org.asb.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProjetDao extends JpaRepository<Projet, Serializable> {
	@Query("select t from Projet t where t.idProjet = :x")
	Projet getProjetByIdFunct(@Param("x") Long ref);

}
