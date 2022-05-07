import java.util.stream.Stream;
class Demo{
    public static void main(String[] args) {
        Stream<Integer> s1=Stream.of(10,20,30,40);
        s1.forEach(p-> System.out.println(p));
        Integer arr[]={1,2,3,4};
        Stream<Integer> s2=Stream.of(arr);
        s2.forEach(x-> System.out.println(x*x));

    }
}