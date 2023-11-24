import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class UsandoApiIOComImplementacaoNIO {

    public static void main(String[] args) throws IOException{

        Path path = Path.of("tmp\\contratos\\contrato001.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        try(BufferedReader reader = Files.newBufferedReader(path)) {

            reader.lines().forEach(System.out::println);
        }

        /*try(var inputStream = new FileInputStream(path.toFile());
            var channel = inputStream.getChannel()){

            channel.read(buffer);
            buffer.flip();
            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
            System.out.println(charBuffer);
        }*/
    }

}
