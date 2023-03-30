// Nama Fifian
// Stambuk 13020210133

interface A {
    public void fifian();
}

interface B extends A {

}

class Central0133 implements B {
    public void fifian() {
        System.out.println("fifian");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central0133 obj = new Central0133();
        obj.fifian();
    }
}
