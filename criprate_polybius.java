import java.util.Scanner;

public class criprate_polybius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polybius a = new polybius();
		Scanner b = new Scanner(System.in);
		System.out.print("Introduceti textul pentru criptare");
		String plainText = b.nextLine();
		a.cipher(plainText);
	}
 
}
 