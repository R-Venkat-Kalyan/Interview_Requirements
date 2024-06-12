class MyDetails {

    private long number;   // Private variable, not directly accessible from outside the class
    private String mail;   // Private variable, not directly accessible from outside the class
    public String name;    // Public variable, accessible from outside the class (not encapsulated)

    // Setter method for 'number'
    public void setNumber(long number){
        this.number = number;
    }

    // Getter method for 'number'
    public long getNumber(){
        return number;
    }

    // Setter method for 'mail'
    public void setMail(String mail){
        this.mail = mail;
    }

    // Getter method for 'mail'
    public String getMail(){
        return mail;
    }
}


public class EncapsulationExample {

    public static void main(String[] args) {

        MyDetails obj = new MyDetails();
        // Note the 'L' suffix to indicate a long literal as integer literals without any suffix are treated as int by default
        obj.setNumber(9776365777L);              // Setting the number using the setter method
        obj.setMail("2100030959cseh@gmail.com");  // Setting the mail using the setter method
        System.out.println("Printing Encapsulated Number and Mail");
        System.out.println(obj.getNumber() + " " + obj.getMail());  // Accessing the values using getter methods
        System.out.println(obj.name);   // Accessing UnEncapsulated value directly
    }
}
