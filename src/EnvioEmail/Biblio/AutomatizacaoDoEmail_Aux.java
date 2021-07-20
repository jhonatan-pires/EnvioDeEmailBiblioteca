package EnvioEmail.Biblio;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class AutomatizacaoDoEmail_Aux {
    static void enviar(String assunto, String textoDoEmail, String add) throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "password")); // Coloque seu primeiro nome e sua senha do gmail
        email.setSSLOnConnect(true);
        email.setFrom("jhonatanpires636@gmail.com");
        email.setSubject(assunto); // Titulo do email
        email.setMsg(textoDoEmail); //Mensagem que queira enviar para o email
        email.addTo(add); //Coloque seu email
        email.send();

        System.out.println("Email Enviado:" + assunto + textoDoEmail);
    }
}
