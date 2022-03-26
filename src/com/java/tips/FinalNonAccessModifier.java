package com.java.tips;


final class FinalClass {

}

/* a final class can not be inherited

class SomeClass extends Final {

}
*/

class SomeClass {
    final public void DoSomething(){
    }
}

// a final method can't be extended
class SomeClass2 extends SomeClass{
//    public void DoSomething(){}
}

public class FinalNonAccessModifier {
    public static void main(String[] args) {


    }
}
