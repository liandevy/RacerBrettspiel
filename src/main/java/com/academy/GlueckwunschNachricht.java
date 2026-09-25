
package com.academy;

import com.academy.autos.Auto;

// Erstellt eine persönliche Nachricht für den Gewinner.
public class GlueckwunschNachricht {

    // Bekommt das Gewinner-Auto und gibt einen Text zurück.
    public static String erstellen(Auto gewinner) {

        // Namen der Gewinner-Klasse holen.
        String name = gewinner.getClass().getSimpleName();

        // "Auto" am Ende des Namens entfernen.
        if (name.endsWith("Auto")) {
            name = name.substring(0, name.length() - 4);
        }

        // Persönliche Glückwunschnachricht zurückgeben.
        return "Herzlichen Glueckwunsch, " + name
                + "! Du hast das Rennen gewonnen!";
    }
}