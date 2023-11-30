package tdd.dawan.calculator.solid;

import java.util.List;

public class Personne {
    private String nom, prenom;
    private List<Account> comptes;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void createAccount(double deposit) {
        comptes.add(new Account(deposit));
    }
}
