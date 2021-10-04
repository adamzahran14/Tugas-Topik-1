public class Main {
    public static void main (String[] args){
        //barang dengan konstruktor 2 parameter
        Barang barangSatu =  new Barang("BRG-001","Tas Gucci");
        Barang barangDua =  new Barang("BRG-002","Printer Epson L355");

        //barang dengan konstruktor 3 parameter
        Barang barangTiga =  new Barang("BRG-003","Koper", 150.0);
        Barang barangEmpat =  new Barang("BRG-004","Helm", 20.0);

        //menampilkan barang dengan konstruktor 2 parameter
        System.out.println("Data Barang :");
        System.out.println("Barang 1 : ");
        System.out.println("ID Produk = " + barangSatu.getIdProduk());
        System.out.println("Nama Barang = " + barangSatu.getNama());
        System.out.println("");

        System.out.println("Barang 2 : ");
        System.out.println("ID Produk = " + barangDua.getIdProduk());
        System.out.println("Nama Barang = " + barangDua.getNama());
        System.out.println("");

        //menampilkan barang dengan konstruktor 3 parameter
        System.out.println("Barang 3 : ");
        System.out.println("ID Produk = " + barangTiga.getIdProduk());
        System.out.println("Nama Barang = " + barangTiga.getNama());
        System.out.println("Harga Barang = $" + barangTiga.getHarga());
        System.out.println("");

        System.out.println("Barang 4 : ");
        System.out.println("ID Produk = " + barangEmpat.getIdProduk());
        System.out.println("Nama Barang = " + barangEmpat.getNama());
        System.out.println("Harga Barang = $" + barangEmpat.getHarga());

        //menampilkan total harga brg1, brg3, brg4
        System.out.println("Total harga BRG-001, BRG-003, dan BRG-004 : $" + (1200+150+20) );
    }
}
