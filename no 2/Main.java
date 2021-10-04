public class Main {
    public static void main(String[] args){
        //membuat objek buku 1 dan 2
        Buku bukuPertama = new Buku("Harry Potter", "J.K. Rowling", 300.000);
        Buku bukuKedua = new Buku("UML", "Ivar Jacobson", 400.000);

        //menampilkan data buku 1
        System.out.println("Data Buku 1 :");
        System.out.println("Judul Buku : " + bukuPertama.getJudul());
        System.out.println("Pengarang Buku : " + bukuPertama.getPengarang());
        System.out.println("Harga Buku : " + bukuPertama.getHarga());
        System.out.println("");

        //menampilkan data buku 2
        System.out.println("Data Buku 2 :");
        System.out.println("Judul Buku : " + bukuKedua.getJudul());
        System.out.println("Pengarang Buku : " + bukuKedua.getPengarang());
        System.out.println("Harga Buku : " + bukuKedua.getHarga());


    }
}
