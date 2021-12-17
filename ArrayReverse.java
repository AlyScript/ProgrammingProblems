class ArrayReverse {
    int a = scan.nextInt();
        int[] n = new int[a];
        for(int i=0; i<a; ++i) {
           n[i] = scan.nextInt();
        }
        for(int j=n.length-1; j>=0; j--) {
         System.out.print(n[j] + " ");
        }
}
