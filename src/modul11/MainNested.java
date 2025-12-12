package modul11;

public class MainNested {
    public static void main(String[] args) {
        
        NestedClass.StaticNestedClass snc = new NestedClass.StaticNestedClass();
        snc.aksesPrintNama();
        
        NestedClass outer = new NestedClass();
        NestedClass.InnerClass ic = outer.new InnerClass();
        ic.aksesJurusan();
    }
}
