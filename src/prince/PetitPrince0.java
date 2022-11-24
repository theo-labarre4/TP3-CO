package prince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;
import jeux.Joueur;

public class PetitPrince0 implements Sujet, Joueur {
	
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince0(String nom) {
		this.nom = nom;
		this.argent = 0;
		this.console = new ConsoleJavaBoy(this);
		this.cpt = 0;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArgent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.console.parler("Salut c'est "+this.nom);
		this.console.seDirigerVers(0);

		if (this.console.regarder() != null) {
			
		}
	}

	@Override
	public void gagner(int argent) {
		this.argent += argent;		
	}

	@Override
	public void perdre(int argent) {
		this.argent -= argent;
	}

}
