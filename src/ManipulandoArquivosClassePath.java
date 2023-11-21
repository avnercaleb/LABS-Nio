import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ManipulandoArquivosClassePath {

    public static void main(String[] args) throws IOException {

        Path novaPasta = Path.of("C:\\Users\\avner\\IdeaProjects\\NIO\\tmp");
        try {
            Files.createDirectory(novaPasta);
        } catch (IOException e) {
            System.out.println("O diretorio ja foi criado");
        }
        Path nomeArquivo = novaPasta.getFileName();
        Path nomePasta = novaPasta.getParent();

        System.out.println(nomeArquivo);
        System.out.println(nomePasta);
    }
}