/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class toko {
    public static void main(String[] args) {
        System.out.println("\nTOKO SERBA ADA ");
        System.out.println("********************");
        String[][] list_barang = {
            {"a1", "Buku", "4000"},
            {"a2", "Pensil", "2000"},
            {"a3", "Penghapus", "1500"},
            {"a3", "Penghapus", "1500"}
        };
        String[][] barang = new String[20][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Item Barang : ");
        int jml = input.nextInt();
        for (int i=0;i<jml;i++){
            System.out.println("Data ke "+(i+1));
            System.out.print("Masukkan kode : ");
            barang[i][0] = input.next();
            System.out.print("Masukkan jumlah beli : ");
            barang[i][1] = input.next();
        }

        System.out.println("\nTOKO SERBA ADA ");
        System.out.println("********************");
        int jumlah_bayar = 0;
        int total_bayar = 0;
        String nama_barang = "";
        String harga_barang = "";

        System.out.println("====================================================================");
        System.out.printf("%-5s%-13s%-13s%-8s%-13s%-13s\n",
                            "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        for (int i=0;i<jml;i++){
            for (int j=0;j<list_barang[0].length;j++){
                if(list_barang[j][0].equals(barang[i][0])){
                    nama_barang = list_barang[j][1];
                    harga_barang = list_barang[j][2];
                    jumlah_bayar = parseInt(list_barang[j][2])*parseInt(barang[i][1]);
                }
            }
            System.out.printf("%-8d%-10s%-13s%-13s%-8s%-13d\n",
                            (i + 1), barang[i][0], nama_barang, harga_barang, barang[i][1], jumlah_bayar);
            total_bayar += jumlah_bayar;
        }
        System.out.println("====================================================================");
        System.out.printf("%-52s","Total Bayar");
        System.out.println(total_bayar);
        System.out.println("====================================================================");
    }
}
