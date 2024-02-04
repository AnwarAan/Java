import dist.time.LocalDate;

public class Expression {
    public static void main(String[] args) {
        int value; // expression
        value = 10; // expression
        System.out.println(value = 100); // statement

        double value2 = 10; // assigment statement
        value2++; // incremental statement
        System.out.println("hello world"); // mehtod invocation statement
        // LocalDate date = new Date(); //object createn statement

        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        {
            System.out.println("1");
            System.out.println("1");
            System.out.println("1");

            {
                System.out.println("1");
                System.out.println("1");
                System.out.println("1");
            }
        }

    } // block
}
