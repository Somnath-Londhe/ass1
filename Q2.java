// Write a java program to display all the vowels from a given string.
public class Q2 {

    public static void main(String[] args) {
        // System.out.println("sdfgsfg"); String name="My anme is somnath"
        String Given_string = "somnath londhe";
        for (int i = 0; i < Given_string.length(); i++) {
            char name = Given_string.charAt(i);
            if (name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u') {
                System.out.print(name+" ");
            }
        }
    }
}
