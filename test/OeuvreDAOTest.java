package Home.modele;
/**
 * @author Olivier Bastiaens et JL
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OeuvreDAOTest {

	@Test
	public void test() {
		try
		{
			OeuvreDAO odao1 = new OeuvreDAO();
			
			OeuvreDAO odao2 = new OeuvreDAO();
			
			//je test la méthode rechercheGenreId 
			
			assertTrue(odao1.rechercheGenreId("Thriller") == odao2.rechercheGenreId("Thriller"));
			assertFalse(odao1.rechercheGenreId("Aventures") == odao2.rechercheGenreId("Thriller"));
			int Aventures = odao1.rechercheGenreId("Aventures");
			int Aventures2 = odao1.rechercheGenreId("Aventures");
			assertEquals(Aventures,Aventures2);
			
			//je test la méthode rechercheRéalisateurId 
			
			assertTrue(odao1.rechercheRéalisateurId("SPIELBERG", "Steven") == 1);
			assertFalse(odao1.rechercheRéalisateurId("SPIELBERG", "Steven") == 2);
			int idRea = odao1.rechercheRéalisateurId("SPIELBERG", "Steven");
			int idRea2 = odao1.rechercheRéalisateurId("SPIELBERG", "Steven");
			assertEquals(idRea,idRea2);
			
			Personne p1 = new Personne("Brode","Pytt");

			Personne p2 = new Personne("Oussa","Sam");
			
			Oeuvre filmPourri = new Oeuvre(1234,"lord", "Aventures", "Tarantino", "Quantin", 1995,"le conte de lord",p1.getNom(), p1.getPrenom() );
			odao2.addOeuvre(filmPourri);
			assertEquals(odao1.searchOeuvre(filmPourri.getTitre()), p1.getNom()); 

		}
		catch(IOException e)
		{
			
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		List<Oeuvre> liste1 = new ArrayList<>();
		List<Oeuvre> liste2 = new ArrayList<>();
		List<Personne> casting = new ArrayList<>();
		
		
	}

}
