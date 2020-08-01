import java.util.Scanner;

class Televisor {
		Scanner scanner = new Scanner(System.in);

		Integer canal = 130;
		Integer volume = 20;
		
		

		void mudarCanal(Integer novoCanal) {
			if (canal.equals(novoCanal)) {
				System.out.println("O canal não foi alterado.");
			} else {
				canal = novoCanal;
				System.out.println("Novo canal: " + canal);
			}
		}
		
		void mudarVolume(Integer novoVolume) {
			if (novoVolume.equals(volume)) {
				System.out.println("O volume não foi alterado.");
			} else {
				volume = novoVolume.intValue();
				System.out.println("Volume alterado para " + volume);
			}
		}
		
		void gradeCanais() {
			System.out.println("-------------------------------------------------");
			System.out.println("           Grade de canais disponíveis           ");
			System.out.println("-------------------------------------------------");
			System.out.println("[17] Globo");
			System.out.println("[18] Record");
			System.out.println("[20] Band");
			System.out.println("[19] Rede Vida");
			System.out.println("[21] SBT");
			System.out.println("[23] REde TV");
			System.out.println("[22] Cultura");
			System.out.println("[130] Sportv");
			System.out.println("-------------------------------------------------");
			System.out.print("Escolha o canal desejado: ");
			Integer escolhaCanal = scanner.nextInt();
			mudarCanal(escolhaCanal);
			}
		
		void iniciandoTv (Integer escolhaUsuario) {
			if (escolhaUsuario.equals(0)) {
				gradeCanais();
			} else {
				mudarCanal(escolhaUsuario);
			}
		}
		
		
	}

