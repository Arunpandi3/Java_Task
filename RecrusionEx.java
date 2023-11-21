class RecrusionEx{
//userdefined
public int sum(int num){
if(num==1){
return 1;
}else{
return sum(num-1)+num;//recrusion(calls iteself)
}
}
public static void main(String args[]){
RecrusionEx obj = new RecrusionEx();
System.out.println(obj.sum(4));
}
}