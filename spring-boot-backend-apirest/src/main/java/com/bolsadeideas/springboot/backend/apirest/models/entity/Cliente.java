package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="clientes_registrados")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nombre;
	private String tipoDocumento;
	private String localidadResidencia;
	private String horaSalida;
	private String localidadDestino;
	private String horaRetorno;
	private String MedioTransporte;
	@Column(nullable=false, unique=true)
	private String numeroDocumento;
	
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	

	public String getLocalidadResidencia() {
		return localidadResidencia;
	}

	public void setLocalidadResidencia(String localidadResidencia) {
		this.localidadResidencia = localidadResidencia;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getLocalidadDestino() {
		return localidadDestino;
	}

	public void setLocalidadDestino(String localidadDestino) {
		this.localidadDestino = localidadDestino;
	}

	public String getHoraRetorno() {
		return horaRetorno;
	}

	public void setHoraRetorno(String horaRetorno) {
		this.horaRetorno = horaRetorno;
	}

	public String getMedioTransporte() {
		return MedioTransporte;
	}

	public void setMedioTransporte(String medioTransporte) {
		MedioTransporte = medioTransporte;
	}



	private static final long serialVersionUID = 1L;
}
