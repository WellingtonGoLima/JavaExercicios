package ExerciciosBasicos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
			System.out.println("Informe o salario: ");
		
		String valor = salario.nextLine();
		
		double v1 = Double.parseDouble(valor);
		
		double media = v1/2;
		
		System.out.println("A media de salario é de " + media);
		
		
	    
	    

	}

}
