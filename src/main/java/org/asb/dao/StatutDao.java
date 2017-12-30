package org.asb.dao;

import java.io.Serializable;

import org.asb.model.Statut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatutDao extends JpaRepository<Statut, Serializable> {

}
