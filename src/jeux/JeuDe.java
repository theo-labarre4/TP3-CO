package jeux;

import java.util.Random;

public class JeuDe extends JeuSimple {
	
	private static final Random random = new Random();
	
	public JeuDe() {
		this.nom = "Dés";
	}

	@Override
	public int arbitrer(String c1, String c2) {
		// TODO Auto-generated method stub
		int scr1 = Integer.parseInt(c1);
		int scr2 = Integer.parseInt(c2);
		if (scr1 > scr2) {
			return -1;
		} else if (scr1 == scr2) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String jouerUnTour() {
		// TODO Auto-generated method stub
		return ""+random.nextInt(1, 6);
	}

}
