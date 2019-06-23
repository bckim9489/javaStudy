public class TypeConversion {
    public static void main(String[] args){
        byte b =127;
        int i = 100;
        System.out.println(b+i); // maybe 227
        System.out.println(10/4); //maybe 2
        System.out.println(10.0/4); //maybe 2.5
        System.out.println((char)0x12340041); // maybe something character
        System.out.println((byte)(b+i)); //b+i is 227, so byte number of 227
        System.out.println((int)2.9+1.8); //maybe 3.8
        System.out.println((int)(2.9+1.8)); //maybe 4
        System.out.println((int)2.9+(int)1.8); //maybe 3
    }
}
