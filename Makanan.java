public class Makanan extends Produk {

    @Override
    public double hitungHargaAkhir(int jmlhBeli) {
        System.out.println("Total harga=" + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.95;
    }
    
}