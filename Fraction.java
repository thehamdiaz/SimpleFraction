public class Fraction {
    // Constant fractions
    public static final Fraction ZERO = new Fraction(1, 0);
    public static final Fraction UN = new Fraction(1, 1);

    // attributes
    int num;
    int deno;
    double fraction;

    //Constructors
    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
        this.fraction = (double) num/deno;
    }
    public Fraction(int num) {
        this.num = num;
        this.deno = 1;
        this.fraction = (double) num/deno;
    }
    public Fraction() {
        this.num = 0;
        this.deno = 1;
        this.fraction = (double) num/deno;
    }
    public Fraction(double fraction) {
        this.fraction = (double) fraction;
    }

    public int getNum() {
        return num;
    }

    public int getDeno() {
        return deno;
    }

    public double doubleValue() {
        return fraction;
    }

    public Fraction add(Fraction f){
        //common denominator
        int commonDeno = this.deno * f.getDeno();

        // Calculate the new numerators
        int newNum1 = this.num * commonDeno;
        int newNum2 = f.getNum() * commonDeno;

        int sumNum = newNum1 + newNum2;
        return new Fraction(sumNum, commonDeno);
    }   

    public boolean Equals(Fraction f) {
        return num * deno == f.getNum() * f.getDeno();
    }

    public String toString(){
        String value = Double.toString(fraction);
        return "I am a fraction and my value is: " + value;
    }

}
























/* 
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Other methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass("John Doe", 30);
        myObject.displayInfo();
    }
}
*/