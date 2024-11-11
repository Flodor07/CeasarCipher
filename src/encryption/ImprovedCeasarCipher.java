package encryption;

import java.util.Random;

public class ImprovedCeasarCipher extends Encryption{

    public ImprovedCeasarCipher(int key) {
        super(key);
    }

    @Override
    public String encrypt(String text) {
        String result = ""; // zurrückzugebene Zeichenkette

        Random rand = new Random(key);
        // Initialisierung der Klasse Random

        for (int i = 0; i < text.length(); i++) {
            // für i = 0 bis länge des Eingabetextes

            int asciiCode = text.charAt(i); // Zeichen an Stelle i

            // Generierung der Pseudoganzzufallszahl von 0 bis 26
            int randInt = rand.nextInt(26);

            // Verschiebung des AsciiCodes um den Schlüssel
            // und binden des wertes zwischen 97 - 122
            asciiCode = this.bound(asciiCode + randInt, 97, 122);

            // finale Zeichenkette "bauen"
            result = result + (char)asciiCode;
        }
        return result; // finale Zeichenkette zurrückgeben
    }

    @Override
    public String decrypt(String text) {
        return "not yet implemented";
    }
}
