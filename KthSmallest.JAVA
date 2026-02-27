package q42211;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();

int[] arr = new int[n];
for(int i=0;i&lt;n;i++){
arr[i]=sc.nextInt();
}

int k=sc.nextInt();

if(k&lt;1||k&gt;n){
System.out.println(&quot;Invalid input&quot;);
return;
}
Arrays.sort(arr);
System.out.println(arr[k-1]);
}
}