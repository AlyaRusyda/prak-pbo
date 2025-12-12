package modul11;

public class OuterDemo {
    class Nested_Demo{
        
    }
    int num;
    private class InnerDemo{
        private void print() {
            System.out.println("Ini merupakan method inner class");
        }
    }
    
    void displayInner() {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}
