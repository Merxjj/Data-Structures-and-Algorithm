
import java.util.Arrays; 
class Pendulum2
{ 

static void pendulumArrangement(int arr[], int n) 
{ 

Arrays.sort(arr); 

int op[] = new int[n]; 

int mid = (n-1)/2; 


int j = 1, i = 1; 
op[mid] = arr[0]; 
for (i = 1; i <= mid; i++) 
{ 
op[mid+i] = arr[j++]; 
op[mid-i] = arr[j++]; 
} 

if (n%2 == 0) 
op[mid+i] = arr[j]; 

System.out.println("Pendulum arrangement:"); 
for (i = 0 ; i < n; i++) 
System.out.print(op[i] + " "); 
System.out.println(); 
} 

public static void main(String[] args) 
{ 

int arr[] = {14, 6, 19, 21, 12}; 

pendulumArrangement(arr, arr.length); 
} 
}
