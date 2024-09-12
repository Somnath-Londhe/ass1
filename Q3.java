// Write a ‘java’ program to check whether given number is 
// Armstrong or not. (Use static keyword) 

public class q3 {
    static int n;

    public q3(int n) {
        this.n = n;

    }

    public void arm() {
        int rem, temp;
        int sum = 0;
        temp = n;
        while (temp != 0) {

            rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;

        }
        if (n == sum) {
            System.out.println("This is armstrong numbrer");
        } else {
            System.out.println("This is not an a armstrong number");
        }
    }

    public static void main(String args[]) {
        q3 a = new q3(15);
        a.arm();

    }

}