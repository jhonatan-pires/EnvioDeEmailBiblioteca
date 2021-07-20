package EnvioEmail.Biblio;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UtilizandoBibliotecas {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "password")); // Coloque seu primeiro nome e sua senha do gmail
        email.setSSLOnConnect(true);
        email.setFrom("jhonatanpires636@gmail.com");
        email.setSubject("Utilização de biblioteca"); // Titulo do email
        email.setMsg("This is a test mail ... :-)"); //Mensagem que queira enviar para o email
        email.addTo("jhonatanpires229@gmail.com"); //Coloque seu email
        email.send();
    }
}
