package CaeserCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher= new CaesarCipher();
        System.out.println(caesarCipher.encrypt("abc",2));
        System.out.println(caesarCipher.decrypt("abc",2));
    }
}
