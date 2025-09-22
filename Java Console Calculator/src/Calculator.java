import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        boolean running=true;
        while (running) {
            printMenu();
            String choiceStr = sc.nextLine().trim();
            int choice;
            try{
                choice= Integer.parseInt(choiceStr);
            } catch (NumberFormatException e){
                System.out.println("Invalid choice. Please enter a number (1-5).");
                continue;
            }
            if(choice == 5){ 
            running = false;
            System.out.println("Goodbye!");
            continue;
            }
            double a,b;
            try{
                System.out.print("Enter first number: ");
                a = Double.parseDouble(sc.nextLine().trim());
                System.out.print("Enter Second number: ");
                b= Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("Invalid number entered. Try again.");
                continue;
            }
            switch (choice) {
                case 1 -> System.out.println("Result: "+ add(a,b));
                    
                case 2 -> System.out.println("Result: "+ subtract(a,b));
                
                case 3 -> System.out.println("Result: "+ multiply(a,b));
                
                case 4 -> {
                    try {
                        System.out.println("Result: "+ divide(a,b));
                    } catch (ArithmeticException ex){
                        System.out.println("Error: "+ ex.getMessage());
                    } 
                }
                    
                    default -> System.out.println("Please choose a valid option (1-5).");
            }
        }
        }
    
    
        }
        private static void printMenu(){
            System.out.println("\n=== Java Console Calculator ===");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Exit");
            System.out.print("Choose an option: ");

        }
        
        public static double add(double x, double y) { return x+y; }
        public static double subtract(double x, double y) { return x-y; }
        public static double multiply(double x, double y) { return x*y; }
        public static double divide(double x, double y) {
            if (y == 0) throw new ArithmeticException("Cannot divide by zero");
            return x/y;
        }
        public static int add(int x, int y){
            return x+y; }
}
