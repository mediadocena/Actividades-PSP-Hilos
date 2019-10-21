package Ej_2_4;

import Utiles.Salieri;

public class MyHilo extends Thread{
	private SolicitaSuspender suspender = new SolicitaSuspender();
	Salieri ex = new Salieri();
	public boolean stop=false;
	public int contador=0;	
	public void Suspende() {suspender.set(true);}
	public void Reanuda() {suspender.set(false);}
	public void Finalizar() {this.stop = true;}
	public void run() {
		try {
			while(!stop) {
			suspender.esperandoParaReanudar();
			contador++;
			sleep(600);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println(contador);
	}
	
	
	
}
