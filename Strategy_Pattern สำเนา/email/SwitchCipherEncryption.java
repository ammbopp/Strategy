package Strategy_Pattern.email;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class SwitchCipherEncryption implements Encryption {
    @Override
    public String encrypt(String text) {
        char[] data = text.toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        return new String(data);
    }

    @Override
    public String toString() {
        return "SwitchCipherEncryption{}";
    }
}
