import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimplificandoLeituraDeArquivosComClasseFiles {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("tmp\\contratos\\contrato001.txt");

        try(var stream = Files.lines(path, StandardCharsets.UTF_8)) {
            stream.forEach(System.out::println);
        }

    }
}
