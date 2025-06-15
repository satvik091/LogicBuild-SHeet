import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
int count=0;
while(a!=0){
i=a%10;
count+=i;
a/=10;
}
System.out.print(count);
}
}