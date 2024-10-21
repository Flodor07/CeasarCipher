import encryption.CeaserCipher;
import encryption.Encryption;
import encryption.ImprovedCeasarCipher;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Encryption encryption = new CeaserCipher(701203022);

        for (int i = 0;  i < 1000; i++) {

            String s = encryption.encrypt("test");
            System.out.println(s);
            System.out.println(encryption.decrypt(s));
        }
    }

 }

