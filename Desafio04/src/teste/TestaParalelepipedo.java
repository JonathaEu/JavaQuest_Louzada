package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Paralelepipedo;

public class TestaParalelepipedo {
	@Test
	public void DeveriaRetornarDiagonalCerta(){
		Paralelepipedo para = new Paralelepipedo(4f, 3f, 9f);
		float x = para.calculaDiagonal();
		Assert.assertEquals(x, 10.29563045501709, 0);
	}
}
