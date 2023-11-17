public class SortZerosOnes {
    public static void main(String[] args) {
        int[] a={0,1,0,1,0,1,0,1,0,1};
        sortZerosAndOnes(a);
    }

    //Brute force solution
//    public static void sortZerosAndOnes(int[] a){
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//    }



    //Two Pointers technique
    public static void sortZerosAndOnes(int[] a){
        int left=0;
        int right=a.length-1;
        while (left<right){
            while(a[left]==0 && left<right){
                left++;
            }

            while(a[right]==1 && left<right){
                right--;
            }

            if(left<right){
                int temp=a[right];
                a[right]=a[left];
                a[left]=temp;
                left++;
                right--;
            }
        }

        for(int b:a){
            System.out.print(b+" ");
        }

    }


}
