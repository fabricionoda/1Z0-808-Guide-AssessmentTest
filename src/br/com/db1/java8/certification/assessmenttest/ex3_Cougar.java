package br.com.db1.java8.certification.assessmenttest;

interface HasTail {
    int getTailLength();
}

abstract class Puma implements HasTail{
   // protected int getTailLength() {return 4;} // Error:(6, 19) java: getTailLength() in br.com.db1.java8.certification.assessmenttest.Puma cannot implement getTailLength() in br.com.db1.java8.certification.assessmenttest.HasTail    attempting to assign weaker access privileges; was public
}

public class ex3_Cougar extends Puma {

    public static void main(String[] args) {
       // Puma puma = new Puma(); //Error:(12, 21) java: br.com.db1.java8.certification.assessmenttest.Puma is abstract; cannot be instantiated
       // System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {return 2;}

    @Override
    public int getTailLength() {
        return 0;
    }
}

/*C, D, E. First, the method getTailLength() in the interface HasTail is assumed to be
public , since it is part of an interface. The implementation of the method on line 3 is
        therefore an invalid override, as protected is a more restrictive access modifier than
public , so option C is correct. Next, the class Cougar implements an overloaded ver-
        sion of getTailLength() , but since the declaration in the parent class Puma is invalid,
        it needs to implement a public version of the method. Since it does not, the declaration
        of Puma is invalid, so option D is correct. Option E is incorrect, since Puma is marked
abstract and cannot be instantiated. The overloaded method on line 11 is declared
        correctly, so option F is not correct. Finally, as the code has multiple compiler errors,
        options A, B, and G can be eliminated. For more information, see Chapter 5.*/


