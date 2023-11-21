import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class EntendendoBuffers {
    public static void main(String[] args) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(1024); //1 kb
        System.out.println("tamanho antes do flip: " + buffer.limit());
        System.out.println("posicao atual: " + buffer.position());

        buffer.put((byte) 10);
        System.out.println("posicao atual: " + buffer.position());
        System.out.println(Arrays.toString(buffer.array()));

        buffer.flip();
        System.out.println("posicao atual: " + buffer.position());
        System.out.println("tamanho depois do flip: " + buffer.limit());

        buffer.put((byte) 20);
        System.out.println(Arrays.toString(buffer.array()));

        buffer.clear();
        System.out.println("tamanho depois do clear: " + buffer.limit());
    }
}
