import java.util.*;

public class Ob {
    public static void main(String args[]) {
        C1 o = new C1(122, 24);
        // System.out.println(o.a+" "+o.b );
        // o.a=120;
        // o.b=1000;
        // System.out.println(o.a+" "+o.b );

        /// Instiate object from class c2
        // C2 objC2= new C2(50,"brijesh", o);
        // System.out.println(objC2.a+" "+ objC2.b+" "+ objC2.c);
        // System.out.println(oo.a+" "+ oo.b+" "+ oo.c);

        // M objM=new M(10);
        // int val= objM.f(2,2,2);
        // System.out.println(val);

        // A a = new A();
        // int val = a.f(10);
        // System.out.println(val);
        // B b = new B();
        // int val2 = b.f(10);
        // System.out.println(val2);
        // int [] arr= new int []{1,2,3,4};
        // S ob =new S(4,arr,10);
        // ob.f();
        // ob.f2();


        // Q  e = new Q(2,4);
        // System.out.println(e.a + " " + e.b);

        // Ankit a = new Ankit(2,3,4);
        // System.out.println(a.a + " " + a.b+ " " + a.c);


        // Ankit A = new Ankit(2,3);
        // int result = A.Aman(1, 2, 3);
        // int result1 = A.Aman(1, 2, 3, 4, 5);

        // System.out.println(result);


        Sum a = new Sum(2, 3);
        int result = a.add(2, 3);
        int result1 = a.add(2, 3, 4);
        double result2 = a.add(2.2, 3, 4.3, 5);

        System.out.println(result);



    }

}

class C1 {
    int a, b;

    public C1(int val, int val1) {
        this.a = val;
        this.b = val1;
    }
}

class C2 {
    int a;
    String b;
    int c;

    public C2(int val, String s, C1 cls) {
        this.a = val;
        this.b = s;
        this.c = cls.a * cls.b;
    }
}

class M {
    int a, b;

    public M(int a) {
        this.a = a;
        this.b = a;
    }

    public int f(int x, int y) {
        int mul = this.a * this.b * x * y;
        return mul;
    }

    // method overloading
    public int f(int x, int y, int z) {
        int mul = this.a * this.b * x * y * z;
        return mul;
    }

}

// method oeverriding

class A {

    public int f(int a) {
        return a;
    }
}

class B extends A {

    // public int f(int x){
    // return x*2;
    // }
}

class S {
    int[] arr;
    String b;

    public S(int a, int[] num, int b) {
        this.arr = new int[10];
        this.b = "Ankit";
        for (int i = 0; i < num.length; i++) {
            this.arr[i] = num[i];
        }
    }

    public void f() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public void f2() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i]*100 + " ");
        }
    }
}

class Q {
    int a;
    int b;


    public Q( int vall, int val12) {
        this.a = vall;
        this.b = val12;

    }
}

class Ankit {
    int a;
    int b;

    public Ankit(int val, int val1) {
        this.a=val;
        this.b=val1;
    }

    public int Aman(int y, int x, int z ) {
        int mul = this.a * this.b*x*y*z;
        return mul;
    }

    public int Aman(int y, int x, int z, int n, int m) {
        int mul = this.a * this.b*x*y *z* n*m;
        return mul;
    }
}

class Sum {
    int a;
    int b;

    public Sum(int val, int val1) {
        this.a=val;
        this.b=val1;
    }

    public int add(int x, int y) {
        int add = (this.a + this.b + x + y);
        return add;
    }

    public int add(int x, int y, int z) {
        int add = (this.a + this.b +x+y+z);
        return add;
    }

    public double add(double x, int y, double z, int q) {
        double add = (this.a + this.b +x+y+z+q);
        return add;
    }
}
