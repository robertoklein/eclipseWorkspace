package modulo7;

import java.util.ArrayList;
import java.util.List;

public class BDSist {

	List<Pessoa> BDPes = new ArrayList<>();
	
	public Pessoa consultaRg(int i)  {
		for(Pessoa obj : BDPes) {
			if(obj.getRg() == i) {
				return obj;
			}
		}
		return null;
	}
	
	
}
