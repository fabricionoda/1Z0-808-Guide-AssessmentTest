package br.com.db1.java8.certification.assessmenttest;

public class ex1 {
    private static int $;
    public static void main1(String[] args) {
	    String a_b;
        System.out.println($);
        //System.out.println(a_b); // Error:(8, 28) java: variable a_b might not have been initialized

        /*E. Option E is correct because local variables require assignment before referencing
        them. Option D is incorrect because class and instance variables have default values
        and allow referencing. a_b defaults to a null value. Options A, B, and C are incorrect
        because identifiers may begin with a letter, underscore, or dollar sign. Options F and
        G are incorrect because the code does not compile. If a_b was an instance variable, the
        code would compile and output 0null . For more information, see Chapter 1*/
    }
}
