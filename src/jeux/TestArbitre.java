package jeux;

public class TestArbitre {
	
	static void arbitrer(Joueur j1, Joueur j2, JeuSimple jeu) {
		System.out.println("Jouons maintenant eu jeu : " +jeu.getNom());
		String tourJ1 = jeu.jouerUnTour();
		String tourJ2 = jeu.jouerUnTour();
		
		System.out.println("J1 joue : " +tourJ1);
		System.out.println("J2 joue : " +tourJ2);
		
		int gagnant = jeu.arbitrer(tourJ1, tourJ2);
		
		System.out.println("Gagnant : "+gagnant);
	}
	
	public static void main(String[] args) {
		JeuDe jd = new JeuDe();
		
		arbitrer(null,null,jd);
		
		JeuShifumi js = new JeuShifumi();
		
		arbitrer(null,null,js);
	}

}
