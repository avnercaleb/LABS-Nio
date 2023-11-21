import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListandoConteudoDiretorios {

    public static void main(String[] args) throws IOException {

        Path pasta = Path.of("tmp");

        try (var stream = Files.list(pasta)){
            stream.filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(nome -> nome.matches(".*\\.md"))
                    .forEach(System.out::println);
        }
    }
}
