public class BitShiftOperator {
    public static void main(String[] args){
        short a = (short)0x55ff;
        short b = (short)0x00ff;
        //bit operator
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)a&b); // Bit AND
        System.out.printf("%04x\n", (short)a|b); // Bit OR
        System.out.printf("%04x\n", (short)a^b); // Bit XOR
        System.out.printf("%04x\n", (short)~a); // Bit NOT

        byte c = 20;
        byte d = -8;
        //shift operator
        System.out.println("[시프트 연산 결과]");
        System.out.println(c<<2); // 2bit shift left
        System.out.println(c>>2); // 2bit shift right, 0 added
        System.out.println(d>>2); // 2bit shift right, 1 added
        System.out.printf("%x\n", (d>>>2)); // 2bit shift right, 0 added
    }
}
