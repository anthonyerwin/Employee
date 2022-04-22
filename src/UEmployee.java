public class UEmployee {
    private String name;
    private double salary;

    public UEmployee(){
        //this.name = "Anthony Erwin";
        //this.salary = 420.69;
    }

    //constuctor
    public UEmployee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        String uemployee;

        uemployee = "\nEmployee name: " + name + "\nSalary: PHP" + salary;
        return uemployee;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
