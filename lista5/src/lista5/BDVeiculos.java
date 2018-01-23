//ROBERTO LUIZ KLEIN FILHO
package lista5;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

	private List<Veiculo> listaPasseio = new ArrayList<>();
	//private List<Veiculo> listaCarga = new ArrayList<>();
	
	
	
	public boolean verificaPlacaPasseio(String placa) throws VeicExistException{
		boolean existe = false;
		for(Veiculo v : listaPasseio) {
			if(v.getPlaca().equals(placa)) {
				existe = true;
				throw new VeicExistException();
			}
		}
		return existe;
	}
	
	public void cadPasseio(Veiculo v) {
		listaPasseio.add(v);
		System.out.println("cadastrado com sucesso!!!");
	}
	
	public List<Veiculo> listaVeiculosPasseio() {
		if(listaPasseio.isEmpty()) {
			return null;
		}else {
		return listaPasseio;
		}
	}
	
	public void removeVeiculo(Veiculo v) {
		Veiculo v2 = new Passeio();
		for(int i=0; i <=listaPasseio.size()-1;i++) {
			if(listaPasseio.get(i).getPlaca() == v.getPlaca()) {
				v2 = listaPasseio.get(i);
			}
		}
		listaPasseio.remove(v2);
	}
	
	public Veiculo listaPasseioPorPlaca(String placa) {
		Veiculo v = new Passeio();
		if(!listaPasseio.isEmpty())
			for(Veiculo ve : listaPasseio) {
				if(ve.getPlaca().equals(placa)) {
					v = ve;
				}
			}
		return v;
	}
}
