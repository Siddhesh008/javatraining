@FunctionalInterface
interface A<T>{
    T add(T x, T y);
}
class Demo4{
    public static void main(String[] args) {
        //lambda
        A<Integer> ob=(x, y)->x+y;
        System.out.println(ob.add(10,20));
    }
}