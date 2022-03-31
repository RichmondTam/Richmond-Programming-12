package CaeserCipher;

import java.lang.reflect.Array;
import java.util.HashMap;


public class CaesarCipher {
    public char letters[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    HashMap<Character, Integer> map;

    //screate Map
    public CaesarCipher(){
        map= new HashMap<>();
        for(int i=0;i<25;i++){
            map.put(Array.getChar(letters,i),i);
        }
    }


    //shift letters from a to z
    public String encrypt(String Text,int key){
        String encryptedText = "";
        for(int i=0;i<Text.length();i++){
            char letter= Text.charAt(i);
            int shift=(map.get(letter)+key)%26;
            encryptedText+= letters[shift];
        }return encryptedText;
    }
    
    //shift letters from z to a
    public String decrypt(String Text,int key){
        String decryptedText = "";
        for(int i=0;i<Text.length();i++){
            char letter= Text.charAt(i);
            int shift=(map.get(letter)-key)%26;
            if(shift<0){
                shift+=26;
            }
            decryptedText+= letters[shift];
        }return decryptedText;
    }


}
