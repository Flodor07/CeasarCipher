package encryption;

public abstract class Encryption {
    protected int key;

    public Encryption(int key) {
        this.key = key;
    }

    protected int bound(int value, int low, int high)  {
        int diff = high - low;

        return  ((value - low) % diff) +low;
    }

    public abstract String encrypt(String text);
    public abstract String decrypt(String text);

}
