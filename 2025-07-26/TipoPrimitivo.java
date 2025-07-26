package ExerciciosBasicos;

public class TipoPrimitivo {

	public static void main(String[] args) {
		// Trabalhando com tipos primitivos
		
		// numéricos inteiros
		byte anosDeEmpresa = 10;
		short numeroDeVoos = 323;
		int id = 56789;
		long pontosAcumulados = 1_234_845_223L;
		
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.02;

		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = '1'; //Ativo
		
		// Dias de empresa
		
		System.out.print(anosDeEmpresa * 365); 
		
		// Números de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias?" + estaDeFerias);
		System.out.println("Status:" + status);
	}

}
