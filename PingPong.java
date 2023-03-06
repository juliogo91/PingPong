
public class PingPong extends Thread{

	private String palavra;
	private long tempo;
	
	public PingPong(String palavra, long tempo) {
		
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		
		try {
			
			for(int i = 0; i < 5; i++) {
				
				System.out.println(palavra);
				Thread.sleep(tempo);//AGUARDA O TEMPO PARA EXECUCAO
			
			}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
