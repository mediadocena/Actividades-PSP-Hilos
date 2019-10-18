
public class main {

	public static void main(String[] args) {
			Hilo_TIC ic = new Hilo_TIC();
			Hilo_TAC ac = new Hilo_TAC();
		new Thread(ic).start();
		new Thread(ac).start();
	}

}
