import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	public String nome;
	public String cnpj;
	public List<Funcionario> lista = new ArrayList<>();
	
	void adicionar(Funcionario f) {
	   lista.add(f);
	}
}
