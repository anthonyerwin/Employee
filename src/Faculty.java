public class Faculty extends UEmployee {
    private String department;

    //constructor
    //@Override
    public Faculty(){
        super();
        //this.department = "Management";
    }

    public Faculty(String name, double salary, String department){
        super (name, salary);
        this.department = department;
    }

    //@Override
    public String toString() {
        String faculty = super.toString() + "\nDepartment Name: " + department;
        return faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
