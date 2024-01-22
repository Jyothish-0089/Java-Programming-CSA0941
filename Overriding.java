public class Overriding {
    int a;
    public class A {
        void get() {
            a = 10;
            System.out.println("a = "+a);
        }
    }
    public class B extends A {
        void get(){
            a = 20;
            System.out.println("a = "+a);
        }
    }
    public static void main(String args[]){
        B b = new B();
        b.get();
    }
}

