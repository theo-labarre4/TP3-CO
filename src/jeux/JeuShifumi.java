package jeux;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JeuShifumi extends JeuSimple {
	
	public enum Coups{PIERRE, FEUILLE, CISEAUX}
	
	private static final List<Coups> VALUES = Collections.unmodifiableList(Arrays.asList(Coups.values()));

	private static final int SIZE = VALUES.size();

	private static final Random RANDOM = new Random();
	
	public JeuShifumi() {
		this.nom = "Shifumi";
	}

	@Override
	public int arbitrer(String c1, String c2) {
		if (c1.compareTo(c2) == 0) {
			return 0;
		} else if (c1.compareTo(c2) == -1 || c1.compareTo(c2) == 2) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String jouerUnTour() {
		// TODO Auto-generated method stub
		
		return ""+VALUES.get(RANDOM.nextInt(SIZE));
	}

}
