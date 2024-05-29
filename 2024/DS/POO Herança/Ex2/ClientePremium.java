

	public class ClientePremium extends Cliente{
			
		@Override
				public double calcularDesconto () {
			super.setValor_Promocional(valor_Pedido / 100 * 15);
			super.setValor_Promocional(valor_Pedido - super.getValor_Promocional());
			  return super.getValor_Promocional();
	
				}
	}

