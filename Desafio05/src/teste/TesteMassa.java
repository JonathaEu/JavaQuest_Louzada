package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Massa;

public class TesteMassa {
	@Test
	public void DeveriaRetornarTempoCerto(){
		Massa testemassa = new Massa(50);
		testemassa.calculaTempo();
		int x = testemassa.getTempo();
		Assert.assertEquals(350, x, 0);
	}
}
