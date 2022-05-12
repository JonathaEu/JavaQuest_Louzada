package controle;
import java.util.Scanner;
import dominio.Amostra;

public class ControlaAmostra {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o codigo da amostra: ");
		int codigo = leia.nextInt();
		System.out.print("O conteúdo de carbono.....: ");
		int carbono = leia.nextInt();
		System.out.print("A dureza Rokwell..........: ");
		int dureza = leia.nextInt();
		System.out.print("A resistência a tração....: ");
		int resistencia = leia.nextInt();

		leia.close();
		
		Amostra amostra = new Amostra(codigo, carbono, dureza, resistencia);
		System.out.print("Grau da amostra do aço....: "+ amostra.informaGrau());
	}

}