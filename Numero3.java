import java.io.*;
import java.util.Scanner;

public class Numero3{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Indique las filas de la matriz: ");
		int MatrizNo1 = sc.nextInt();
		System.out.println("Indique las columnas de la matriz: ");
		int MatrizNo2 = sc.nextInt();
		int[][] FilasMatriz = new int[MatrizNo1][MatrizNo2];
		int[][] ColumnasMatriz= rellenaArray(FilasMatriz);
		try{
			FileWriter fl= new FileWriter("./Numero3.text",true);
			PrintWriter pw = new PrintWriter(fl);
			int Filas;
			int Columnas;
			for(Filas = 0; Filas<ColumnasMatriz.length; Filas++){
				for (Columnas=0;Columnas<ColumnasMatriz[Filas].length;Columnas++){
				int MatrizCompleta = ColumnasMatriz[Filas][Columnas];
				pw.print(MatrizCompleta+" ");
				}
				pw.print("\n");
			}
			pw.close();
		}catch(Exception ex){
			System.out.println("Error"+ ex.getMessage());
		}
	}
	public static int[][] rellenaArray(int[][] Relleno){
		for (int ContadorNo1=0; ContadorNo1<Relleno.length; ContadorNo1++){
			for (int ContadorNo2=0; ContadorNo2<Relleno[ContadorNo1].length; ContadorNo2++){
				int NumeroAzar = (int)(Math.random()*10+1);
				Relleno[ContadorNo1][ContadorNo2]=NumeroAzar;	
			}
		}
		return Relleno;
	}
}

