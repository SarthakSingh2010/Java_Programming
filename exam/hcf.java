class hcf{
int a,b,h;
hcf(){
a=0;b=0;}
void input(int m,int n){
a=m;b=n;}
void calculate(){
int p=a*b;
for(int y=1;y<=p;y++){
if(a%y==0&&b%y==0)
h=y;}}
void display(){
System.out.println("HCF of "+a+","+b+" = "+h);
}
}
