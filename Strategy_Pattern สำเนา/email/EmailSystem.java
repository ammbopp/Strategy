package Strategy_Pattern.email;

import java.util.HashMap;
import java.util.List;
// 6510451123 อาณัฏฐชา กรรภิรมย์

public class EmailSystem {
    protected HashMap<String, List<Email>> mailboxes;
    public void sendCaesar(Email m, int key) {
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        m.setText(new String(data));
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
    public void sendSwitchCipher(Email m) {

        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        m.setText(new String(data));
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }

    public EmailSystem(HashMap<String, List<Email>> mailboxes) {
        this.mailboxes = mailboxes;
    }
    public void send(Email m, Encryption encryptionStrategy) {
        String encryptedText = encryptionStrategy.encrypt(m.getText());
        m.setText(encryptedText);

        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }


}