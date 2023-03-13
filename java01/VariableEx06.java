public class VariableEx06 {
    public static void main(String[] args) {
        //숫자
        //정수형 - byte, short, int, long
        //실수형 - float, double

        int i = 1;
        System.out.println(i);
        
        byte b = 1;
        short s = 1;
        long l = 1L;
        
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        
        /* byte b1 = 128;
        System.out.println(b1); */

        //진수
        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;

        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        int bing1 = 1000000;
        // _ 도 숫자로 나타내는 숫자기호
        int bing2 = 1_000_000;
        System.out.println(bing1);
        System.out.println(bing2);
    }
}
