public class Staff extends UEmployee{
    private String jobTitle;
    
    //constructor
    public Staff(){
        super();
        //jobTitle = "Manager";
    }

    public Staff(String name, double salary, String jobTitle){
        super(name, salary);
        this.jobTitle = jobTitle;
    }

    //@Override
    public String toString() {
        String staff = super.toString() + "\nJob Title: " + jobTitle;
        return staff;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
