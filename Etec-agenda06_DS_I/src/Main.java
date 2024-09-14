import java.util.Scanner;

public class Main {

	/*Controle IPVA
	 * O escritório de Despachante Vale Card é uma empresa especializada em 
	 * documentação de veículos atuando diretamente com os órgãos de trânsito. 
	 * Entre suas atividades, está informar para seus clientes o mês de vencimento 
	 * do IPVA de seus veículos. Para isso, o cliente fornece o número final da placa 
	 * do veículo, em seguida deve ser apresentado o mês que o IPVA deve ser pago*/
	public static void main(String[] args) {
		
		//iniciando scanner e variavel de escolha 
		Scanner scan = new Scanner(System.in);
		int escolha;
		
		//mensagem de aprensentação inicial do programa
		 System.out.println("               ╔═══════════════════════════════════════════════════════════╗\r\n"
		 		+ "                ║            >>>>>>>>>>>Despachante Vale Card<<<<<<<<<<<<║\r\n"
		 		+ "                ║ ...................................................................................................................................................... ║"
		 		+ "\n"
		 		+ "Olá Vamos verificar o vencimento do seu IPVA?"
		 		+ "\n");
		
		 //loop para tratamento de erro caso a opção seja fora do definido
		while (true) {
			
			//tratamento de entrada para veriguar um valor inteiro
			escolha = solicitarEntradaParaUsuario(scan, "Entre com o Final da placa do Carro");
			switch (escolha) {

			case 1:
				System.out.println("Pagamento até 30/04");
				return;
			case 2:
				System.out.println("Pagamento até 31/05");
				return;
			case 3:
				System.out.println("Pagamento até 30/06");
				return;
			case 4:
				System.out.println("Pagamento até 31/07");
				return;
			case 5:
				System.out.println("Pagamento até 31/08");
				return;
			case 6:
				System.out.println("Pagamento até 30/09");
				return;
			case 7:
				System.out.println("Pagamento até 31/10");
				return;
			case 8:
				System.out.println("Pagamento até 30/11");
				return;
			case 9, 0:
				System.out.println("Pagamento até 31/12");
				return;
			default:
				System.out.println("o valor digitado está incorreto por favor digite um numero entre 0-9");
			}
		
		}
	}
	
	//metodo de tratamento de entrada 
	public static int solicitarEntradaParaUsuario(Scanner scan, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scan.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número. \n");
            }
        }
    }
}

	
