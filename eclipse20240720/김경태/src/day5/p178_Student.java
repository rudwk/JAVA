package day5;

class p178_Student {
	private String name;
	private int id, kor, eng, math;
	static int count = 0;

	void studentInfo(String name, int id, int kor, int eng, int math) {
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	double getAvg() {
		return (this.kor + this.eng + this.math) / 3.0;
	}

	String getInfo() {
		return this.name + ", " + this.id + ", " + this.kor + ", " + this.eng + ", " + this.math;
	}
	
	public int getId() {return this.id;}
	public int getKor() {return this.kor;}
	public int getEng() {return this.eng;}
	public int getMath() {return this.math;}
}