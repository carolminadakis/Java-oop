import java.util.Scanner;

public class ExecutandoTelevisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Televisor tv = new Televisor();

					
					System.out.print("Digite 0 para ver a grade de canais, ou o canal desejado: ");
					Integer canalUsuario = scanner.nextInt();
					tv.iniciandoTv(canalUsuario);
					
					System.out.print("Digite o volume desejado: ");
					Integer volumeUsuario = scanner.nextInt();
					tv.mudarVolume(volumeUsuario);
					
					
					
					scanner.close();
					}
		
	}



// Não deveria mudar o volume e canal
//	tv.mudarVolume(20);
//	tv.mudarCanal(130);

// Deveria mudar o volume e canal
//	tv.mudarVolume(300);
//	tv.mudarCanal(10);


