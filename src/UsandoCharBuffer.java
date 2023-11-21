import java.nio.CharBuffer;

public class UsandoCharBuffer {
    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(1024);
        buffer.put('O');
        buffer.put('L');
        buffer.put('A');

        //System.out.println(Arrays.toString(buffer.array()));

        buffer.flip();
        buffer.chars()
                .forEach(c -> System.out.print((char)c));
    }
}
