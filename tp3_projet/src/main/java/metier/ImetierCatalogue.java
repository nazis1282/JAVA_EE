package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Projet> getProjetsParMotCle(String mc);

	public void addProjet(Projet p);
}