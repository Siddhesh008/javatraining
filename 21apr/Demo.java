class Demo{
    public static void main(String[] args) {
        String s1="ABC";
        char arr[];
        arr=s1.toCharArray();
    int i;
for(i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
byte[] arr1;
arr1=s1.getBytes();
for(i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
}


    }
}