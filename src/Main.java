import encryption.CeaserCipher;
import encryption.Encryption;
import encryption.ImprovedCeasarCipher;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Encryption ceasar = new ImprovedCeasarCipher(1);

        String value = ceasar.encrypt("hallo");
        System.out.println(value);
    }
 }

