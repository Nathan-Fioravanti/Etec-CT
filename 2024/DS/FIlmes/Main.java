
public class Main {
			public static void main(String[] args) {
				Filme filme1 = new Filme();
				Filme filme2 = new Filme();
				Filme filme3 = new Filme();
				Filme filme4 = new Filme();
				Filme filme5 = new Filme();
				Filme filme6 = new Filme();
				Filme filme7 = new Filme();
				Filme filme8 = new Filme();
				Filme filme9 = new Filme();
				Filme filme10 = new Filme();
				
				
				
				//Filme 1
				filme1.setTitulo1("Os vingadores");
				filme1.setDuracaoEmMinutos(142);
				filme1.exbirDuracaoEmHoras();
				
				//Filme 2
				filme2.setTitulo1("Hotel Transilvânia");
				filme2.setDuracaoEmMinutos(93);
				filme2.exbirDuracaoEmHoras();
				
				//Filme 3
				filme3.setTitulo1("A escolha perfeita");
				filme3.setDuracaoEmMinutos(112);
				filme3.exbirDuracaoEmHoras();
				
				//Filme 4
				filme4.setTitulo1("Shang-Chi e a lenda dos 10 anéis");
				filme4.setDuracaoEmMinutos(132);
				filme4.exbirDuracaoEmHoras();
				
				//Filme 5
				filme5.setTitulo1("Liga da justiça (Zack Snyder)");
				filme5.setDuracaoEmMinutos(242);
				filme5.exbirDuracaoEmHoras();
				
				//Filme 6
				filme6.setTitulo1("A bela e a fera");
				filme6.setDuracaoEmMinutos(129);
				filme6.exbirDuracaoEmHoras();
				
				//Filme 7
				filme7.setTitulo1("Alladin");
				filme7.setDuracaoEmMinutos(128);
				filme7.exbirDuracaoEmHoras();
				
				//Filme 8
				filme8.setTitulo1("Vingadores ultimato");
				filme8.setDuracaoEmMinutos(182);
				filme8.exbirDuracaoEmHoras();
				
				//Filme 9
				filme9.setTitulo1("Divertida mente");
				filme9.setDuracaoEmMinutos(95);
				filme9.exbirDuracaoEmHoras();
				
				//Filme 10
				filme10.setTitulo1("Up: altas aventuras");
				filme10.setDuracaoEmMinutos(96);
				filme10.exbirDuracaoEmHoras();
				
				
				System.out.println("Os filmes em cartaz são: \n");
				
				System.out.println(filme1.getTitulo1() );
				System.out.println("Esse filme tem "+ filme1.getDuracaoEmMinutos()+ " minutos e "+ filme1.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme2.getTitulo1() );
				System.out.println("Esse filme tem "+ filme2.getDuracaoEmMinutos()+ " minutos e "+ filme2.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme3.getTitulo1() );
				System.out.println("Esse filme tem "+ filme3.getDuracaoEmMinutos()+ " minutos e "+ filme3.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme4.getTitulo1() );
				System.out.println("Esse filme tem "+ filme4.getDuracaoEmMinutos()+ " minutos e "+ filme4.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme5.getTitulo1() );
				System.out.println("Esse filme tem "+ filme5.getDuracaoEmMinutos()+ " minutos e "+ filme5.exbirDuracaoEmHoras() + " horas \n");
				
				
				System.out.println(filme6.getTitulo1() );
				System.out.println("Esse filme tem "+ filme6.getDuracaoEmMinutos()+ " minutos e "+ filme6.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme7.getTitulo1() );
				System.out.println("Esse filme tem "+ filme7.getDuracaoEmMinutos()+ " minutos e "+ filme7.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme8.getTitulo1() );
				System.out.println("Esse filme tem "+ filme8.getDuracaoEmMinutos()+ " minutos e "+ filme8.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme9.getTitulo1() );
				System.out.println("Esse filme tem "+ filme9.getDuracaoEmMinutos()+ " minutos e "+ filme9.exbirDuracaoEmHoras() + " horas \n");
				
				System.out.println(filme10.getTitulo1() );
				System.out.println("Esse filme tem "+ filme10.getDuracaoEmMinutos()+ " minutos e "+ filme10.exbirDuracaoEmHoras() + " horas \n");
			}
}
