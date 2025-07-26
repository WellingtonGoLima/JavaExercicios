package ExerciciosBasicos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa")); // verifica se ele começa com letra maiscula
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		
		var nome = "Pedro";
		var sobrenome = "Silva";
		var idade = 20;
		var salario = 1800f;
		
		
		System.out.println("Nome" + nome + "\nSobrenome" 
		+ sobrenome + "\nIdade" + idade);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%f." , nome,
				sobrenome, idade, salario);
	}

}
