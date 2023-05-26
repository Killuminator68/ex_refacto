package refacto;

import java.util.List;

public class EtudiantARefacto {
    private String nom;
    private List<Double> notes;

    public EtudiantARefacto(String nom, List<Double> notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public double calculerMoyenne() {
        if (notes.isEmpty()) {
            throw new IllegalArgumentException("La liste de notes est vide");
        }

        double somme = 0.0;
        for (Double note : notes) {
            somme += note;
        }
        return somme / notes.size();
    }

    public String obtenirNiveau() {
        double moyenne = calculerMoyenne();
        String niveau;
        if (moyenne >= 90.0) {
            niveau = "A";
        } else if (moyenne >= 80.0) {
            niveau = "B";
        } else if (moyenne >= 70.0) {
            niveau = "C";
        } else if (moyenne >= 60.0) {
            niveau = "D";
        } else {
            niveau = "F";
        }
        return niveau;
    }
}

