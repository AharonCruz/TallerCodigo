package receta_medica;

import java.util.ArrayList;
import java.util.Date;

import usuario.Doctor;
import usuario.Paciente;

public class Receta {
	protected PlanNutricional planNtr;
	protected ArrayList<Medicamento> medicinas;
	protected Paciente paciente;
	protected Date fecha;
	protected Doctor doctor;
	
	public Receta() {
		planNtr = new PlanNutricional();
		medicinas = new ArrayList<Medicamento>();
		fecha = new Date();
	}
}
