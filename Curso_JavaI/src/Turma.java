public class Turma {

		String nome;
		int notas[] = new int[10];
		private static int totalTurmas;
		
		Turma(){
			Turma.totalTurmas = Turma.totalTurmas + 1;
		}
		
		public static int getTotalTurmas(){
			return Turma.totalTurmas;
		}
		
		public int[] getNotas() {
			return notas;
		}
		public void setNotas(int[] notas) {
			this.notas = notas;
		}	
}
