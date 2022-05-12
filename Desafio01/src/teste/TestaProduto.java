package teste;

import org.junit.Assert;
import dominio.Produto;
import org.junit.Test;

public class TestaProduto {
	
	@Test
	public void Desconto10Porcento(){
		Produto prod = new Produto(1, 1, 20.0, 1);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 2.0, 0);
		Assert.assertEquals(valorFinal, 18, 0);
	//2% - cheque
		Produto prod2 = new Produto(1, 1, 20.0, 2);
		double valor2 = prod2.calculaDesconto();
		double valorFinal2 = prod2.valorFinal();
		Assert.assertEquals(valor2, 0.4, 0);
		Assert.assertEquals(valorFinal2, 19.6, 0);
	//5% cartao debito
		Produto prod3 = new Produto(1, 1, 20.0, 3);
		double valor3 = prod3.calculaDesconto();
		double valorFinal3 = prod3.valorFinal();
		Assert.assertEquals(valor3, 1.0, 0);
		Assert.assertEquals(valorFinal3, 19, 0);
	//5% cartao credito
		Produto prod4 = new Produto(1, 1, 20.0, 4);
		double valor4 = prod4.calculaDesconto();
		double valorFinal4 = prod4.valorFinal();
		Assert.assertEquals(valor4, 1, 0);
		Assert.assertEquals(valorFinal4, 19, 0);
	}
}
