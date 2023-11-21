import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExcluidoArquivos {

    public static void main(String[] args) throws IOException {

        Path arquivoDeletar = Path.of("tmp\\arquivos\\arquivo001.txt");
        Files.delete(arquivoDeletar);

    }
}
