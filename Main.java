public class Main {
  public static void main(String[] args) {
    Fraction fraction1 = new Fraction(45, 2);
    Fraction fraction2 = new Fraction(45);
    Fraction fraction3 = new Fraction();


    // Assertion 1
    assert  fraction1.toString().equals("I am a fraction and my value is: 22.5") : "Desired output: \"I am a fraction and my value is: 22.5\"";
    // Assertion 2
    assert  fraction2.toString().equals("I am a fraction and my value is: 45.0") : "Desired output: \"I am a fraction and my value is: 45.0\"";
    // Assertion 3
    assert  fraction3.toString().equals("I am a fraction and my value is: 0.0") : "Desired output: \"I am a fraction and my value is: 0.0\"";

    // Assertion 4 
    assert fraction1.doubleValue() == 22.5 : "This function should return a value of 22.5";

    // assert fraction1.getClass().getName().equals("double") : "this funtion should return a number of type double";
    System.out.println(fraction1.add(fraction2).toString());

    assert fraction1.add(fraction2).toString().equals("I am a fraction and my value is: 67.5") : "This should return a value of 22.5 + 45 = 67.5";
}

}