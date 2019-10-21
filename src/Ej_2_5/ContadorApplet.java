package Ej_2_5;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorApplet extends Applet implements ActionListener{
	public class HiloContador extends Thread{
		boolean paro;
		long cont;
		HiloContador(long l){
			this.cont = l;
		}
		public void run() {
			paro=false;
		
			while(!paro) {
				try {
					Thread.sleep(300);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				repaint();
				cont++;
			}
			
		}
		public long getCont() {
			return cont;
		}
		public void setCont(long cont) {
			this.cont = cont;
		}
		
	}
	
	private HiloContador hilo1=new HiloContador(28);
	private HiloContador hilo2=new HiloContador(100);
	private Font fuente;
	private Button b1,b2;
	
	public void start() {
		hilo1.start();
		hilo2.start();
	}

	public void init() {
		this.setSize(600, 200);
		setBackground(Color.yellow);
		add(b1=new Button("Finalizar hilo 1"));
		b1.addActionListener(this);
		add(b2=new Button("Finalizar hilo 2"));
		b2.addActionListener(this);
		fuente=new Font("Verdana",Font.BOLD,26);
	}
	

	@Override

	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente);
		g.drawString("Hilo 1: "+Long.toString((long)hilo1.getCont()),80,100);
		g.drawString("Hilo 2: "+Long.toString((long)hilo2.getCont()),80,150);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			b1.setLabel("Hilo 1 Finalizado");
			hilo1.interrupt();
			//h1.setParar();
		}else {
			b2.setLabel("Hilo 2 Finalizado");
			//h2.setParar();
			hilo2.interrupt();		}
	}
	
	public void stop() {
		hilo1=null;
		hilo2=null;
	}
}
