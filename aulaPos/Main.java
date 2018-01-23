public class Main{
	public static void main(String[] args){

		Pai p = new Pai();
		p.nome="roberto";
		p.idade=28;
		//p.salario=2000; SALARIO PRIVATE

		System.out.println(p.nome);
		System.out.println(p.idade);
		//System.out.println(p.salario); SALARIO PRIVATE

		p.cadPai("roberto2",37,2000);

		p.calcSalario();

		p.impPai();


	}
}