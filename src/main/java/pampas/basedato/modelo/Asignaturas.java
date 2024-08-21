package pampas.basedato.modelo;

import java.sql.Date;

public class Asignaturas {

	private Long idAsignatura;
    private String nombreAsignatura;
    private String materiaAsignatura;
    private String correlatividad;
    private Date añoAsignatura;
    private boolean obligatorio;
    
    
	public Asignaturas() {
	}
	public Asignaturas(Long idAsignatura, String nombreAsignatura, String materiaAsignatura, String correlatividad,
			Date añoAsignatura, boolean obligatorio) {
		super();
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.materiaAsignatura = materiaAsignatura;
		this.correlatividad = correlatividad;
		this.añoAsignatura = añoAsignatura;
		this.obligatorio = obligatorio;
	}
	public Long getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(Long idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public String getMateriaAsignatura() {
		return materiaAsignatura;
	}
	public void setMateriaAsignatura(String materiaAsignatura) {
		this.materiaAsignatura = materiaAsignatura;
	}
	public String getCorrelatividad() {
		return correlatividad;
	}
	public void setCorrelatividad(String correlatividad) {
		this.correlatividad = correlatividad;
	}
	public Date getAñoAsignatura() {
		return añoAsignatura;
	}
	public void setAñoAsignatura(Date date) {
		this.añoAsignatura = date;
	}
	public boolean isObligatorio() {
		return obligatorio;
	}
	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}
	@Override
	public String toString() {
		return "Asignaturas [id=" + idAsignatura + ", nombreAsignatura=" + nombreAsignatura + ", materiaAsignatura="
				+ materiaAsignatura + ", correlatividad=" + correlatividad + ", añoAsignatura=" + añoAsignatura
				+ ", obligatorio=" + obligatorio + "]";
	}

    
    
}
