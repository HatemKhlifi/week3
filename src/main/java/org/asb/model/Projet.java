package org.asb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idProjetDB;
	@Column(unique=true)
	private Long idProjet;
	private String nomProjet;
	private Date dateDebut;
	private Date dateFin;
	private String nomProj;
	private Date dateProjetMoe;
	private String maitreDouvrage;
	private String maitreDoeuvre;
	private String architecture;
	private String ct;
	private String geotechnicien;
	@ManyToOne
	private Entrepise entreprise;
	private String modeInfra;
	private String modeSuperstructure;
	private String infoHypoSupp;
	private String nomEntreprise;
	@ManyToOne
	private Statut statut;
	@ManyToOne 
	private User chefProjet;
	
	
	public Long getIdProjetDB() {
		return idProjetDB;
	}
	public void setIdProjetDB(Long idProjetDB) {
		this.idProjetDB = idProjetDB;
	}
	public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getNomProj() {
		return nomProj;
	}
	public void setNomProj(String nomProj) {
		this.nomProj = nomProj;
	}
	public Date getDateProjetMoe() {
		return dateProjetMoe;
	}
	public void setDateProjetMoe(Date dateProjetMoe) {
		this.dateProjetMoe = dateProjetMoe;
	}
	public String getMaitreDouvrage() {
		return maitreDouvrage;
	}
	public void setMaitreDouvrage(String maitreDouvrage) {
		this.maitreDouvrage = maitreDouvrage;
	}
	public String getMaitreDoeuvre() {
		return maitreDoeuvre;
	}
	public void setMaitreDoeuvre(String maitreDoeuvre) {
		this.maitreDoeuvre = maitreDoeuvre;
	}
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getCt() {
		return ct;
	}
	public void setCt(String ct) {
		this.ct = ct;
	}
	public String getGeotechnicien() {
		return geotechnicien;
	}
	public void setGeotechnicien(String geotechnicien) {
		this.geotechnicien = geotechnicien;
	}
	public Entrepise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entrepise entreprise) {
		this.entreprise = entreprise;
	}
	public String getModeInfra() {
		return modeInfra;
	}
	public void setModeInfra(String modeInfra) {
		this.modeInfra = modeInfra;
	}
	public String getModeSuperstructure() {
		return modeSuperstructure;
	}
	public void setModeSuperstructure(String modeSuperstructure) {
		this.modeSuperstructure = modeSuperstructure;
	}
	public String getInfoHypoSupp() {
		return infoHypoSupp;
	}
	public void setInfoHypoSupp(String infoHypoSupp) {
		this.infoHypoSupp = infoHypoSupp;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public User getChefProjet() {
		return chefProjet;
	}
	public void setChefProjet(User chefProjet) {
		this.chefProjet = chefProjet;
	}
}
