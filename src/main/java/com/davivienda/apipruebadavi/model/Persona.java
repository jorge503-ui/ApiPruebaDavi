package com.davivienda.apipruebadavi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONA")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String dui;

    @Column(nullable = false)
    private String nit;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private char sexo;

    @ManyToOne
    @JoinColumn(name = "ID_ACTIVIDAD_ECONOMICA")
    private ActividadEconomica actividadEconomica;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO_CIVIL")
    private EstadoCivil estadoCivil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public ActividadEconomica getActividadEconomica() {
		return actividadEconomica;
	}

	public void setActividadEconomica(ActividadEconomica actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", dui=" + dui + ", nit=" + nit + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", sexo=" + sexo + ", actividadEconomica=" + actividadEconomica + ", estadoCivil=" + estadoCivil
				+ "]";
	}

    
}
