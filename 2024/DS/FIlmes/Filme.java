
public class Filme {
		String titulo;
		double duracaoEmMinutos;
		
		
		public String getTitulo1() {
			return titulo;
		}
		public void setTitulo1(String titulo) {
			this.titulo = titulo;
		}
		public double getDuracaoEmMinutos() {
			return duracaoEmMinutos;
		}
		public void setDuracaoEmMinutos(int duracaoEmMinutos) {
			this.duracaoEmMinutos = duracaoEmMinutos;
		}
		
		
		
		
		
		double exbirDuracaoEmHoras() {
			double exbirDuracaoEmHoras = duracaoEmMinutos/60;
			return exbirDuracaoEmHoras;
	}
		
		
		
}
