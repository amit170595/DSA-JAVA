public class HashFunctionMod {
    public static void main(String[] args) {
        int arr[]={11,145,156,172,293,758};
        int hash[]= new int[10];
        for (int i=0;i<10;i++)
            hash[i]=-1;
        for(int i=0;i<6;i++)
            hash[arr[i]%10]=arr[i];
        for (int i=0;i<10;i++){
            if(hash[i]!=-1){
                System.out.println(i+" "+hash[i]);
            }
        }
        if(hash[172%10]==-1)
            System.out.println("False");
        else System.out.println(hash[172%10]);
    }
}