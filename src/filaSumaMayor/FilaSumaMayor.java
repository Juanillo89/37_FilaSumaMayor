package filaSumaMayor;

import java.util.Random;

public class FilaSumaMayor
{
	
	public static void main(String[] args)
	{
		Random ramd = new Random();
		final int filas = 6;
		final int col = 4;
		int suma;
		int maxSuma = 0;
		int maxFila = 0;
		int[][] rectangulo = new int[filas][col];
		for(int i = 0; i < filas; i++)
		{
			suma = 0;
			for(int j = 0; j < col; j++)
			{
				rectangulo[i][j] = ramd.nextInt(10) + 1;
				suma += rectangulo[i][j];
			}
			if(suma > maxSuma)
			{
				maxSuma = suma;
				maxFila = i + 1;
			}
		}
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(rectangulo[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n" + "La fila cuya suma de sus elementos es la mayor es la fila " + maxFila + ".");
	}
}

