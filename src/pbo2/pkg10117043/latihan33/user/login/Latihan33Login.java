/*
 * NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi user login
 */
package pbo2.pkg10117043.latihan33.user.login;

import java.util.Scanner;

public class Latihan33Login {

    private String usName;
    private String passWord;

    public static void main(String[] args) {
        Latihan33Login login = new Latihan33Login();
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Masukan Username = ");
        login.usName = scanner.nextLine();

        System.out.print("Masukan Password = ");
        login.passWord = scanner.nextLine();

        user.pengecekkanLogin(login.usName, login.usName);
    }

}
