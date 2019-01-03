public class Receipt extends ConsoleProgram {
    public void run() {
        // Compute total owed, assuming 8% tax and 15% tip
        int subtotal = 38 + 40 + 30;
    	double tax = .08;
    	double tip = .15;
        println("Subtotal: " + subtotal);
        println("Tax: " + subtotal * tax);
        println("Tip: " + subtotal * tip);
        println("Total: " + (subtotal + subtotal * tax + subtotal * tip));
    }
}
