import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PesquisandoArquivosEmPastasSubpastas {

    public static void main(String[] args) throws IOException {

        Path pastaTmp = Path.of("tmp");

        try(Stream<Path> stream =  Files.find(pastaTmp, Integer.MAX_VALUE,
                (path, attrs) -> path.getFileName()
                        .toString()
                        .matches(".*\\.txt"))) {
            stream.forEach(System.out::println);
        }
    }
}
