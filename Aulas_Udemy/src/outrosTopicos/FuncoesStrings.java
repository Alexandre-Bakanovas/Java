package outrosTopicos;

public class FuncoesStrings {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); //Pega do caractér passado em diante.
		String s05 = original.substring(2, 9); //Pega a partir do caractér passado até o último passado, sem incluir ele.
		String s06 = original.replace('a', 'x'); //Toda vez que ele achar um caracter a minúsculo, trocar por um x
		String s07 = original.replace("abc", "xy"); //Troca tbm mais de um caracter. Quando é mais de um caracter, deve-se usar aspas duplas. Enquanto que, quando for caracter simples, apenas aspas simples.
		int i = original.indexOf("bc"); //pega a primeira vez que aparece bc na frase. O índice que ele retorna é igual ao primeiro indice, ou seja, no caso aqui estamos procurando a primeira vez que aparece "bc" na String. O valor dele vai ser o valor do índice b, no caso 1
		int j = original.lastIndexOf("bc"); //pega a última vez que aparece bc na frase, seguindo o mesmo raciocínio de cima.
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace(''abc'', ''xy''): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	
	
		String s = "potato apple lemon";
		
		String[] vect = s.split("o");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	
	
	}
}

//Formatar: toLowerCase(), toUpperCase(), trim() (O trim é para remover espaços)
//Recortar: substring(inicio), substring(inicio, fim)
//Substituir: Replace(char, char), Replace(string, string)
//Buscar: IndexOF, LastIndexOF
//str.Split(" ") (Recortar string com base em um separador)