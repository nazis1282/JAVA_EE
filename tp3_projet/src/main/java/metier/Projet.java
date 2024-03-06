package metier;

public class Projet {
	private Long idProjet;
	private String nomProjet;
	private double cout;
	
	public Projet() {
		super();
		}
		public Projet(String nomProduit, double prix) {
		super();
		this.nomProjet = nomProduit;
		this.cout = prix;
		}
	public Long getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

}
