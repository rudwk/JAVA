package p35p61_doit;

public class p48_BitOperation {
	public static void main(String[] args) {
		byte x = (byte)0x00, y = (byte)0xFF, z;
		
		z = (byte)(x & y);
		System.out.println("&: " + z);
		
		z = (byte)(x|y);
		System.out.println("|: " + Byte.toUnsignedInt(z));
		
		z = (byte)(x^y);
		System.out.println("^: " + Byte.toUnsignedInt(z));
		
		z = (byte)~y;
		System.out.println("~: " + z);
	}
}
