
public class Main {
public static void main (String[] args) {
	Carro fusca = new Carro ();
	fusca.setMarca("VolksWagen");
	fusca.setModelo("fusca");
	fusca.setCor("azul");
	fusca.setAno(2003);
	fusca.setQuantidadePortas(4);
	System.out.println("o carro � da marca: " + fusca.getMarca());
	System.out.println("o modelo �  : " + fusca.getModelo());
	System.out.println("o ano � : " + fusca.getAno());
	System.out.println("a cor � : " + fusca.getCor());
	System.out.println("e tem : " + fusca.getQuantidadePortas()+ "portas");
	
	Moto  yamaha = new Moto ();
	
	yamaha.setAno(2017);
	yamaha.setMarca("yamaha");
	yamaha.setModelo("factor");
	yamaha.setCor("vermelho");
	yamaha.setCilindrada(17);
	
	System.out.println("a moto � da marca: " + yamaha.getMarca());
	System.out.println("o modelo �: " + yamaha.getModelo());
	System.out.println("o ano �: " + yamaha.getAno());
	System.out.println("a cor �: " + yamaha.getCor());
	System.out.println("e tem: " + yamaha.getCilindrada() + " portas");
}

}