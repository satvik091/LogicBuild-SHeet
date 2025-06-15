import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

int count=0;
int mul=1;

for(int i=1;i<=a;i++){
count+=i;
mul*=i;
}


if(a%2!=0) System.out.print(mul);
else System.out.print(count);
}
}