public class Barang {
    //membuat attribut/variabel
    private String idProduk;
    private String nama;
    private Double harga;

    //membuat method/konstruktor 3 parameter
    public Barang(String idProduk, String nama, Double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    //membuat method/konstruktor 2 parameter
    public Barang(String idProduk, String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }

    //membuat method nama
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    //membuat method harga
    public void setHarga(Double Harga){
        this.harga = harga;
    }

    public Double getHarga() {
        return harga;
    }

    //membuat method idProduk
    public String getIdProduk(){
        return idProduk;
    }
}
