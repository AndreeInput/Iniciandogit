import java.io.*;
import java.util.Scanner;

public class Numero2{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Ingrese la frase: ");
		String Frase = sc.nextLine();
		char[] ArrayFrase = Frase.toCharArray();

		System.out.println("----------------------------------");
		for (int Contador=0; Contador<ArrayFrase.length; Contador++){
			System.out.println(ArrayFrase[Contador]);
		}
		System.out.println("----------------------------------");

	}
}