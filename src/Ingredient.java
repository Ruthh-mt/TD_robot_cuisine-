public class Ingredient {
    // liste de nos attribut
    private String nom;
    private int quantite;
    private String unite;

    public Ingredient (String nom, int quantite, String unite) {
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;

    }
    public String afficher() {
        return this.nom + " : " + this.quantite + " " + this.unite;
    }
    public String getNom(){

        return this.nom;
    }

    public int getQuantite(){

        return this.quantite;
    }

    public String getUnite(){

        return this.unite;
    }

    public int setQuantite(int nouvelleQuantite){

        return this.quantite = nouvelleQuantite;
    }



}
