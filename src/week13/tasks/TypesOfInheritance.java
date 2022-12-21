package week13.tasks;

public class TypesOfInheritance {
    public static void main(String[] args) {
        A.staticMethod();
        B.staticMethod();
    }
}

class A {
    public static void staticMethod(){

    }
}

class B extends A{ // single inheritance

}

class C extends B{  // multi-level inheritance between A-B-C

}

class D extends A{ // hierarchical inheritance between A-B-D

}

