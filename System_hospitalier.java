package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête
		/* cette méthode analyse une requête passée en paramètre 		et retourne "requête analysée" s'il n'y a pas d'erreur
		Elle permet donc de savoir quelle requête a été bien
		analysée ou non*/
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Comparaison des données
		/*Cette méthode compare les données et retourne si un
		cluster est trouvé*/
		return "Cluster trouvé";
	}

}
