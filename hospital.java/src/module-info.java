module hospital.java {
	
import java.time.LocalDate;

public class Internacao {
	private Medico medicoResponsavel;
	private Paciente paciente;
	private LocalDate dataInternacao;
    private LocalDate dataAlta;
	private String observacoes;
	
	// Getters
	public Medico getMedico() {
		return this.medicoResponsavel;
	}
	public Paciente getPaciente() {
		return this.paciente;
	}
	public LocalDate getDataInternacao() {
		return this,dataInternacao;
	}
	public String getObservacoes() {
		return this.observacoes;
	}

	// Setters
	public void setMedico(Medico medico) {
		this.medicoResponsavel = medico;
	}
	public void setDataAlta(LocalDate data) {
		this.dataAlta =data
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}