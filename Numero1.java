import java.io.*;
import java.util.Scanner;

public class Numero1{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int[] ArrayDatos = RecopilarDatos();
		ImprimirDatos(ArrayDatos);
	}


	public static int[] RecopilarDatos(){
		int[] MatrizDiezNumeros= new int [11];

		for (int i=1; i<MatrizDiezNumeros.length; i++){
			System.out.println("Ingrese el numero de la fila: "+(i));
			int Numero = sc.nextInt();
			MatrizDiezNumeros[i]=Numero;
		}
		return MatrizDiezNumeros;
		}
	public static void ImprimirDatos(int[] NumerosMatriz){
		try{
			FileWriter fl= new FileWriter("./Numero1.text",true);
			PrintWriter pw = new PrintWriter(fl);
			for(int fila=1; fila<NumerosMatriz.length; fila++){
				pw.print("Fila "+fila+" Valor Ingresado = "+NumerosMatriz[fila]+"\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}
}


