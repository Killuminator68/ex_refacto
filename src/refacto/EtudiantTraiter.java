package refacto;

import java.util.List;
import java.util.Optional;

public class EtudiantTraiter {
    private String nom;
    private List<Double> notes;

    public EtudiantTraiter(String nom, List<Double> notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public double calculerMoyenne() {
        return notes.stream()
            .mapToDouble(Double::doubleValue)
            .average()
            .orElseThrow(() -> new IllegalArgumentException("La liste de notes est vide"));
    }

    public Niveau obtenirNiveau() {
        double moyenne = calculerMoyenne();
        if (moyenne >= 90.0) {
            return Niveau.A;
        } else if (moyenne >= 80.0) {
            return Niveau.B;
        } else if (moyenne >= 70.0) {
            return Niveau.C;
        } else if (moyenne >= 60.0) {
            return Niveau.D;
        } else {
            return Niveau.F;
        }
    }
}

enum Niveau {
    A, B, C, D, F
}
