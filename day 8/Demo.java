import java.util.jar.Attributes.Name;

class Address{
    int housenum;
    String areaname;
    String city;
    void setHousenum(int housenum){
        this.housenum=housenum;

    }
    void setAreaname(String areaname){
        this.areaname=areaname;
    }
    
    void setCity(String city){
        this.city=city;
    
    }

    int getHousenum(){
        return housenum;
    }
    String getAreaname(){
        return areaname;
    }
    String getCity(){
        return city;
    }
}

class Student{
    int id;
    String name;
    Address adr;
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setAdr(Address adr){
        this.adr=adr;
    }
    int getId(){
        return id;

    }
    String getName(){
        return name;
    }
    Address getAdr(){
        return adr;
    }
}

class Demo{
    public static void main(String args[])
    {
        Address ad=new Address();
        ad.setHousenum(1);
        ad.setAreaname("ABC");
        ad.setCity("Aurangabd");

        Student st=new Student();
        int x=101;
        st.setId(x);
        st.setAdr(ad);
        st.setName("xyx");

        int id1;
        id1=st.getId();
        String n;
        n=st.getName();
        Address ad1;
        ad1=st.getAdr();
        
        int hn;
        hn=ad1.getHousenum();
        String area;
        area=ad1.getAreaname();
        String city;
        city=ad1.getCity();
        System.out.println(n);
        

    }
}
