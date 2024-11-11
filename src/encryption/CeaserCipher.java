package encryption;

public class CeaserCipher extends Encryption{
    public CeaserCipher(int key) {
        super(key);
    }

    @Override
    public String encrypt(String text) {
        String result = ""; // Zurrückzugebene Zechenkette

        for (int i = 0; i < text.length(); i++) {
            // für i = 0 bis länge des Eingabetextes

            int asciiCode = text.charAt(i); // Zeichen an stelle i

            // Verschiebung des AsciiCodes um den Schlüssel
            // und binden des wertes zwischen 97 - 122
            asciiCode = this.bound(asciiCode + key, 97, 122);

            result = result + (char)asciiCode;
            // finale Zeichenkette "bauen"
        }
        return result;
    }


    @Override
    public String decrypt(String encryptedText) {
        String result = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            int asciiCode = encryptedText.charAt(i);
            asciiCode = this.bound(asciiCode + 25 - key, 97, 122);

            result = result + (char)asciiCode;

        }

        return result;
    }
}
