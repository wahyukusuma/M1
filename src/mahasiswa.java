public class mahasiswa {
    private String name;
    private String nim;
    private String jurusan;
    private static String universitas = "Universitas Muhammadiyah Malang";

    public mahasiswa(String name, String nim, String jurusan) {
        this.name = name;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static void tampilkanUniversitas() {
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getMajor() {
        return jurusan;
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas: " + universitas);
    }

    public void getjurusan() {
    return;}


    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
