import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        // initialisation du nom de l'ingredient
        System.out.println("Saisir le nom de l'ingredient : ");
        String nom = clavier.nextLine();
        // initialisation de la quantité
        System.out.println("Saisir la quantité de " + nom + " : ");
        int quantite = clavier.nextInt();
        // initialisation de l'unité de l'ingredient
        System.out.println("Saisir l'unité de l'ingredient : ");
        String unite = clavier.next();
        // instantiation de ma class
        Ingredient monIngredient = new Ingredient(nom, quantite, unite);
        // affichage de la quantité, l'ingredient et l'unité
        System.out.println("la quantité est : " + monIngredient.getQuantite());
        System.out.println("Le nom de l'ingredient est : " + monIngredient.getNom());
        System.out.println("l' unite est : " + monIngredient.getUnite());
        // affichage de l'ingredient en entier
        System.out.println(monIngredient.afficher());
        //initialisation de la nouvelle quantité
        System.out.println("Veuiller saisir une nouvelle quantité : ");
        int nouvelleQuantite= clavier.nextInt();
        monIngredient.setQuantite(nouvelleQuantite);
        System.out.println("La nouvelle quantité est : " + monIngredient.afficher());



    }

}