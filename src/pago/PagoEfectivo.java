package pago;

public class PagoEfectivo implements Pago {
	protected float monto;

	@Override
	public boolean realizarPago(float monto) {
		return false;
	}

}
