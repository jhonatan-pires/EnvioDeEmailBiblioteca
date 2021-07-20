package EnvioEmail.Biblio;

import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilizandoBibliotecas_Helper{
    public static void main(String[] args) throws IOException, EmailException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<String>();
        String tarefas = "";

        for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
            tarefas += linhas.get(iteracao) + "\\n"; // Repare aqui a quebra de linha.
        }
        String textoDoEmail = "Suas tarefas: \\n" + tarefas;

        System.out.println("Digite seu Email: ");
        String assunto = scanner.next();

        AutomatizacaoDoEmail_Aux.enviar("", "", "");


        /*for (int i = 0; i < 10; i++){
            String nome = scanner.nextLine();
            Linhas.add(nome);
        }*/

        Path arquivos = Paths.get("C:\\Users\\Pichau\\Desktop\\Testando\\textProg.txt");

        scanner.close();
        Files.write(arquivos, linhas);

    }

}
