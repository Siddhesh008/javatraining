class Students{
    private String  fname;
    private String lname;
    private int year;
    private String major;

    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getMajor() {
        return major;
    }public int getYear() {
        return year;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setMajor(String major) {
        this.major = major;
    }public void setYear(int year) {
        this.year = year;
    }

}

public class Program4 {
    public static void main(String[] args) {
        Students s1=new Students();
        Students s2=new Students();
        s1.setFname("ABC");
        s1.setLname("Y");
        s1.setMajor("CSE");
        s1.setYear(2022);

        s2.setFname("PQR");
        s2.setLname("V");
        s2.setMajor("ETC");
        s2.setYear(2021);

        System.out.println(s1.getFname());
        System.out.println(s1.getLname());
        System.out.println(s1.getMajor());
        System.out.println(s1.getYear());
System.out.println("*********************");
        
        System.out.println(s2.getFname());
        System.out.println(s2.getLname());

        System.out.println(s2.getMajor());
        System.out.println(s2.getYear());


    }
    
}
