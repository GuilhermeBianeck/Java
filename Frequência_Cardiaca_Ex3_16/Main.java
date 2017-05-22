ja// EXERCÌCIO 3.16 - FREQUÊNCIA CARDIACA - LIVRO DEITEL

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		//Definindo l como Scanner (Ler).
		Scanner l = new Scanner(System.in);

		//Declaração de variáveis
		String userNome,userSobrenome;
		int userDia, userMes, userAno, diaAtual, mesAtual, anoAtual;

		System.out.println("Calculo de Frequência Cardiaca\n");


				//Recebendo Valores.
		System.out.println("Digite o nome do Usuário: ");
			userNome = l.next();
		System.out.println("Digite o sobrenome do Usuário: ");
			userSobrenome = l.next();
		
		System.out.println("Digite o dia de nascimento do Usuário: ");
			userDia = l.nextInt();
		System.out.println("Digite o mes de nascimento do Usuário: ");
			userMes = l.nextInt();
		System.out.println("Digite o ano de nascimento do Usuário: ");
			userAno = l.nextInt();

		System.out.println("Digite a data atual:\n");
		System.out.println("Digite o Dia: ");
			diaAtual = l.nextInt();
		System.out.println("Digite o Mes: ");
			mesAtual = l.nextInt();
		System.out.println("Digite o Ano: ");
			anoAtual = l.nextInt();
		

		//INSTANCIAR CLASSE. 
		HeartRates hRates = new HeartRates(userNome, userSobrenome, userDia, userMes, userAno,anoAtual, mesAtual, diaAtual);
		
		//Chamada de Métodos
		hRates.calculaIdade();
		hRates.calculaFmax();
		hRates.calculaFa();

		//Print da análise.
		System.out.println("\nResultados do HeartRates\n");
		System.out.printf("Nome: %s %s \n",hRates.getNome(),hRates.getSobrenome());
		System.out.printf("Data de nascimento do usuário : %d / %d / %d\n",hRates.getNascDia(), hRates.getNascMes(), hRates.getNascAno());
		System.out.printf("A idade do usuário é : %d \n", hRates.getIdade());
		System.out.printf("A frequência cardiaca máxima do usuário é : %d \n", hRates.getFmax());
		System.out.printf("A frequência alvo é : %.2f até %.2f\n",hRates.getFa1(), hRates.getFa2());



	}
}