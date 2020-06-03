import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * @ClassName IOTest
 * @Description TODO
 * @Author laijingshan
 * @Date 2020/5/26 23:15
 * @Version 1.0
 **/
public class IOTest {

    @Test
    public void ioTest() {
        int i = -1;
        System.out.println(toFullBinaryString(i));
        int i2 = 45;
        System.out.println(toFullBinaryString(i2));

        System.out.println(String.format("%8s", Integer.toBinaryString(i & 0xFF)).replace(' ', '0'));
    }

    @Test
    public void ioTest2() throws Exception{
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1".getBytes());
        int read = byteArrayInputStream.read();
        int read2 = byteArrayInputStream.read();
        int read3 = byteArrayInputStream.read();
        System.out.println(read);
        System.out.println(read2);
        System.out.println(read3);
        byteArrayInputStream.close();
    }


    /**
     * 将 int 类型数据转成二进制的字符串，不足 int 类型位数时在前面添“0”以凑足位数
     * @param num
     * @return
     */
    public static String toFullBinaryString(int num) {
        char[] chs = new char[Integer.SIZE];
        for(int i = 0; i < Integer.SIZE; i++) {
            chs[Integer.SIZE - 1 - i] = (char)(((num >> i) & 1) + '0');
        }
        return new String(chs);
    }

    /**
     * 将 long 类型数据转成二进制的字符串，不足 long 类型位数时在前面添“0”以凑足位数
     * @param num
     * @return
     */
    public static String toFullBinaryString(long num) {
        char[] chs = new char[Long.SIZE];
        for(int i = 0; i < Long.SIZE; i++) {
            chs[Long.SIZE - 1 - i] = (char)(((num >> i) & 1) + '0');
        }
        return new String(chs);
    }
}
