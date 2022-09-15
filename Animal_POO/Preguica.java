package Animal_POO;

public class Preguica extends Animal {
	
	private String deveSubir;
	
	public Preguica (String nome, int idade, String emitirSom, String deveSubir) {
		super (nome,idade);
		
		this.deveSubir = deveSubir;	
	}

	public String getDeveSubir() {
		return deveSubir;
	}

	public void setDeveSubir(String deveSubir) {
		this.deveSubir = deveSubir;
	}
	
	public void imprimirInfo() {
        System.out.println("\n Nome da Preguiça: "+getNome()+"\nIdade: "+getIdade()+
                "\n O que ela  faz?  "+deveSubir);

        }
	
	public void emitirGrunido() {
        System.out.println("\n ahhhhhhh");
}
        public void sobePreguica() {
        System.out.println("\n A Preguica deve subir na árvore");
        }


}

