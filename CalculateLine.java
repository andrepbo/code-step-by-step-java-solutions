public class CalculateLine extends ConsoleProgram {
	public void run() {
		println( "This program calculates y coordinates for a line." );
		int x = 0;
		int slope = readInt( "Enter slope (m): " );
		int intercept = readInt( "Enter intercept (b): " );
		while( x >= 0 ) {
			x = readInt( "Enter x: " );
			if( x >= 0 ) {
				int y = ( slope * x ) + intercept;
				println( "f(" + x + ") = " + y );
			}
		}
	}
}
