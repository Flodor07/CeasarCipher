package encryption;

public class CeaserCipher extends Encryption{
    public CeaserCipher(int key) {
        super(key);
    }

    @Override
    public String encrypt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
           int asciiCode = text.charAt(i);
           asciiCode = this.bound(asciiCode + key, 97, 122);

           result = result + (char)asciiCode;
           System.out.println(asciiCode);
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
