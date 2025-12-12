package modul11;

public class NestedClass {
    String nama = "Alya Rusyda Maharistya";
    String nim = "L200240290";
    
    public void printNama() {
        System.out.println(nama + " : " + nim);
    }
    
    static class StaticNestedClass {
        static String jurusan = "informatika";
        
        public void aksesPrintNama() {
            NestedClass outer = new NestedClass();
            outer.printNama();
        }
    }
    
    class InnerClass {        
        public void aksesJurusan() {
            System.out.println("Jurusan: " + StaticNestedClass.jurusan);
        }
    }
}
