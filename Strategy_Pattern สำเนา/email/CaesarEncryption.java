package Strategy_Pattern.email;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class CaesarEncryption implements Encryption {
    private int key;

    public CaesarEncryption(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(String text) {
        char[] data = text.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        return new String(data);
    }

    @Override
    public String toString() {
        return "CaesarEncryption{" +
                "key=" + key +
                '}';
    }
}