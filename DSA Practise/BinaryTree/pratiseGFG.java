package BinaryTree;
import java.util.*;
public class pratiseGFG {
    public  static void main(String[] args){
        int A[] = {3,1,4,5};
        System.out.println(solve(A.length,2,A));
    }
	static int solve(int N, int y, int [] A) {
	     Arrays.sort(A);
         for(int x: A) System.out.println(x);
	     int c = 0;
	     for(int i = 0; i < N;){
	         int li = findLeftIndex(N,A,i,A[i]);
	         int ri = findRightIndex(N,A,i,A[i]);
             System.out.println(li +" " + ri);
	         c = Math.max(c,ri - li + 1);
	         i = ri+1;
            //  System.out.println("err");
            break;
	     }
	     return c;
	}
	static int findLeftIndex(int N,int[] A,int i,int data){
	    int lo = i;
	    int hi = N-1;
	    int ans = -1;
	    while(lo <= hi){
	        int mid = lo+(hi-lo)/2;
	        if(A[mid] > data){
	            hi = mid - 1;
	        }else if(A[mid] < data){
	            lo = mid+1;
	        }else{
	            ans = mid;
	            hi = mid - 1;
	        }
            // System.out.println("err");
	    }
	    return ans;
	}
	static int findRightIndex(int N,int[] A,int i,int data){
	    int lo = i;
	    int hi = N-1;
	    int ans = -1;
	    while(lo <= hi){
	        int mid = lo+(hi-lo)/2;
	        if(A[mid] > data){
	            hi = mid - 1;
	        }else if(A[mid] < data){
	            lo = mid+1;
	        }else{
	            ans = mid;
	            lo = mid+1;
	        }
	    }
	    return ans;
	}
}