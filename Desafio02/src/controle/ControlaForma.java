package controle;
import java.util.Scanner;
import dominio.Forma;

public class ControlaForma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite primeiro valor: ");
		float lado1 = leia.nextFloat();
		
		System.out.print("Digite segundo  valor: ");
		float lado2 = leia.nextFloat();
		
		System.out.print("Digite terceiro valor: ");
		float lado3 = leia.nextFloat();

		leia.close();
		
		Forma forma = new Forma(lado1,lado2,lado3);
		
		System.out.println("Resultado da analise dos tres valores: " + forma.verificaForma());
	}

}