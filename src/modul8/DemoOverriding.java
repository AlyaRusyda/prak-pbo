package modul8;

class ParentClaz {
    void printOut() {
        System.out.println("Ini adalah superclass");
    }
}

class ChildClaz extends ParentClaz {
    @Override
    void printOut() {
        System.out.println("Ini adalah subclass");
    }
    void hello() {
        System.out.println("Hello world");
    }
}

class DemoOverriding {
    public static void main(String[] args) {
        ParentClaz pc = new ParentClaz();
        ChildClaz cc = new ChildClaz();
        pc.printOut();
        cc.printOut();
    }
}
