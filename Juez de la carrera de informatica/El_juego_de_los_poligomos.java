import java.util.*;
public class El_juego_de_los_poligomos {
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	try{
	while(true){
	int n = leer.nextInt();
	int a = leer.nextInt(),b=leer.nextInt(),c=leer.nextInt();
	int t=n-2;
	for (int j = 0; j<t; j++) {
		leer.nextLine();
	}
	if((n&1)==0)System.out.println("SI");
	else{
		int z=(a+1)%n ,y= (b+1)%n,x=(c+1)%n;
	    if(z==b&&y==c || z==c&&x==b || y==a&&z==c || y==c&&x==a || x==b&&y==a || x==a&&z==b)System.out.println("SI");
	    else System.out.println("NO");
	}
	}
	}catch(Exception e){
	}
	}
}
/*
6
0 1 2
2 4 3
4 2 0
0 5 4
5
0 1 2
2 3 4
2 4 0
5
0 2 4
0 1 2
2 3 4
50
0 2 4
0 1 2
2 3 4
4 5 6
6 7 8
8 9 10
10 11 12
12 13 14
14 15 16
16 17 18
18 19 20
20 21 22
22 23 24
24 25 26
26 27 28
28 29 30
30 31 32
32 33 34
34 35 36
36 37 38
38 39 40
40 41 42
42 43 44
44 45 46
46 47 48
48 49 0
4 6 8
8 10 12
12 14 16
16 18 20
20 22 24
24 26 28
28 30 32
32 34 36
36 38 40
40 42 44
44 46 48
4 8 12
12 16 20
20 24 28
28 32 36
36 40 44
44 48 0
4 12 20
20 28 36
36 44
 ... 

=================
Respuesta Correcta:
SI
SI
NO
SI
NO
NO
SI
NO
SI
NO
SI
NO
SI
SI
NO
NO
SI
NO
SI
SI
NO
SI
NO
NO
SI
NO
SI
SI
NO

*/
