/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1strukturdata;

/**
 *
 * @author singupil
 */
public class Tugas1StrukturData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai [][]= new int[][]
        {
        /*Kolom*/
        {2,4,6,8},      /*baris*/
        {3,9,27,30},
        {4,16,20,24},
        {15,25,35,45},
    };
        
        int b, k;
        /* b = baris // k = kolom */ 
        for(b=0; b<4; b++){ /* menampilkan elemen atau index dari baris */
            for(k=0; k<5; k++){ /* menampilkan elemen atau index dari kolom */
                System.out.print(nilai[b][k]+ " "); /* mengakses berdasarkan baris atau kolom */
            }
            System.out.println(""); /* membuat garis baru atau spasi  */
        }
    }
}