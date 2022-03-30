package CaeserCipher;

import java.lang.reflect.Array;
import java.util.HashMap;


public class CaesarCipher {
    final static char letters[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    HashMap<Character, Integer> map;

    public CaesarCipher(){
        map= new HashMap<>();
        for(int i=0;i<25;i++){
            map.put(Array.getChar(letters,i),i);
        }
    }



    public String encrypt(String Text,int key){
        String encryptedText = "";
        for(int i=0;i<Text.length();i++){
            char letter= Text.charAt(i);
            int shift=(map.get(letter)+key);
            encryptedText+= letters[shift];
        }return encryptedText;
    }
    public String decrypt(String Text,int key){
        String decryptedText = "";
        for(int i=0;i<Text.length();i++){
            char letter= Text.charAt(i);
            int shift=(map.get(letter)-key);
            if(shift<0){
                shift+=26;
            }
            decryptedText+= letters[shift];
        }return decryptedText;
    }


}
