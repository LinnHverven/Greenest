import javax.swing.*;

public class Greenest {
    public static void main(String[] args) {

        Växt igge = new Kaktus ("Igge", 0.2);
        Växt laura = new Palmer("Laura", 5.0);
        Växt meatloaf = new KöttätandeVäxter("Meatloaf", 0.7);
        Växt olof = new Palmer("Olof", 1.0);

        Växt[] växter = {igge, laura, meatloaf, olof}; 

        String växtNamn = JOptionPane.showInputDialog(null, "Vad heter den växt du vill behandla? ");

        for (Växt växt : växter) {
            if (växt.getName().equalsIgnoreCase(växtNamn)) {
                JOptionPane.showMessageDialog(null,
                        växt.getName() + " behöver " + växt.räknaVätska() + " liter " + växt.getVätska() + " per dag.");
                break;
            }
        }
    }
}

//Vidare måste du använda dig av någon form av polymorfism.
// Skriv en kommentar i koden där dessa förekommer så att Sigrun lätt kan se att du
//behärskar detta. Koden ska vara enkelt läsbar och prydligt skriven.