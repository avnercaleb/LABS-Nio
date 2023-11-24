import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DecodificandoByteBufferEmCharBuffer {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 108);
        byteBuffer.put((byte) -61);
        byteBuffer.put((byte) -95);

        byteBuffer.flip();
        //CharBuffer charBuffer = byteBuffer.asCharBuffer();
        CharBuffer charBuffer = StandardCharsets.UTF_8.decode(byteBuffer);
        System.out.println(charBuffer);
        //System.out.println(Arrays.toString("O".getBytes(StandardCharsets.UTF_8)));
    }
}
