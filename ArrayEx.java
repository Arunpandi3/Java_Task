import java.util.Arrays;
class ArrayEx{
public static void main(String args[]){

//deepEquls
int t1 [] [] = {{1,2},{3,4}};
int t2 [] [] = {{1,2},{3,4}};
System.out.println(Arrays.equals(t1,t2));
System.out.println(Arrays.deepEquals(t1,t2));

//split
String data = "monica,vidhya,pavithra";
String name[] = data.split(",");
System.out.println(data);
System.out.println(Arrays.toString(name));

int val[] = {4,1,2,3,8,5,9,6,7};
int val2[] = {1,2,3,4,5};

//copyOf
int val3[] = Arrays.copyOf(val2,3);
System.out.println(Arrays.toString(val2));
System.out.println(Arrays.toString(val3));

//Arrays.equals
System.out.println(Arrays.equals(val,val2));

//Arrays.sort
System.out.println(val[0]);
Arrays.sort(val);
System.out.println(val[0]);

//for each
for(int i : val){
System.out.print(i);
}
System.out.println();

//Binary search

int find = 8;
int result = Arrays.binarySearch(val,find);
System.out.println(result);
}
}	