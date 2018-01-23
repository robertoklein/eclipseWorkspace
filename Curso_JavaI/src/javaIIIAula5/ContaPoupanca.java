package javaIIIAula5;

public class ContaPoupanca extends Conta implements Comparable<Conta>{

	@Override
	public int compareTo(Conta o) {
		if(this.numero < o.numero) return -1;
		if(this.numero > o.numero) return 1;
		return 0;
	}

}
