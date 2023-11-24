import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LendoArquivosComBuffersMenores {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("tmp\\contratos\\contrato001.txt");
        ByteBuffer buffer = ByteBuffer.allocate(10);

        try(ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {

            while(channel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);
                buffer.clear();
            }

        }
    }
}
