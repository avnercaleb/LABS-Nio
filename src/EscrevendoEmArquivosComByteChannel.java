import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EscrevendoEmArquivosComByteChannel {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("tmp\\contratos\\contrato003.txt");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 108);
        byteBuffer.put((byte) -61);
        byteBuffer.put((byte) -95);

        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.print(" ");
        }

        try(ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {

            byteBuffer.flip();
            channel.write(byteBuffer);
        }

    }
}
