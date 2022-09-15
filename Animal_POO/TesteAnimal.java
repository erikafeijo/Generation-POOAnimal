package Animal_POO;

public class TesteAnimal {

    public static void main(String[] args) {

         Cachorro doguinho = new Cachorro("Paçoca",2,"Au-Au","correr" );
         Cavalo poney = new Cavalo("Pe de Pano",5,"relinchar","corre");
         Preguica dorminhoca = new Preguica("Erika", 35, "ronca","subir na árvore");

         doguinho.imprimirInfo();
         doguinho.correDoguinho();
         doguinho.emitirLatido();
         poney.imprimirInfo();
         poney.correPedePano();
         poney.emitirRelincho();
         dorminhoca.imprimirInfo();
         dorminhoca.sobePreguica();
         dorminhoca.emitirGrunido();

    }

}
