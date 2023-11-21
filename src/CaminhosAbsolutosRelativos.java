import java.nio.file.Path;

public class CaminhosAbsolutosRelativos {

    public static void main(String[] args) {

        Path caminhoAbsoluto = Path.of("C:\\Users\\avner\\IdeaProjects\\NIO\\tmp");
        Path caminhoRelativo = Path.of("tmp");

        System.out.println(caminhoAbsoluto);
        System.out.println(caminhoRelativo);
        System.out.println(caminhoRelativo.isAbsolute());
    }
}
