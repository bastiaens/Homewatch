package Home.modele;
/**
 *Une classe Personne dans le cadre du projet java : Gestionnaire de films
 *Etudiant: Bastiaens Olivier/ Groupe n°19 / Classe 2TL2
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 *Une classe PersonneTest qui permet de tester l'objet de type Personne
 *</p>
 *@author Olivier Bastiaens
 */
public class PersonneTest {
	/**
	 *Test permettant de vérifier la méthode ToString
	 */
	@Test
	public void testToString() {
		Personne p1 = new Personne("Dupont", "Jules");
		Personne p2 = new Personne("Dupont", "Jules");
		assertEquals("Personne:DupontJules\n", p1.toString());
		assertTrue(p1.equals(p1));
		assertFalse(p1.equals(p2));	
	}

	/**
	 *Plusieurs tests permettant de vérifier les getters et setters
	 */

	@Test
	public void testGetNom() {
		Personne p = new Personne();
        p.setNom("Lavoine");
        assertTrue(p.getNom() == "Lavoine");
        assertFalse(p.getNom() == "jean");
		
	}

	@Test
	public void testSetNom() {
		Personne p1= new Personne();
		p1.setNom("Dupont");
		assertEquals("Dupont", p1.getNom());
		
	}

	@Test
	public void testGetPrenom() {
		Personne p = new Personne();
        p.setPrenom("Jules");
        assertTrue(p.getPrenom() == "Jules");
        assertFalse(p.getPrenom() == "Marc");
	}

	@Test
	public void testSetPrenom() {
		Personne p1= new Personne();
		p1.setNom("Harry");
		assertEquals("Harry", p1.getNom());
	}

}
