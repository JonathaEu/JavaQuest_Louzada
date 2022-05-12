package controle;
import java.util.Scanner;
import dominio.Produto;

public class ControlaProduto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o código do produto....: ");
		int codigo = leia.nextInt();
		System.out.print("Digite quantidade.............: ");
		int quantidade = leia.nextInt();
		System.out.print("Digite o valor unitário.......: ");
		double valorUnitario=leia.nextDouble();
		System.out.print("Digite a forma de pagamento...: ");
		int formaPagamento=leia.nextInt();
		leia.close();
		
		Produto produto = new Produto(codigo,quantidade,valorUnitario,formaPagamento);
        
		System.out.println("---------------------------------------");
		System.out.println("Desconto.......: R$ " + produto.calculaDesconto());
		System.out.println("Valor final....: R$ " + produto.valorFinal());
		System.out.println("---------------------------------------");
	}

}