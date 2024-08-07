// Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //membuat obyek
        Siswa nabil = new Siswa();
        Siswa ardi = new Siswa();
        Siswa rufat = new Siswa();
        
        nabil.id = 1922;
        nabil.nama = "mohammad nabil anwar kencana";
        nabil.ipk = 9.0;
        System.out.println("ini data nabil");
        System.out.println(nabil.id);
        System.out.println(nabil.nama);
        System.out.println(nabil.ipk);

        System.out.println("ini data ardi");
        System.out.println(ardi.id);
        System.out.println(ardi.nama);
        System.out.println(ardi.ipk);

    }
}
