package aula1RlSystem;


public class Principal {
	
	public static void main(String args[]) {
		
		// Instânciar uma classe => Objeto
		
		Carros Fiat = new Carros();

		Fiat.ligar();
		/**Fiat.freio = false;
		Fiat.trocarMarcha();
		Fiat.acelerar(20);
		Fiat.trocarMarcha();
		Fiat.acelerar(40);
		Fiat.trocarMarcha();
		Fiat.acelerar(75);
		Fiat.desligar();*/
		
		
		Carros Ford = new Carros();
		
		Ford.desligar(); // cada objeto age de forma independente
		

		
	}
	
	

}



	
	



