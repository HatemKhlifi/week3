package org.asb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddoc;
	private String typeDoc;
	private String etatDoc;
	private Long importance;

	public Long getIddoc() {
		return iddoc;
	}

	public void setIddoc(Long iddoc) {
		this.iddoc = iddoc;
	}

	public String getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public String getEtatDoc() {
		return etatDoc;
	}

	public void setEtatDoc(String etatDoc) {
		this.etatDoc = etatDoc;
	}

	public Long getImportance() {
		return importance;
	}

	public void setImportance(Long importance) {
		this.importance = importance;
	}

	
}