package Atividadesexta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	Scanner ler =  new Scanner (System.in);
	protected String nome;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   

	public String opc1 ()
	{
		double salBruto = 0;
		double salLiq;
		double salOp = 1100;
		double salSuper = 1600;
		double salCoo = 2100;
		double salGer = 3100;
		double salDir = 5000;
		double porcentagem;
		double diasT;
		double horasT;
		double AdcHExt;
		double pl;
		double dec;
		double dec1;
		double reajuste;
		int OpT;
		int horasEx;
		int cargo;
		int op;
		int op1;
		int senha = 1234;
		String mess = ":-)";
		String nome;
		String nomeC;
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println ("\n************CALCULADORA SALARIAL*************");
		System.out.println ("\n*********************************************");
		System.out.println ("\n*****************RH SERVIÇOS*****************");
		System.out.println ("\n*********************************************");
		System.out.println ("\n*****************BEM VINDO!!!****************");
		
		System.out.println ("\nDigite por gentileza seu nome: ");
		nome= ler.next();
		System.out.println ("\nBem vindo gerente financeiro " +nome+ " digite a senha de acesso: ");
		senha= ler.nextInt();
		
		while (senha != 1234)
		{
			System.out.println ("\n(WARNING)");
			System.out.println ("\nSr(a) " +nome+ " ocorreu um erro de validação...");
			System.out.println ("\nDigite a senha novamente por gentieza: ");
			senha= ler.nextInt();
		}
		
		System.out.println ("\n---------------------------------------------------------------");
		System.out.println("\nÓtimo "+ nome + ", agora insira por favor o nome do colaborador: ");
		nomeC = ler.next();
		System.out.println ("\n------------------------");
		System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
		System.out.println ("\n------------------------");
		cargo = ler.nextInt();
		
		while (cargo != 1 && cargo != 2 && cargo != 3 && cargo != 4 && cargo != 5)
		{
			System.out.println ("\n------------------------");
			System.out.println("\n(WARNING - OPÇÃO INVÁLIDA)");
			System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
			System.out.println ("\n------------------------");
			cargo = ler.nextInt();
		}
		
		switch (cargo)  
		{
		case 1:
		
			salBruto= salOp;
			
			break;
			
		case 2:
			
			salBruto= salSuper;
			
			break;
			
		case 3:
			
			salBruto= salCoo;
			
			break;
			
		case 4:
			
			salBruto= salGer;
			
			break;
			
		case 5:
			
			salBruto= salDir;
			
			break;
			
		default:
			System.out.println("\n(WARNING)");
            System.out.println("\nDigite uma opção VÁLIDA entre 1 e 5");
            break;
		}

		System.out.println ("\n");
		System.out.println ("\n");
		
			System.out.println ("\n" +nome+ " com base no salário base do(a) "+ nomeC +", digite a opção que deseja calcular: ");
			System.out.println ("\n-------------------------------------------------------------------------------------");
			System.out.println ("\n1° Opção - Valor Bruto e Valor Líquido do salário ");
			System.out.println ("\n2° Opção - Valor Bruto + adcional por horas extras e Valor Líquido ");
			System.out.println ("\n3° Opção - Valor Bruto + adcional por metas/resultados e Valor Líquido");
			System.out.println ("\n4° Opção - Valor Bruto + Adiantamento das férias e Valor Líquido");
			System.out.println ("\n5° Opção - Valor Bruto + PL (particiapação de lucro) e Valor Líquido");
			System.out.println ("\n6° Opção - Salário Liquído + 13°");
			System.out.println ("\n7° Opção - Valor Bruto + adiantamento do 13° e Valor Líquido");
			System.out.println ("\n8° Opção - Valor Bruto + reajuste anual e Valor Líquido");
			System.out.println ("\n-------------------------------------------------------------------------------------");
			op= ler.nextInt();
			while ( op!=1 &&  op!=2 &&  op!=3 &&  op!=4 &&  op!=5 &&  op!=6 &&  op!=7 &&  op!=8) 
			{
				
				System.out.println("\nDigite uma opção válida: ");
				op = ler.nextInt();	
				
			}
		
			switch (op)
			{
			
			case 1: 
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 2:
				
				System.out.println ("\nDigite quantas horas extras o colaborador trabalhou: ");
				horasEx = ler.nextInt();
			
				diasT= salBruto/26;
				horasT= diasT/8;
				
				AdcHExt = horasEx * horasT;
				salBruto = salBruto + AdcHExt;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adcional horas extras = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 3:
				
				porcentagem = (salBruto * 70)/100;
				salBruto = salBruto + porcentagem;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adcional por metas/resultados = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 4:
				
				salBruto = salBruto + salBruto;
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adiantamento das férias = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 5:
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("\nDigite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					pl = (salBruto/12) * OpT;
					
					salBruto = salBruto + pl;
					
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					System.out.println("\nSalário Bruto + PL (particiapação de lucro) = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
		
				break;
				
			case 6: 
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("\nDigite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					dec = (salLiq/12) * OpT;
					
					salLiq = salLiq + dec;
					
					
					System.out.println("\nSalário Liquído + PL (particiapação de lucro) = " + formatador.format(salLiq));
					
					
				
				break;
				
			case 7 :
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("\nDigite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					dec1 = (salLiq/12) * OpT;
					dec1 = dec1/2;
					salLiq = salLiq + dec1;
					
					
					System.out.println("\nSalário Bruto = "+ formatador.format(salBruto) + "\t" + "Sálario Liquido + adiantamento 13° = " + formatador.format(salLiq));
			
				
				break;
				  
			case 8 : 
				
				reajuste = (salBruto*5)/100;
				salBruto =  salBruto + reajuste;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println("Salário Bruto + reajuste anual = " + formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
			   
			    
			    break;
			    
			    default : 
			    	
			    	System.out.println("\nDigite uma opção válida...");
			
			}
		System.out.println("\n");
		
		System.out.println ("\n" + nome + " deseja fazer outro cálculo? ");
		System.out.println ("\n1- SIM \n2- NÃO ");
		op1 = ler.nextInt();
		
		while (op1 == 1)
		{
			System.out.println ("\n------------------------");
			System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
			System.out.println ("\n------------------------");
			cargo = ler.nextInt();
			
			while (cargo != 1 && cargo != 2 && cargo != 3 && cargo != 4 && cargo != 5)
			{
				System.out.println ("\n------------------------");
				System.out.println("\n(WARNING - OPÇÃO INVÁLIDA)");
				System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
				System.out.println ("\n------------------------");
				cargo = ler.nextInt();
				
			}
			
			switch (cargo)  
			{
			case 1:
			
				salBruto= salOp;
				
				break;
				
			case 2:
				
				salBruto= salSuper;
				
				break;
				
			case 3:
				
				salBruto= salCoo;
				
				break;
				
			case 4:
				
				salBruto= salGer;
				
				break;
				
			case 5:
				
				salBruto= salDir;
				
				break;
				
			default:
	            System.out.println("\nDigite SOMENTE uma opção entre 1 e 5");
	            break;
			}
			
			System.out.println ("\n" +nome+ " com base no salário base do(a) "+ nomeC +", digite a opção que deseja calcular: ");
			System.out.println ("\n-------------------------------------------------------------------------------------");
			System.out.println ("\n1° Opção - Valor Bruto e Valor Líquido do salário ");
			System.out.println ("\n2° Opção - Valor Bruto + adcional por horas extras e Valor Líquido ");
			System.out.println ("\n3° Opção - Valor Bruto + adcional por metas/resultados e Valor Líquido");
			System.out.println ("\n4° Opção - Valor Bruto + Adiantamento das férias e Valor Líquido");
			System.out.println ("\n5° Opção - Valor Bruto + PL (particiapação de lucro) e Valor Líquido");
			System.out.println ("\n6° Opção - Salário Liquído + 13°");
			System.out.println ("\n7° Opção - Valor Bruto + adiantamento do 13° e Valor Líquido");
			System.out.println ("\n8° Opção - Valor Bruto + reajuste anual e Valor Líquido");
			System.out.println ("\n-------------------------------------------------------------------------------------");
			op= ler.nextInt();
			
			while ( op!=1 &&  op!=2 &&  op!=3 &&  op!=4 &&  op!=5 &&  op!=6 &&  op!=7 &&  op!=8) 
			{
				System.out.println("\n(WARNING - OPÇÃO INVÁLIDA)");
				System.out.println("\nDigite uma opção válida: ");
				op = ler.nextInt();	
				
			}
			
			switch (op)
			{
			
			case 1: 
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				break;
				
			case 2:
				
				System.out.println ("\nDigite quantas horas extras o colaborador trabalhou: ");
				horasEx = ler.nextInt();
			
				diasT= salBruto/26;
				horasT= diasT/8;
				
				AdcHExt = horasEx * horasT;
				salBruto = salBruto + AdcHExt;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adcional horas extras = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
	
				
				break;
				
			case 3:
				
				porcentagem = (salBruto * 70)/100;
				salBruto = salBruto + porcentagem;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adcional por metas/resultados = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 4:
				
				salBruto = salBruto + salBruto;
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
				System.out.println ("\nSalário Bruto + adiantamento das férias = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
				
				
				break;
				
			case 5:
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("Digite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					pl = (salBruto/12) * OpT;
					
					salBruto = salBruto + pl;
					
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					System.out.println("\nSalário Bruto + PL (particiapação de lucro) = "+ formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));

				
		
				break;
				
			case 6: 
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("Digite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					dec = (salLiq/12) * OpT;
					
					salLiq = salLiq + dec;
					
					
					System.out.println("\nSalário Liquído + PL (particiapação de lucro) = " + formatador.format(salLiq));
					
					
				
				break;
				
			case 7 :
				
				System.out.println("\nDigite quantos meses o operador trabalhou esse ano: ");
				OpT = ler.nextInt();
				
				while ( OpT != 1 &&  OpT != 2 &&  OpT != 3 &&  OpT != 4 &&  OpT != 5 &&  OpT != 6 &&  OpT != 7 &&  OpT != 8 &&  OpT != 9 &&  OpT != 10 &&  OpT != 11 &&  OpT != 12) 
				{
					
					System.out.println("Digite uma opção de meses trabalhados válida: ");
					OpT = ler.nextInt();	
					
				}
				
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					dec1 = (salLiq/12) * OpT;
					dec1 = dec1/2;
					salLiq = salLiq + dec1;
					
					
					System.out.println("\nSalário Bruto = "+ formatador.format(salBruto) + "\t" + "Sálario Liquido + adiantamento 13° = " + formatador.format(salLiq));
				

				break;
				
			case 8 : 
				
				reajuste = (salBruto*5)/100;
				salBruto =  salBruto + reajuste;
				
				porcentagem = (salBruto * 8)/100;
				salLiq = salBruto - porcentagem;
				
			    System.out.println("Salário Bruto + reajuste anual = " + formatador.format(salBruto) + "\t" + "Salário Líquido = " + formatador.format(salLiq));
				
			    
			    break;
			    
			    default : 
			    	
			    	System.out.println("Digite uma opção válida...");
			
			}
			
			System.out.println (nome + " deseja fazer outro cálculo? ");
			System.out.println ("\n1- SIM \n2- NÃO ");
			op1 = ler.nextInt();
			
		}
		
		System.out.println ("OBRIGADO POR USAR NOSSA FUNÇÃO!!!");
		return mess;
	}
	
	public String opc2 ()
	{
		
		int senha = 4321;
		double salBruto = 0;
		double salOp = 1100;
		double salSuper = 1600;
		double salCoo = 2100;
		double salGer = 3100;
		double salDir = 5000;
		double recisao;
		double salLiq;
		double PartDeLu;
		double ferias;
		double porcentagem;
		double recisaoF;
		int op1;
		int diaT;
		int cargo;
		int mesesT;
		String nomeC;  
		String mess = ":-)";
		
		DecimalFormat formatador = new DecimalFormat("0.00"); 
		
		System.out.println ("\n***********CALCULADORA DE RECISÃO************");
		System.out.println ("\n*********************************************");
		System.out.println ("\n*****************RH SERVIÇOS*****************");
		System.out.println ("\n*********************************************");
		System.out.println ("\n*****************BEM VINDO!!!****************");
		
		System.out.println ("\nDigite por gentileza seu nome: ");
		nome= ler.next();
		System.out.println ("\nBem vindo gerente financeiro " +nome+ " digite a senha de acesso: ");
		senha= ler.nextInt();
		
		while (senha != 4321)
		{
			System.out.println ("\n(WARNING)");
			System.out.println ("\nSr(a) " +nome+ " ocorreu um erro de validação...");
			System.out.println ("\nDigite a senha novamente por gentieza: ");
			senha= ler.nextInt();
		}
		
		System.out.println ("\n---------------------------------------------------------------");
		System.out.println("\nÓtimo "+ nome + ", agora insira por favor o nome do colaborador: ");
		nomeC = ler.next();
		System.out.println ("\n------------------------");
		System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
		System.out.println ("\n------------------------");
		cargo = ler.nextInt();
		
		while (cargo != 1 && cargo != 2 && cargo != 3 && cargo != 4 && cargo != 5)
		{
			System.out.println ("\n------------------------");
			System.out.println("\n(WARNING - OPÇÃO INVÁLIDA)");
			System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
			System.out.println ("\n------------------------");
			cargo = ler.nextInt();
		}
		
		switch (cargo)  
		{
		case 1:
		
			salBruto= salOp;
			
			break;
			
		case 2:
			
			salBruto= salSuper;
			
			break;
			
		case 3:
			
			salBruto= salCoo;
			
			break;
			
		case 4:
			
			salBruto= salGer;
			
			break;
			
		case 5:
			
			salBruto= salDir;
			
			break;
			
		default:
			System.out.println("\n(WARNING)");
            System.out.println("\nDigite uma opção VÁLIDA entre 1 e 5");
            break;
		}

		System.out.println ("\n");
		
		System.out.println("\n"+nome+" digite o tempo de serviço do(a) "+nomeC+": ");
		System.out.println("\n(OBS: Sem contar o mês atual)");
		mesesT = ler.nextInt();
	
			System.out.println("\nAgora digite os dias trabalhados do mês atual: ");
			diaT = ler.nextInt();
			
			while (diaT != 1 && diaT != 2 && diaT != 3 && diaT != 4 && diaT != 5 && diaT != 6 && diaT != 7 && diaT != 8 && diaT != 9 && diaT != 10 && diaT != 11 && diaT != 12 && diaT != 13 && diaT != 14 && diaT != 15 && diaT != 16 && diaT != 17 && diaT != 18 && diaT != 19 && diaT != 20 && diaT != 21 && diaT != 22 && diaT != 23 && diaT != 24 && diaT != 25 && diaT != 26 && diaT != 27 && diaT != 28 && diaT != 29 && diaT != 30)
			{
				System.out.println("Digite uma opção de dias trabalhados válida: ");
				diaT = ler.nextInt();
			}

			
			porcentagem = (salBruto * 8)/100;
			salLiq = salBruto - porcentagem;
			
			PartDeLu =( salLiq * mesesT )/12;
			
			ferias =( salLiq * mesesT)/12;
			
			recisao = (salLiq * diaT)/30 ;
			
			recisaoF = recisao + PartDeLu + ferias;
			
			 
			
			System.out.println("\nO valor correspondete é: "+ formatador.format(recisaoF)); 
	        
	        System.out.println("\n");
			
			System.out.println ("\n" + nome + " deseja fazer outro cálculo? ");
			System.out.println ("\n1- SIM \n2- NÃO ");
			op1 = ler.nextInt();
	        
			while (op1 == 1)
			{
				System.out.println ("\nDigite por gentileza seu nome: ");
				nome= ler.next();
				System.out.println ("\nBem vindo gerente " +nome+ " digite a senha de acesso: ");
				senha= ler.nextInt();
				
				while (senha != 1234)
				{
					System.out.println ("\n(WARNING)");
					System.out.println ("\nSr(a) " +nome+ " ocorreu um erro de validação...");
					System.out.println ("\nDigite a senha novamente por gentieza: ");
					senha= ler.nextInt();
				}
				
				System.out.println ("\n---------------------------------------------------------------");
				System.out.println("\nÓtimo "+ nome + ", agora insira por favor o nome do colaborador: ");
				nomeC = ler.next();
				System.out.println ("\n------------------------");
				System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
				System.out.println ("\n------------------------");
				cargo = ler.nextInt();
				
				while (cargo != 1 && cargo != 2 && cargo != 3 && cargo != 4 && cargo != 5)
				{
					System.out.println ("\n------------------------");
					System.out.println("\n(WARNING - OPÇÃO INVÁLIDA)");
					System.out.println("\nInsira o cargo do colaborador " +nomeC+ ": \n\n1- Operador(a) \n2- Supervisor(a) \n3- Coordenador(a) \n4- Gerente \n5- Diretor(a)");
					System.out.println ("\n------------------------");
					cargo = ler.nextInt();
				}
				
				switch (cargo)  
				{
				case 1:
				
					salBruto= salOp;
					
					break;
					
				case 2:
					
					salBruto= salSuper;
					
					break;
					
				case 3:
					
					salBruto= salCoo;
					
					break;
					
				case 4:
					
					salBruto= salGer;
					
					break;
					
				case 5:
					
					salBruto= salDir;
					
					break;
					
				default:
					System.out.println("\n(WARNING)");
		            System.out.println("\nDigite uma opção VÁLIDA entre 1 e 5");
		            break;
				}

				System.out.println ("\n");
				
				System.out.println("\n"+nome+" digite o tempo de serviço do(a) "+nomeC+": ");
				System.out.println("\n(OBS: Sem contar o mês atual)");
				mesesT = ler.nextInt(); 
				
				System.out.println("\nAgora digite os dias trabalhados do mês atual: ");
					diaT = ler.nextInt();
					
					while (diaT != 1 && diaT != 2 && diaT != 3 && diaT != 4 && diaT != 5 && diaT != 6 && diaT != 7 && diaT != 8 && diaT != 9 && diaT != 10 && diaT != 11 && diaT != 12 && diaT != 13 && diaT != 14 && diaT != 15 && diaT != 16 && diaT != 17 && diaT != 18 && diaT != 19 && diaT != 20 && diaT != 21 && diaT != 22 && diaT != 23 && diaT != 24 && diaT != 25 && diaT != 26 && diaT != 27 && diaT != 28 && diaT != 29 && diaT != 30)
					{
						System.out.println("Digite uma opção de dias trabalhados válida: ");
						diaT = ler.nextInt();
					}
					
					porcentagem = (salBruto * 8)/100;
					salLiq = salBruto - porcentagem;
					
					PartDeLu =( salLiq * mesesT )/12;
					
					ferias =( salLiq * mesesT)/12;
					
					recisao = (salLiq * diaT)/30 ;
					
					recisaoF = recisao + PartDeLu + ferias;
					
					
					
			        System.out.println("\nO valor correspondete é: "+ formatador.format(recisaoF));  
			        
			        System.out.println("\n");
			        
			        System.out.println ("\n" + nome + " deseja fazer outro cálculo? ");
					System.out.println ("\n1- SIM \n2- NÃO ");
					op1 = ler.nextInt();
			                
			}
		    
		System.out.println("OBRIGADO POR USAR NOSSA FUNÇÃO!!!");
		return mess;
	}
	
	}