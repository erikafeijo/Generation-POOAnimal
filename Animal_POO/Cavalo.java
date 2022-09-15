package Animal_POO;

public class Cavalo extends Animal {
	
	private String deveCorrer;
	
	public Cavalo (String nome, int idade, String emitirSom, String deveCorrer) {
		super (nome,idade);
		
		this.deveCorrer = deveCorrer;	
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	public void imprimirInfo() {
        System.out.println("\n Nome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+
                "\n O que ele  faz?  "+deveCorrer);

        }
	
	public void emitirRelincho() {
        System.out.println("\n iriiriririr");
}
        public void correPedePano() {
        System.out.println("\n Cavalo correndo na fazenda");
        }


}

