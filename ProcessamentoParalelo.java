
public class ProcessamentoParalelo {

	public static void main(String[] args) {

		System.out.println("In�cio da thread");// MARCADORES DE TEXTO

		new PingPong("Ping", 1500).start();// HERDANDO DE THREAD DETERMINA O TEMPO O 1500(1,5SEG)
		new PingPong("Pong", 2000).start();// HERDANDO DE THREAD DETERMINA O TEMPO DE 2000 (2SEG)

		System.out.println("Final da thread");
	}

}
