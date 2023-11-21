import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class ObtendoInformacoesArquivos {

    public static void main(String[] args) throws IOException {

        Path arquivo = Path.of("tmp\\contrato001.txt");
        Path pasta = Path.of("tmp");

        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("****************************************************************");
        }

        System.out.println("Tamanho: " +  Files.size(arquivo));
        System.out.println("Arquivo? " +  Files.isRegularFile(arquivo));
        System.out.println("Diretorio? " +  Files.isDirectory(arquivo));
        Instant ultimaAlteracao = Files.getLastModifiedTime(arquivo).toInstant();
        System.out.println(Files.list(pasta).toList());
    }
}
