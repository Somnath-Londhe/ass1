// Write a java program to display alternate character from a given string.
public class Q4 {

    public static void main(String[] args) {
        String name="somnath";
        for (int i = 0; i < name.length(); i=i+2){
            System.out.print(name.charAt(i));   
        }
    }
}
