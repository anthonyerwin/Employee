public class Main {
    public static void main(String[] args) {
        UEmployee employee1 = new UEmployee("Maam R", 212121.21);
        UEmployee employee2 = new UEmployee("Sir M", 202020);

        Faculty faculty1 = new Faculty("Maam M", 25000, "Finance");
        Faculty faculty2 = new Faculty("Sir W", 999999.99, "Executive");

        Staff staff1 = new Staff("Anthony", 12, "Developer");
        Staff staff2 = new Staff("Erwin", 6.6666, "Junior Developer");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println(faculty1);
        System.out.println(faculty2);
        
        System.out.println(staff1);
        System.out.println(staff2);
    }
}
