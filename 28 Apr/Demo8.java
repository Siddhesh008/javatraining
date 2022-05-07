//ArrayList class
import java.util.*;
public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> ar;
        ar=new ArrayList<>();
        System.out.println(ar.size());
        ar.add("a");
        ar.add("b");
        ar.add("c");
        ar.add("d");
        ar.add("e");
        System.out.println(ar.get(0));

        //add item at specific index
        ar.add(1, "x");
        System.out.println("By using for loop");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("BY for each loop");
        for (String s  : ar) {
            System.out.println(s);
            
        }
        System.out.println("by using iterator");
        Iterator<String> it;
        it=ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("by using list iterator");
        ListIterator it1;
        it1=ar.listIterator();
        System.out.println("forward");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("backward");
        while(it1.hasPrevious()){
            System.out.println(it1.previous());
        }

    }
    }
    }
    
    }
    }
    
}
