import java.util.*;
class SubsetSum {
    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        System.out.println("the iteration "+ind);
        if (ind == N) {
            System.out.println(sum);
            sumSubset.add(sum);
            return;
        }
        sum+=arr.get(ind);
        subsetSumsHelper(ind+1,sum,arr,N,sumSubset);
        sum-=arr.get(ind);
        subsetSumsHelper(ind+1,sum,arr,N,sumSubset);
    }   

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public static void main(String args[]) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

}