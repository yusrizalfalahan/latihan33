/*
 * NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi user login
 */
package pbo2.pkg10117043.latihan33.user.login;

public class User {

    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword) {
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        }
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUserName) {
        this.cekAkun(parUserName, password);
        if (status = statusAkun) {
            System.out.println("");
            System.out.println("******HALLO " + parUserName + "******");
            System.out.println("Selamat datang di Aplikasi ini");
        } else {
            System.out.println("");
            System.out.println("Ooops, username atau password anda salah");
        }

    }

    public void pengecekkanLogin(String parUserName, String parPassword) {
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);

    }
}
