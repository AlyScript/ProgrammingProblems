class Solution {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
           a[i] = scan.nextInt();   // put input into array: loop runs for number of test cases/array size(n)
      }
        for(int j=a.length-1; j>=0; j--) {
         System.out.print(a[j] + " ");    // searching through the array in reverse, and printing the j'th element of array a
    }
}
