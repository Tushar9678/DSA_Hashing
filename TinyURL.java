import java.util.*;

public class TinyURL{

    public static Map<Integer, String> map = new HashMap<>();

    public static final int tablesize = 100;
    
    //hashfunction
    public static int hash(String key , int tablesize){
        int hashValue = 0;
        for(int i=0; i<key.length(); i++){
            hashValue = (hashValue * 31 + key.charAt(i)) % tablesize;
        }
        return hashValue;
    }

    public static String encode(String longurl){
        int hashValue = hash(longurl, tablesize);
        map.put(hashValue,longurl);
        return "http://tinyurl.com/"+String.valueOf(hashValue);
    }

    public static String decode(String shorturl){
        return map.get(Integer.parseInt(shorturl.replace("http://tinyurl.com/",""))); 
    }


    public static void main(String[] args) {    
        String originalUrl = "https://skillcaptain.app/unicorn/course/show/all";

        String encodedUrl = encode(originalUrl);
        System.out.println("Encoded encodedUrl: " + encodedUrl);

        String decodedUrl = decode(encodedUrl);
        System.out.println("Decoded url: " + decodedUrl);
    }
}
