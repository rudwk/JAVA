package day5;

public class p185_MyMath {
	static final double pi = 3.14159265358979323846;
	static final double KMPerMILE = 1.609344;
	
	static double getCirclePerimeter(double r) {return 2 * pi * r;}
	static double getCircleArea(double r) {return pi*r*r;}
	static double kilometerToMile(double km) {return km * 1/KMPerMILE;}
	static double mileToKilometer(double m) {return m * KMPerMILE;}
} 
