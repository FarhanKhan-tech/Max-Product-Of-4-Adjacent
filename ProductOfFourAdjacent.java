/*
#########################################################
## File Name: SolvedSudokuValidator.java               ##
## Description: Calculating Max Product Of 4 Adjacent  ##
##             										   ##
## Programmed By: FARHAN KHAN						   ##
#########################################################
*/

import java.io.*;
 
class ProductOfFourAdjacent {
	
    public static int maxProduct(int[][] matirx,
                             int n, int m,
                             int k)
    {
        int max = 1, product = 1;
        for (int i = 0; i < n; ++i)
        {
            //Window Product for each row.
            int wp = 1;
            for (int l = 0; l < k; ++l)
            {
                wp *= matirx[i][l];
            }
            
            // Maximum window product for each row
            product = wp;
            for (int j = k; j < m; ++j)
            {
                wp = wp * matirx[i][j] / matirx[i][j - k];
                max = Math.max(
                    max,
                    Math.max(product, wp));
            }
        }
        return max;
    }
 
    public static void main(String[] args)
    {
 
        //Because of short of time 
        int row = 20, col= 20, k = 4;
        int[][] matirx= new int[][] {
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5,1, 2, 3, 4, 5 },				
			};
			for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matirx[i][j]+"\t");
			}
			System.out.println();
		}
        
        // Function call To Calculate Max Product For Four Adjacent
        int result = maxProduct(matirx, row, col, k);
        System.out.println(result);
    }
}
