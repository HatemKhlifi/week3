package org.asb.dao;

import java.io.Serializable;
import java.util.List;

import org.asb.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TacheDao extends JpaRepository<Tache, Serializable> {

	@Query("select t from Tache t where t.event.idEvenement like :x")
	List<Tache> getTacheByEvent(@Param("x") Long ref);
	
	@Query("select sum(t.etatAavancement) from Tache t where t.event.idEvenement like :x")
	Long progressionEvent(@Param("x") Long ref);
	


	
}
