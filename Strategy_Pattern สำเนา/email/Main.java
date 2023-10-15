package Strategy_Pattern.email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// 6510451123 อาณัฏฐชา กรรภิรมย์
public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");

        HashMap<String, List<Email>> mailboxes = new HashMap<>();
        List<Email> box1 = new ArrayList<>();
        List<Email> box2 = new ArrayList<>();
        mailboxes.put("Kate", box1);
        mailboxes.put("Ken", box2);

        EmailSystem emailSystem = new EmailSystem(mailboxes);

        Encryption caesarEncryption = new CaesarEncryption(2);
        Encryption switchCipherEncryption = new SwitchCipherEncryption();

        emailSystem.send(email1, caesarEncryption);
        emailSystem.send(email2, switchCipherEncryption);

    }
}



