package modul4;
public class ReadProtected {
    public static void main(String[] args) {
        ProtectedModifier pro = new ProtectedModifier();
        pro.printInfo();
        pro.sendMessage();
    }    
}
// Protected modifier bisa diakses di class lain dalam package yg sama