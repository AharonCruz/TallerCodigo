package registro_paciente;

import java.util.Date;

import pago.Pago;
import usuario.Doctor;
import usuario.Paciente;

public class Cita {
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Paciente paciente;
	protected Doctor doctor;
	
	public void realizarPago(Pago pago) {
	}
}
