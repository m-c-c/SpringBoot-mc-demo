package mc.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123");
        System.out.println(username);
        System.out.println(password);
        // 3TcXa4Xo3RlbX7Tjfrtq7w==
        // 1zbgpxH2dRp7HzYBkbje/A==
        // S1HjFql0d6PZOOduDEBKJw==
        // VKAxhnhEjsIyCPO5mIhIRA==

    }
}
