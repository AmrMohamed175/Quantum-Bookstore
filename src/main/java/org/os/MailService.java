package org.os;

public final class MailService {
     MailService() {}

    public static void send(String email, String title, String fileType) {
        System.out.printf(
                "Quantum book store: Mail Title : " + title + "Mail FileType : " + fileType + " Mail Email : " + email);
    }
}



