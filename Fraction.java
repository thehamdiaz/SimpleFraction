public class Fraction {
    // Fields (attributes)
    int num;
    int deno;
    double fraction;
    // Constructors
    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
        this.fraction = num/deno;
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