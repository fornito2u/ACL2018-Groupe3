package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import engine.Cmd;
import engine.Game;
import model.Hero;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 *         Version avec personnage qui peut se deplacer. A completer dans les
 *         versions suivantes.
 * 
 */
public class MazeGame implements Game {

	private HeroPainter heropainter;

	private int limiteX;
	private int limiteY;

	/**
	 * constructeur avec fichier source pour le help
	 * 
	 */
	public MazeGame(String source, HeroPainter heropainter) {
		BufferedReader helpReader;
		this.heropainter=heropainter;
		this.limiteX = heropainter.getWidth();
		this.limiteY = heropainter.getHeight();
		try {
			helpReader = new BufferedReader(new FileReader(source));
			String ligne;
			while ((ligne = helpReader.readLine()) != null) {
				System.out.println(ligne);
			}
			helpReader.close();
		} catch (IOException e) {
			System.out.println("Help not available");
		}
	}

	/**
	 * faire evoluer le jeu suite a une commande
	 * 
	 * @param commande
	 */
	@Override
	public void evolve(Cmd commande) {
		System.out.println("Execute "+commande);
		if (commande.equals(Cmd.UP)) {
			this.heropainter.getHero().deplacer(0, -HeroPainter.UNITE_DEPLACEMENT);
		} else if (commande.equals(Cmd.DOWN)) {
			this.heropainter.getHero().deplacer(0,HeroPainter.UNITE_DEPLACEMENT);
		} else if (commande.equals(Cmd.LEFT)) {
			this.heropainter.getHero().deplacer(-HeroPainter.UNITE_DEPLACEMENT,0);
		} else if (commande.equals(Cmd.RIGHT)) {
			this.heropainter.getHero().deplacer(HeroPainter.UNITE_DEPLACEMENT,0);
		}
	}

	/**
	 * verifier si le jeu est fini
	 */
	@Override
	public boolean isFinished() {
		// le jeu n'est jamais fini
		return false;
	}

	public int getLimiteX() {
		return limiteX;
	}

	public void setLimiteX(int limiteX) {
		this.limiteX = limiteX;
	}

	public int getLimiteY() {
		return limiteY;
	}

	public void setLimiteY(int limiteY) {
		this.limiteY = limiteY;
	}

}
