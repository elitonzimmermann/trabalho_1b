import java.util.Scanner;

public class Clinica (
/*Exibe relação de pacientes de uma clinica
 *apresenta: qtd de pacientes, media da idade dos homens
 *qtd de mulheres entre 1,60 e 1,70 com peso superior a 70 kg
 *qtd de pessoas entre 18 e 25 anos
 *nome do paciente mais velho
 *nome da mulher mais baixa
 *situação criada: qtd de homens e mulheres
 */
 
	public static void main(String[] args (
	
		scanner ent = new Scanner (Sytem.in);
		int qtdpacientes=0, somaidadehomens=0, qtdhomens=0, qtdmulaltura=0, qtdmulheres=0;
		int qtdpesidade=0, mediaidadehomens, fim=1, sexo,idade, maioridade;
		float peso, altura,maisbaixa;
		String nomemaisvelho="",nomemaisbaixa="não foi cadastrado nenhuma mulher", nome
		
		System.out.println("Digite seu nome");
		nome=ent.next();
		System.out.println("Digite sexo 1-feminino 2-masculino");
		sexo=ent.nextInt();
		while((sexo<1)||(sexo>2))(
			System.out.println("Opção invalida");
			System.out.println("Digite sexo 1-feminino 2-masculino");
			sexo=ent.nextInt();)
		System.out.println("Digite seu peso (kg)");
		peso=ent.nextFloat();
		Syetem.out.println("Digite a sua altura (m)");
		altura=ent.nextFloat();
		Sytem.out.println("Digite sua idade");
		idade=ent.nextInt();
		
		qtdpacientes++;
		
		if((idade>18)&& (idade<=25))
		(qtdpesidade++;)
		//contador para qtd de pessoas entre 18 e 25 anos
		
			maioridade = idade;
			
			nomemaisvelho = nome;
			
			maisbaixa = altura;
			
		if (sexo==1)//se sexo feminino
		(
			if ((altura>=1.60)&& (altura<=1.70)&& (peso>70))
			(qtdmulaltura++;)
			// contador para qtd de mulheres entre 1,60 e 1,70
			nomemaisbaixa=nome;
		)
		else if (sexo==2)// se sexo masculino
		(qtdhomens++;//contador para qtd de homens
		somaidadehomens+=idade;)// var para terminar programa ou não
		
		while((fim<1)||(fim>2)){
			Sytem.out.println("Opção inválida");
			Syetem.out.println("Deseja sair 1-Não 2-Sim");
			fim=ent.nextInt();}
		if (fim==2)
			(System.out.println("FIM!\n");}
		
		while (fim==1) // laço para continuar cadastro
		(
			Sytem.out.println("Digite seu nome");
			nome=ent.next();
			System.out.println("Digite sexo 1-feminino 2-masculino");
			sexo=ent.nextInt();
			while((sexo<1)||(sexo>2)){
			Syetem.out.println("Opção inválida");
			System.out.println("Digite sexo 1-feminino 2-masculino");
			sexo=ent.nextInt();}
		Syetem.out.println("Digite seu peso (kg)");
		Syetem.out.println("Digite sua altura (m)");
		altura=ent.nextFloat();
		Syetem.out.println("Digite sua idade");
		idade=ent.nextInt();
		qtdpacientes++;
		
		if((idade>18)&& (idade<25))
		(qtdpesidade++;)
		
		if(maioridade<idade)
		(maioridade=idade;
			nomemaisvelho=nome;)
		/*se a idade digitada agora for maior que a udade na var maioridade
		*a var maioridade passa a ter o valor da maior idade
		*e a var nomemaisvelho passa a ter o nome daqule com maior idade
		*/
		
		if (sexo==1)
		(
		
			if ((altura>1.60)&& (altura<=1.70)&&(peso>70))
			(qtdmulaltura++;)
		
			if (maisbaixa > altura)
			(maisbaixa=altura;
				nomemaisbaixa=nome;)
			/*se a altura digitada agora for menor que a altura na var maisbaixa
			 *a var maisbaixa passa a ter o valor da altura
			 *e a var nomemaisbaixa passa a ter o nome daquela com maior idade
			 */
			 
		}
		else if (sexo==2)
		(qtdhomens++;
		 somaidadehomens+=idade;)
		 
		 Syetem.out.println("Deseja sair 1-Não 2-Sim");
		 fim=ent.nextInt();
		 
		 while((fim<1)||(fim>2)){
				Sytem.out.println("Opção inválida");
				System.out.println("Deseja sair 1-Não 2-Sim");
				fim=ent.nextInt();}
		if (fim==2)
		(System.out.println("FIM!\n");)
	}
	
	if (qtdhomens==0)// se nenhum homem for cadastrado a media sera zero
	(mediaidadehomens=0;)
	else//se não calcula a media
	(mediaidadehomens=somaidadehomens/qtdhomens;)
	
	qtdmulheres=qtdpacientes-qtdhomens;//calculo para a qtd de mulheres
	
	System.out.println("A quantidade de pacientes e:"+qtdpacientes= "pacientes");
	System.out.println("A média da idade dos homens é:"+mediaidadehomens+"anos");
	System.out.println("A quantidade de mulheres com altura entre 1.60 e 1.70 e peso superior a 70kg é:"+qtdmulaltura+"mulheres");
	System.out.println("A quantidade de pessoas entre 18 e 25 anos é:"+qtdpesidade+"pessoas");
	System.out.println("O nome do paciente mais velho é:"+nomemaisvelho);
	System.out.println("O nome da mulher mais baixa é:"+nomemaisbaixa);
	System.out.println("A quantidade de mulheres é:"+qtdmulheres+"mulheres"+ "e a quantidade de homens é:"+qtdhomens+"homens");
	
	}
	
}