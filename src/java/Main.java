public class Main {interface A { void m(); }

    interface B {
        void m();
        void anotherM();
        default void defaultM() { System.out.println("Default method in B"); }
        static void staticM() { System.out.println("Static method in B"); }
    }

    class C implements A, B {
        public void m() { System.out.println("Method implementation"); }
        public void anotherM() { System.out.println("Another method implementation"); }
    }

    public class Main {
        public static void main(String[] args) {
            C obj = new C();
            obj.m();
            obj.anotherM();
            obj.defaultM();
            B.staticM();
        }
    }
}
