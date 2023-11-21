import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopiandoArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path arquivoOrigem = Path.of("C:\\Users\\avner\\IdeaProjects\\NIO\\tmp\\contratos\\contrato.txt");
        Path pastaDestino = Path.of("tmp\\contrato.txt");

        Files.copy(arquivoOrigem, pastaDestino, StandardCopyOption.REPLACE_EXISTING);
    }
}
