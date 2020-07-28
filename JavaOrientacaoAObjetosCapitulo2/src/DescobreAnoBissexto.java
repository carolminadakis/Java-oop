import java.util.Scanner;

public class DescobreAnoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o ano, para saber se é ano bissexto ou não: ");
		Integer anoUsuario = scanner.nextInt();
		
		Boolean anoBissexto = anoUsuario % 4 == 0 && anoUsuario % 100 != 0 || anoUsuario % 400 == 0;
		
		if (anoBissexto) {
			System.out.println("O ano " + anoUsuario + " é ano Bissexto.");
		} else {
			System.out.println("O ano " + anoUsuario + " NÃO é ano Bissexto.");
		}
		scanner.close();
	}

}
