import java.util.Scanner;
import java.util.Locale;


public class exercicios_estrutura_sequencial {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/** Faça um programa para ler dois valores inteiros, e depois mostrar na tela
		 *  a soma desses números com uma mensagem explicativa conforme exemplos.
		double x, y;
		double soma;
			
		System.out.print("Digite um valor para x: ");
		x = sc.nextDouble();
		System.out.println("x = " + x);
		
		System.out.print("Digite um valor para y: ");
		y = sc.nextDouble();
		System.out.println("y = " + y);
		System.out.println();
		
		soma = (x + y);
		
		System.out.print("SOMA = " + soma);
		
		sc.close();
		*/
		
		/** Faça um programa para ler o valor do raio de um círculo 
		 *  Fórmula da área: area = pi . raio²
		 *  Considere  valor de pi = 3.14159
		 
		double R = 3.14159;
		double raio;
		double area;
		
		System.out.print("Digite um valor para raio: ");
		raio = sc.nextDouble();
		
		area = R * Math.pow(raio, 2.0);
		
		System.out.printf("%.4f", area);
		
		sc.close();
		*/
		
		/** Fazer um programa para ler quatro valores para A,B,C,D a seguir,
		 *  calcule e mostre a diferença do produto seguindo a formula (A*B-C*D)
	 
		double A, B, C, D;
		double diferenca;
		
		System.out.println("Digite os quatro numeros: ");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		
		diferenca = (A*B-C*D);
		
		System.out.print("Diferenca: " + diferenca);
		sc.close();
		*/
		
		/** Faça um programa que leia o código de um funcionário, 
		 *  suas horas trabalhadas, o valor da hora e o salário desse funcionario.
		  
		 double horasT, valorH, salario, number;
		 
		 System.out.print("Digite o Código do funcionário: ");
		 number = sc.nextDouble();
		 
		 System.out.print("Digite as horas trabalhadas: ");
		 horasT = sc.nextDouble();
		 
		 System.out.print("Digite o valor da hora: ");
		 valorH= sc.nextDouble();
		 
		 salario = horasT * valorH;
		 
		 System.out.println("NUMBER = " + number);
		 
		 System.out.printf("SALARY = U$ %.2f", salario);
		 
		 sc.close();
		 */ 
		 
		 /**
		 
		 double cod1, cod2, qtdpeca1, qtdpeca2, valorpc1, valorpc2, total;
		
		 cod1 = sc.nextDouble();
		 qtdpeca1 = sc.nextDouble();
		 valorpc1 = sc.nextDouble();		 
		 cod2 = sc.nextDouble();	
		 qtdpeca2 = sc.nextDouble();
		 valorpc2 = sc.nextDouble();
		 
		 total = (qtdpeca1 * valorpc1) + (qtdpeca2 * valorpc2);
		 
		 System.out.print("Valor total a pagar: R$ " + total);
		
		 
		 sc.close();
		 */
		 
		 /**
		 double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		 
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 
		 triangulo = ((A*C)/2);
		 circulo = C * C * 3.14159;
		 trapezio = ((A+B)/2)*C;
		 quadrado = B * 2 + B * 2; 
		 retangulo = B * A;
		
         System.out.printf("TRIANGULO: %.3f%n", triangulo);
         System.out.printf("CIRCULO: %.3f%n", circulo);
         System.out.printf("TRAPEZIO: %.3f%n", trapezio);
         System.out.printf("QUADRADO: %.3f%n", quadrado);	
         System.out.printf("RETÂNGULO: %.3f", retangulo);	
         	
		 sc.close();
		 */
		 
		 int hora;
		 
		 System.out.print("Digite uma hora: ");
		 
		 hora = sc.nextInt();
		 
		 if (hora < 12) {
			System.out.print("Bom dia!"); 
		 
		 } 
		 else if (hora < 18) {
			System.out.print("Boa Tarde!"); 
			
		 } 
		 else {
			System.out.print("Boa noite!"); 
				
		 }
		 
		 
		 sc.close();
	}
}

