import java.util.ArrayList;

class Even{
    int N;

        ArrayList<Integer> ar;

        ArrayList<Integer> saveEvenNumbers(int N){
            ar=new ArrayList<>();
            for(int i=2;i<=N;i++){
                if(i%2==0){
                    ar.add(i);
                }
            }

            return ar;
        }
    ArrayList<Integer> Ar;
        ArrayList<Integer> printEvenNumbers(){
            Ar=new ArrayList<>();
            for(int j : ar){
                Ar.add(j*2);
                System.out.println(j*2);
            }


            return Ar;
        }


}
class Asg1{
    public static void main(String[] args) {
        Even en=new Even();
        en.saveEvenNumbers(20);
        en.printEvenNumbers();

    }
}