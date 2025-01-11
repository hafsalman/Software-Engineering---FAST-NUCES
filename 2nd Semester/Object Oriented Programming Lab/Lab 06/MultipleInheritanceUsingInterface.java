
interface A {
    public void m1();
    public void m2();
}
interface B {
    public void m3();
    public void m4();
}

class C implements A,B{
    public void m1(){
        System.out.println("Interface A: Method 1 \n");
    }
    public void m2(){
        System.out.println("Interface A: Method 2 \n");
    }
    public void m3(){
        System.out.println("Interface B: Method 3 \n");
    }
    public void m4(){
        System.out.println("Interface B: Method 4 \n");
    }

}
public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {

        C obj1 = new C();
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m4();
        //System.out.println("Hello, World!");
    }
}
