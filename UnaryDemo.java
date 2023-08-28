class UnaryDemo{
public static void main(String[] args){

int x=10,y,m=9,n;
//Post increment
y=x++;

System.out.println("X:"+x+" "+"Y:"+y);
//Pre Increment
n=++m;
System.out.println("M:"+m+" "+"N:"+n);
int a=10,b,c=9,d;
//Post decrement
b=a--;

System.out.println("A:"+a+" "+"B:"+b);
//Pre decrement
d=--c;
System.out.println("C:"+c+" "+"D:"+d);

}

}