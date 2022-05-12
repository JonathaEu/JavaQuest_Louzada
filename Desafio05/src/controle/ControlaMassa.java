package controle;
import java.util.Scanner;
import dominio.Massa;

public class ControlaMassa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a massa inicial em gramas: ");
		float massaInicial = leia.nextFloat();
		leia.close();
		
		Massa massa = new Massa(massaInicial);
		massa.calculaTempo();
		
		System.out.println("Massa inicial: " + massa.getMassaInicial() + " gramas");
		System.out.println("Massa final  : " + massa.getMassaFinal() + " gramas");
		System.out.println("Tempo obtido : " + massa.getTempo() + " segundos");
	}
}	