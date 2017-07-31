package HackerRank;


import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference = 0;
    // Add your code here

    Difference (int[] a){
        this.elements = a;
    }

    void computeDifference(){
        for(int i = 0; i < elements.length; i++){
            for (int j = 1; j < elements.length - 1; j++) {
                int result = Math.abs(elements[i] - elements[j]);
                if(result > maximumDifference){
                    maximumDifference = result;
                }
            }

        }
    }

    int maximumDifference(){
        return maximumDifference;
    }

} // End of Difference class

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}