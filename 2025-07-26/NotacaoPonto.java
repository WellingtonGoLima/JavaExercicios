package ExerciciosBasicos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		
		String s = "Olá fulano";
		s = s.replace("Fulano", "Marilene");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y =  "Bom dia X"
				.replace("X" , "Marilene")
				.toUpperCase()
				.concat("!!!");
		
		
		System.out.println(y);
	
	}

}
