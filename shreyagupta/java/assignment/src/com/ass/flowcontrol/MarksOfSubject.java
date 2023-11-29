package com.ass.flowcontrol;

public class MarksOfSubject {

	public static void main(String[] args) {
		int[] marksOfFiveSubjects = { 62, 47, 83, 71, 67 };
		MarksOfSubject marks = new MarksOfSubject();
		marks.avgMarksOfAllSubjects(marksOfFiveSubjects);
		marks.minAndMaxMarks(marksOfFiveSubjects);
	}

	public void avgMarksOfAllSubjects(int[] eachSubjectMarks) {
		int sum = 0;
		for (int subject = 0; subject < eachSubjectMarks.length; subject++) {
			sum = sum + eachSubjectMarks[subject];
		}
		System.out.println("average marks of 5 subjects: " + (sum / 5));
	}

	public void minAndMaxMarks(int[] eachSubjectMarks) {
		for (int index1 = 0; index1 < eachSubjectMarks.length; index1++) {
			for (int index2 = 0; index2 < eachSubjectMarks.length; index2++) {
				if (eachSubjectMarks[index1] > eachSubjectMarks[index2]) {
					int temp = eachSubjectMarks[index1];
					eachSubjectMarks[index1] = eachSubjectMarks[index2];
					eachSubjectMarks[index2] = temp;
				}
			}

		}
		System.out.println("minimum marks: " + eachSubjectMarks[eachSubjectMarks.length - 1]);
		System.out.println("maximum marks: " + eachSubjectMarks[0]);

	}
}
