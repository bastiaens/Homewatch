package Home.modele;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Classe de test d'objets de type Oeuvre.
 * @author Olivier et JL
 *
 */
public class OeuvreTest {

	@Test
	public void test() {
		Oeuvre o1 = new Oeuvre(12345,"Le bon,la brute et le truand", "Western","Leone", "Sergio", 1966, "Un classique du western spaghetti...");
		
		assertTrue(o1.getIdFilm() == 12345);
		assertFalse(o1.getGenre() == "Aventures");
		assertEquals(o1.getNomReal(),"Leone");
		
		Oeuvre o2 = new Oeuvre(54321,"Shutter Island","Thriller","Scorsese","Martin",2010,"Thriller psychologique avec DiCaprio.");
		assertFalse(o1.getGenre() == o2.getGenre());
		assertFalse(o2.getPrenomReal().equals(o1.getPrenomReal()));
		
		// Faire des transformations + modifications
		o1.setDate_parution(2015);
		assertFalse(o1.getDate_parution() == 1966);
		
	}

}