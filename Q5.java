// Write a java program to display following pattern:
// 5
// 4 5 
// 3 4 5
// 2 3 4 5 
// 1 2 3 4 5

public class Q5 {
    public static void main(String[] args) {         
        for (int i = 1; i <= 5; i++) {
            int k=5;
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k--;
            }
            System.out.println("\t");
        }
    }
}
