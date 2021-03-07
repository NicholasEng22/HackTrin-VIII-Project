class quicksort {
/*public static void main(String args[]){
int A[]={1,4,3,2,8,7,7,3,9}
quicksort(int A[])
}*/

public static void main (String args[]){

  int a[] = integer.parseInt(args[0]);
  int lo = integer.parseInt(args[1]);
  int hi = integer.parseInt(args[2]);
int i=lo, j=hi, h; // lo is the lower index, hi is the upper index
int x=a[(lo+hi)/2]; // of the region of array a that is to be sorted
do{ // partition
while (a[i]<x) i++; //if a[i] &lt; pivot, a[i] is on the correct side
while (a[j]>x) j--; //if a[j] &gt; pivot, a[j] is on the correct side
//so, move the iterators until each iterator rests on values
//that need to be swapped

if (i<=j){
h=a[i];
a[i]=a[j];
a[j]=h; // swapping values
i++;
j--;
}
}while (i<=j); //keep swapping until the two iterators meet
if (lo<j) quicksort(a, lo, j); // recursive call to Quick Sort left side
if (i<hi) quicksort(a, i, hi); // recursive call to Quick Sort right
//side;
}
}
