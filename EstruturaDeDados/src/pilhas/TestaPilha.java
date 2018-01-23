package pilhas;

import java.util.Stack;

public class TestaPilha {

	
	public static void main(String[] args) {
		
		
		//Pilha pilha = new Pilha();
		//pilha.insere("roberto");
		//pilha.insere("luiz");
		//pilha.insere("klein");
		//System.out.println(pilha);
		
		//pilha.remove();
		//System.out.println(pilha);
		
		//classe do java para implementacao de pilhas
		Stack<String> stack = new Stack<>();
		//push é o metodo adiciona
		stack.push("ricardo");
		stack.push("rodrigo");
		stack.push("rogerio");
		stack.push("ronaldo");
		
		System.out.println(stack);
		
		//pop é o metodo delete
		stack.pop();
		
		System.out.println(stack);
		//peek é o metodo para retornar o ultimo elemento sem apagar
		System.out.println(stack.peek());
		
		//System.out.println(stack);
		
		
	}
}
