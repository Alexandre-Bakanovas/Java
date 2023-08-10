package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c)/ 2.0;
		/*double result*/ return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//		return result;
	}
}


//Classe:
//É um tipo estruturado que pode conter (membros):
//	Atributos (dados/campos)
//	Métodos (funções / operações)
//	
//A classe também pode prover muitos outros recursos, tais como:
//	-Construtores
//	-Sobrecarga
//	-Encapsulamento
//	-Herança
//	-Polimorfismo
//	
//Exemplos:
//	Entidades: Produto, Cliente, Triangulo
//	Serviços: ProdutoService, ClienteService, EmailService, StorageService
//	Controladores: ProdutoController, ClienteController
//	Utilitários: Calculadora, Compactador
//	Outros (views, repositórios, gerenciadores, ect..)