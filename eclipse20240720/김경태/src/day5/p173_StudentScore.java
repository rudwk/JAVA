package day5;

public class p173_StudentScore {
	String name;
	int id, kor, eng, math;

	public static void main(String[] args) {
		int korSum = 0, engSum = 0, mathSum = 0;
		double totalSum = 0.0, korAvg, engAvg, mathAvg, totalAvg;

		p178_Student[] student = new p178_Student[3];
		student[0] = new p178_Student();
		student[0].studentInfo("name1", 20240725, 70, 80, 90);
		p178_Student.count++;
		student[1] = new p178_Student();
		student[1].studentInfo("name2", 20240725, 10, 20, 30);
		p178_Student.count++;
		student[2] = new p178_Student();
		student[2].studentInfo("name3", 20240727, 100, 50, 0);
		p178_Student.count++;

		for (int i = 0; i < p178_Student.count; i++) {
			System.out.println(student[i].getInfo());
			korSum += student[i].getKor();
			engSum += student[i].getEng();
			mathSum += student[i].getMath();
			totalSum += student[i].getAvg();
		}

		korAvg = ((double)korSum) / 3.0;
		engAvg = ((double)engSum) / 3.0;
		mathAvg = ((double)mathSum) / 3.0;
		totalAvg = totalSum / 3.0;

		System.out.println("±¹¾î Æò±Õ : " + korAvg);
		System.out.println("¿µ¾î Æò±Õ : " + engAvg);
		System.out.println("¼öÇÐ Æò±Õ : " + mathAvg);
		System.out.println("ÀüÃ¼ Æò±Õ : " + totalAvg);
	}
}
