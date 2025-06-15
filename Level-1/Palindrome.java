import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=a;
int i=0;
int reverse=0;
while(a!=0){
i=a%10;
reverse=reverse*10+i;
a/=10;
}
if(n==reverse) System.out.print(true);
else System.out.print(false);

}
}