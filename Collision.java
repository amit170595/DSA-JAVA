public class Collision {
    public static void main(String[] args) {
        int arr[]={11,141,156,66,296,752};
        int hash[]= new int[11];
        for(int i=0;i<11;i++)
            hash[i]=-1;
        for(int i=0;i<6;i++)
            hash[arr[i]%11]=arr[i];
        for(int i=0;i<11;i++){
            if(hash[i]!=-1)
                System.out.println(i+" "+hash[i]);
        }
    }
}
