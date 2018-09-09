import java.awt.*;
import java.awt.event.*;

public class EjercicioHilos1 {
	public static void main(String args[]) {
		new AbrirVentanaHilo();
		new DiasVividosHilo();
	}
}

class DiasVividosHilo extends Thread {
	DiasVividosHilo() {
		super();
		start();
	}

	public void run() {
		new DiasVividosMejorado().comunicarUsuario();
		System.exit(0);
	}
}

class AbrirVentanaHilo extends Thread {
	AbrirVentanaHilo() {
		super();
		start();
	}

	public void run() {
		int i = 0;
		while (i <= 600) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
			new VentanaPublicidad("Ventana coñazo", i);
			i += 125;
		}
	}
}

class VentanaPublicidad extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	VentanaPublicidad(String titulo, int i) {
		super(titulo);
		setBounds(i, 100, 400, 400);
		addWindowListener(this);
		setVisible(true);
		toFront();
	}

	public void windowActivated(WindowEvent e) {}

	public void windowClosed(WindowEvent e) {}

	public void windowClosing(WindowEvent e) {
		dispose();
	}

	public void windowDeactivated(WindowEvent e) {}

	public void windowDeiconified(WindowEvent e) {}

	public void windowIconified(WindowEvent e) {}

	public void windowOpened(WindowEvent e) {}
}