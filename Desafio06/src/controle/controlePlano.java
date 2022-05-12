package controle;
import java.util.Scanner;
import dominio.Plano;

public class controlePlano {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Ponto 'A' - coordenada x: ");
		float valor1 = leia.nextFloat();
		
		System.out.print("Ponto 'A' - coordenada y: ");
		float valor2 = leia.nextFloat();
		
		System.out.print("Ponto 'B' - coordenada x: ");
		float valor3 = leia.nextFloat();
		
		System.out.print("Ponto 'B' - coordenada y: ");
		float valor4 = leia.nextFloat();
		leia.close();

		Plano plano = new Plano(valor1,valor2,valor3,valor4);
		
		System.out.print("Dist�ncia entre os dois pontos:  " + plano.calculaDistancia());
	
	}
}