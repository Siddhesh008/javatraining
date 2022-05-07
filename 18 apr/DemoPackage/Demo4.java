package DemoPackage;

import DemoPackage.outer.Test1;
import DemoPackage.outer.inner.Test2;
class Demo4{
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.show();
        Test2 t2=new Test2();
        t2.disp();
    }
}