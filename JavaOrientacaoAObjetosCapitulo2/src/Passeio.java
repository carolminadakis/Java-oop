
public class Passeio {

	public static void main(String[] args) {
		
		//Declara��o e instaciamento da vari�vel pessoaUm, com o objeto do tipo Pessoa.
		Pessoa pessoaUm = new Pessoa();
		//Acessando atributo do objeto Pessoa por meio do (.nome).
		pessoaUm.nome = "Tereza";
		
		pessoaUm.cachorro = new Cachorro();
		
		pessoaUm.cachorro.nome = "Hully";
		pessoaUm.cachorro.idade = 16;
		pessoaUm.cachorro.ra�a = "Poodle Toy";
		pessoaUm.cachorro.sexo = 'F';
		
		Caminhada c = new Caminhada();
		c.andar(pessoaUm);

	}

}
