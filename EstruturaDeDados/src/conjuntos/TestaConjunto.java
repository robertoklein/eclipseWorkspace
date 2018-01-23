package conjuntos;

public class TestaConjunto {
	
	public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Marcelo");
        conjunto.adiciona("mauro");
        System.out.println(conjunto);
        
        conjunto.adiciona("Abel");
        conjunto.adiciona("roberto");
        System.out.println(conjunto);
        
        conjunto.adiciona("ronaldo");
        conjunto.adiciona("reinaldo");
        System.out.println(conjunto);
        
    }

}
