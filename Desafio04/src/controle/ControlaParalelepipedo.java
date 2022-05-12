package controle;
import java.util.Scanner;
import dominio.Paralelepipedo;

public class ControlaParalelepipedo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite primeira aresta: ");
		float aresta1 = leia.nextFloat();
		
		System.out.print("Digite segunda  aresta: ");
		float aresta2 = leia.nextFloat();
		
		System.out.print("Digite terceira aresta: ");
		float aresta3 = leia.nextFloat();
		leia.close();
		
		Paralelepipedo paralelepipedo = new Paralelepipedo(aresta1,aresta2,aresta3);
		
		System.out.println("C�lculo da diagonal: " + paralelepipedo.calculaDiagonal());
	}	
}