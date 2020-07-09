package pago;


public class PagoPaypal implements Pago{
	protected float monto;
	protected String email;
	
	@Override
	public boolean realizarPago(float monto) {
		return false;
	}
	
	
}
