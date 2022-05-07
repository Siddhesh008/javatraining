import java.util.*;
class Complex{

int real ,img;

Complex(){}

Complex(int tempreal , int tempimg){

real = tempreal ;
img = tempimg ;   

}

Complex addComp(Complex c1 , Complex c2)
{

Complex temp =  new Complex();
temp.real = c1.real + c2.real ;
temp.img = c1.img + c2.img ;


return temp;

}

Complex mulComp(Complex c1 , Complex c2)
{

Complex temp = new Complex();
temp.real = c1.real * c2.real ;
temp.img =  c1.img * c2.img;

return temp;


}

Complex subComp(Complex c1 , Complex c2)
{

Complex temp = new Complex();
temp.real = c1.real  - c2.real;
temp.img = c1.img - c2.img;

return temp;


}

}

public class Exercise5{
public static void main(String args[])
{

Complex ob1 = new Complex(1,4);
System.out.println("Complex number 1 : " + ob1.real
                           + " + i" + ob1.img);
Complex ob2 = new Complex(1,3);
System.out.println("Complex number 1 : " + ob2.real
                           + " + i" + ob2.img);
                           
Complex ob3 = new Complex();
ob3 = ob3.addComp(ob1,ob2);

System.out.println("Sum of complex number : "
                           + ob3.real + " + i"
                           + ob3.img);

ob3 = ob3.mulComp(ob1,ob2);
System.out.println("Multiplcation of complex number : "
                           + ob3.real + " + i"
                           + ob3.img);
                           
                       
ob3 = ob3.subComp(ob1,ob2);
System.out.println("Subtarction  of complex number : "
                           + ob3.real + " + i"
                           + ob3.img);
                                                 

                          
}
}