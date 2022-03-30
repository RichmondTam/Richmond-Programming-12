package CaeserCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher= new CaesarCipher();
        System.out.println(caesarCipher.encrypt("a",2));
        System.out.println(caesarCipher.decrypt("a",2));
    }
}
