public class Elektronik extends Produk {

    private int masaGaransi;

    @Override
    public double hitungHargaAkhir(int jmlhBeli) {
        System.out.println("Total harga=" + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.85;
    }
        
    
}
