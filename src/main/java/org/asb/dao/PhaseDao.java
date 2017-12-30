package org.asb.dao;

import java.io.Serializable;
import java.util.List;

import org.asb.model.Phase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PhaseDao extends JpaRepository<Phase, Serializable> {
	@Query("select p from Phase p where p.projet.idProjetDB like :x")
	List<Phase> getPhaseByProjet(@Param("x") Long ref);

}
