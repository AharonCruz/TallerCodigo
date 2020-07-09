package usuario;

import java.util.ArrayList;

import receta_medica.Receta;
import registro_paciente.Cita;
import registro_paciente.HistoriaClinica;

public class Paciente {
	protected String email;
	protected ArrayList<Receta> recetas;
	protected HistoriaClinica historiaClinica;
	protected Cita cita;
	
	public Paciente() {
		recetas = new ArrayList<Receta>();
		historiaClinica = new HistoriaClinica();
	}
	
	public boolean solicitarCita() {
		return false;
	}
}
