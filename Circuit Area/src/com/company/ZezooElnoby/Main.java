	package com.company.ZezooElnoby;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int x =0;
int sum =0;
for (int i=sc.nextInt();i>0;i--){
String name =sc.next();
    if (name.equals("Tetrahedron"))x=4;
    if (name.equals("Cube"))x=6;
    if (name.equals("Octahedron"))x=8;
    if (name.equals("Dodecahedron"))x=12;
    if (name.equals("Icosahedron"))x=20;
    sum =sum+x;

}System.out.print(sum);

}


}
