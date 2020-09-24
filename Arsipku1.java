
package arsipku1;

public class Arsipku1 implements Biodata1, Nilai1 {
    
    
        public static void main(String[] args) {
        Arsipku1 ps = new Arsipku1();
        ps.Biodata();
        ps.nama();
        ps.tempatLahir();
        ps.hobi();
        ps.Nilai();
        ps.agama();
        ps.BahasaIndonesia();
        ps.matematika();
    }
    public void Biodata (){
        System.out.println("Biodata");
    }
    public void nama (){
        System.out.println("Nama         : Nava Dahlin Avriana");
    }
    public void tempatLahir (){
        System.out.println("Tempat Lahir : Jember");
    }
    public void hobi (){
        System.out.println("Hobi         : Tiktok");
    }
    public void Nilai (){
        System.out.println("Nilai");
    }
    public void agama (){
        System.out.println("Agama            : 80");
    }
    public void BahasaIndonesia (){
        System.out.println("Bahasa Indonesia : 75");
    }
    public void matematika () {
        System.out.println("Matematika       : 86");
    }
}

