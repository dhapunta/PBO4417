class Buku{
      private String judul;
      private String pengarang;
      private String penerbit;
      private int tahun;

      public Buku(String judul,String pengarang,String penerbit,int tahun){
            this.judul = judul;
            this.pengarang = pengarang;
            this.penerbit = penerbit;
            this.tahun = tahun;
      }
      public void cetakBuku(){
            System.out.println("Judul     :"+this.judul);
            System.out.println("Pengarang :"+this.pengarang);
            System.out.println("Penerbit  :"+this.penerbit);
            System.out.println("Tahun     :"+this.tahun);
      }
}
public class BukuDemo {
      public static void main(String[]args){
            Buku buku1 = new Buku ("Naruto","Sugiono","Erlangga",2008);
            buku1.cetakBuku();
            Buku buku2 = new Buku ("One Piece","Ozawa Maria","Erlangga",2010);
            buku2.cetakBuku();
      }
}
