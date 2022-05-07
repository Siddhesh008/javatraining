import java.util.*;




class Asg2{
    public static void main(String[] args) {
            ArrayList <String> list=new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            printAll(list);


    }

    static void printAll(ArrayList<String> list) {
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}