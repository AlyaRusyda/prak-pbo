package modul11;

class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("Ini adalah nilai dari variable private outerDemo");
            return num;
        }
    }
}

public class OuterDemoMain{
    public static void main(String[] args) {
        OuterDemo2 outer = new OuterDemo2();
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}