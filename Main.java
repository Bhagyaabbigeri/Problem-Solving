
// 2. Keep everything public try accessing -- See the output

class Student {

    // Public variables
    public int x;
    public int y;
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Accessing public variables
        s1.x = 10;
        s1.y = 20;

        try {
            Thread.sleep(10000); // Pause for 10 seconds to allow debugging
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("X: " + s1.x);
        System.out.println("Y: " + s1.y);
    }
}
