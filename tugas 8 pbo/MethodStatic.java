public class MethodStatic {
    public static String nama = "NUR AINUN ZULKARNAIN";
    
    public static void cetakNama(){
	System.out.println("Nama saya "+nama);
    }
    public static void cetakUmur(int umur){
        System.out.println("Saya berumur "+umur+" tahun");
    }
    public static void main(String[] args){
        cetakNama();
        cetakUmur(19);         
    }
}
