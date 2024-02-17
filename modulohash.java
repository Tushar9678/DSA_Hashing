public class modulohash{

    public static int hash(String key , int tab_size){
        int hash_value = 0;
        for(int i=0; i<key.length();i++){
            hash_value = (hash_value * 31 +key.charAt(i)) % tab_size;
        }
        return hash_value;
    }

    public static void main(String[] args){
        String key = "Tushar";
        int tab_size = 100;
        int hash_value = hash(key, tab_size);
        System.out.println("Hash value for '" + key + "': " + hash_value);

    }
}