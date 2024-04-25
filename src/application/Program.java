package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Conexao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conexao conexao = new Conexao();
		
		String menu = """
				***************************************************
				Seja bem vindo ao Convertor de moedas =]
				
				1) Dólar >>> Peso argentino
				2) Peso argentino >>> Dólar
				3) Dólar >>> Real Brasileiro
				4) Real Brasileiro >>> Dólar
				5) Dólar >>> Peso colombiano
				6) Peso colombiano >>> Dólar
				7) Sair
				Escolha uma opção válida:
				*************************************************** 
				""";
		System.out.println(menu);
		int n = sc.nextInt();
		String msgConvert = "Digite o valor que deseja converter: " ;
		double x = 0.0;
		double result = 0.0;
		
		while(n != 7) {
			System.out.println(menu);
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x * conexao.conn().getPesoArgentino();
				System.out.println("Valor " + x + "[USD] corresponde o valor "
						+ "final de =>>>" + String.format("%.2f", result) + "[ARS]");
				break;
			case 2:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x / conexao.conn().getPesoArgentino();
				System.out.println("Valor " + x + "[ARS] corresponde o valor "
						+ "final de =>>>" +String.format("%.2f", result) + "[USD]");
				break;
			case 3:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x * conexao.conn().getReal();
				System.out.println("Valor " + x + "[USD] corresponde o valor "
						+ "final de =>>>" + String.format("%.2f", result) + "[BRL]");
				break;
			case 4:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x / conexao.conn().getReal();
				System.out.println("Valor " + x + "[BRL] corresponde o valor "
						+ "final de =>>>" + String.format("%.2f", result)+ "[USD]");
				break;
			case 5:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x / conexao.conn().getPesoColombiano();
				System.out.println("Valor " + x + "[COP] corresponde o valor "
						+ "final de =>>>" +  String.format("%.2f", result) + "[USD]");
				break;
			case 6:
				System.out.println(msgConvert);
				x = sc.nextDouble();
				result =  x / conexao.conn().getPesoColombiano();
				System.out.println("Valor " + x + "[USD] corresponde o valor "
						+ "final de =>>>" +String.format("%.2f", result) + "[COP]");
				break;
			}
		}
	}

}
