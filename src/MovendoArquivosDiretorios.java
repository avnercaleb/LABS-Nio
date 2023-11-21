import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MovendoArquivosDiretorios {

    public static void main(String[] args) throws IOException {

        Path pastaDestino = Path.of("C:\\Users\\avner\\IdeaProjects\\NIO\\tmp\\contratos");
        Path arquivoASerMovido = Path.of("C:\\Users\\avner\\IdeaProjects\\NIO\\tmp\\arquivo001.txt");
        Path novoNome = Path.of("tmp\\arquivos");

        Files.move(pastaDestino, novoNome);
    }
}
