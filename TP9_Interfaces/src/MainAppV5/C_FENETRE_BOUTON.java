package MainAppV5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_FENETRE_BOUTON extends JFrame implements ActionListener {
	private static final long serialVersionUID=1L;
	private JButton monBouton;
	
	public C_FENETRE_BOUTON() {
		setTitle("Premier bouton");
		setSize(300,200);
		monBouton = new JButton("ESSAI");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(monBouton);
		monBouton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev) {
		System.out.println("action dur bouton ESSAI");
	}
}
