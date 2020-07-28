
public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ();
		
		cachorro.idade = 5;
		cachorro.nome = "Marley";
		cachorro.raça = "Golden";
		cachorro.sexo = 'M';
		
		Cachorro cadela = new Cachorro();
		
		cadela.idade = 10;
		cadela.nome = "Hully";
		cadela.raça = "Poodle";
		cadela.sexo = 'F';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raça);
		
		System.out.println("----------------------------");
		
		System.out.println("Nome: " + cadela.nome);
		System.out.println("Sexo: " + cadela.sexo);
		System.out.println("Idade: " + cadela.idade);
		System.out.println("Raça: " + cadela.raça);
		
	}

}
