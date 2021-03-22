package Matriks;
public class AksesElemen {
    public static void main (String[] args){
        int matrix[][] = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
         
        for (int i = 0; i < matrix.length; i++){ //i=0; 0<2-T //i=1; 1<2-T //i=2; 2<2-F
            for (int j = 0; j < matrix[0].length; j++){ //j=0; 0<2-T //j=1; 1<2-T //j=2; 2<2-F
                System.out.print(matrix[i][j] + " "); //m0,0=1 //m0,1=2 //m1,0 //m1,1
            }       
            System.out.println();
        }
        
       
         System.out.println();
         System.out.println(matrix[1][0]); 
                  System.out.println();
         System.out.println("Dwi Intan Af'idah");
    }
}
