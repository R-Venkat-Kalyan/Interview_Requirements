
// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base
{
	String name;

	// constructor 1
	Base()
	{
		System.out.println("No-argument constructor of base class");
	}

	// constructor 2
	Base(String name)
	{
        this();
		this.name = name;
		System.out.println("Calling parameterized constructor of base "+name);
	}
}

class Derived extends Base
{
	// constructor 3
	Derived()
	{
		System.out.println("No-argument constructor of derived");
	}

	// parameterized constructor 4
	Derived(String name)
	{
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}
}

public class ConstructorChainingSuper {

    public static void main(String[] args) {
        new Derived("Kalyan");
    }
    
}