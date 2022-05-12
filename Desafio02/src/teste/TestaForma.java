package teste;

import  org.junit.Assert;
import dominio.Forma;
import org.junit.Test;

public class TestaForma {
	@Test
	public void DeveSerTrianguloEquilatero(){
		Forma form = new Forma(2.0f, 2.0f, 2.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "triangulo equilatero");
	}
	
	@Test
	public void DeveSerTrianguloIsosceles(){
		Forma form = new Forma(2.0f, 2.0f, 3.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "triangulo isosceles");
	}
	
	@Test
	public void DeveSerTrianguloEscaleno(){
		Forma form = new Forma(2.1f, 2.0f, 4.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "triangulo escaleno");
	}
	
	@Test
	public void NaoTriangulo(){
		Forma form = new Forma(2.1f, 2.0f, 4.1f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "n�o eh um triangulo");
	}
}
