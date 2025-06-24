package FuncationPrac;

public class DataTypeAndMathOper {

	public static void main(String[] args) {
System.out.println("The Symbol / will give Quotient as the result :" +50/2);
System.out.println("The Symbol % will give Remainder as the result :" +21%6);
System.out.println();
System.out.println("***************");
System.out.println("Byte");
System.out.println(Byte.SIZE/8);
System.out.println(Byte.MAX_VALUE);
System.out.println(Byte.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("Short");
System.out.println(Short.SIZE/8);
System.out.println(Short.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("Interger");
System.out.println(Integer.SIZE/8);
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("Long");
System.out.println(Long.SIZE/8);
System.out.println(Long.MAX_VALUE);
System.out.println(Long.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("FLoat");
System.out.println(Float.SIZE/8);
System.out.println(Float.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("Double");
System.out.println(Double.SIZE/8);
System.out.println(Double.MAX_VALUE);
System.out.println(Double.MIN_VALUE);
System.out.println();
System.out.println("***************");
System.out.println("char");
System.out.println(Character.SIZE/8);

System.out.println();
byte i =10,j=30;
byte c;
System.out.println("Type casting the result of two byte variable addtion opertation in to byte:");
System.out.println( c=(byte)(i+j));

int d;
System.out.println("when Arithmetic Operations performed on two byte variable result should be integer:");
System.out.println( d=i+j);

int y=21;
int z=4;
int x;
System.out.println( y+z);
System.out.println(y-z);
System.out.println(y*z);
System.out.println(x=y/z);
System.out.println(y%z);




float f=4.25f;
float r;
System.out.println( y+f);
System.out.println(y-f);
System.out.println(y*f);
System.out.println(r=y/f);
System.out.println(y%z);

double dd=4.25f;
double rr;
System.out.println( y+dd);
System.out.println(y-dd);
System.out.println(y*dd);
System.out.println(rr=y/dd);
System.out.println(y%dd);


if(dd<=4)
	System.out.println("ptint");
else
	System.out.println("not print ");



	}

}
