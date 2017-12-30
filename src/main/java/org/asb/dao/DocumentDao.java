package org.asb.dao;

import java.io.Serializable;

import org.asb.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentDao extends JpaRepository<Document, Serializable>{

}
