public class HashCollisionExample {

    public static int hash(String key, int tableSize) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
             hashValue = (hashValue * 31 + key.charAt(i)) % tableSize;
         }
        return hashValue;
    }

    public static void main(String[] args) {
        int tableSize = 10;
        String string1 = "apple";
        String string2 = "paple";

        int hash1 = hash(string1, tableSize);
        int hash2 = hash(string2, tableSize);

        System.out.println("Hash of " + string1 + ": " + hash1);
        System.out.println("Hash of " + string2 + ": " + hash2);

        if (hash1 == hash2) {
            System.out.println("Collision detected!");
        } else {
            System.out.println("No collision.");
        }
    }
}