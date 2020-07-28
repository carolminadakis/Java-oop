import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Entre com o tipo de ve�culo ");
		System.out.print("\n( 1 ) para ve�culo de passeio \n( 2 ) para caminh�o: ");
		String veiculo = scanner.nextLine();
		
		System.out.println("Digite a velocidade m�xima permitida na via: ");
		Double velocidadePermitida = scanner.nextDouble();
		
		System.out.println("Digite a velocidade do motorista: ");
		Double velocidadeMotorista = scanner.nextDouble();
		
		Double multaParaPasseio = velocidadePermitida * 10 / 100;
		Double multaParaCaminhao = velocidadePermitida * 5 / 100;
		
		if ((veiculo.equals("1") && velocidadeMotorista > (velocidadePermitida + multaParaPasseio)) 
				|| (veiculo.equals("2") && velocidadeMotorista > (velocidadePermitida + multaParaCaminhao))) {
			
			System.out.println("O motorista deve ser multado.");
		} else {
			System.out.println("Velocidade permitida.");
		}
		
		scanner.close();
	}
}
