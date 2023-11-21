import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OperacoesBasicasComClasseFiles {

    public static void main(String[] args) throws IOException {

        Path novoArquivo = Path.of("tmp\\arquivo001.txt");
        Path novaPasta = Path.of("tmp\\contratos");

        try {
            Files.createDirectory(novaPasta);
        } catch (IOException e) {
            System.out.println("As operações ja foram executadas");
        }

        Path novoContrato = novaPasta.resolve("contrato.txt");

        if(Files.exists(novaPasta)){
            System.out.println("Arquivo ja criado");
        } else {
            Files.createFile(novoContrato);
        }

    }
}
