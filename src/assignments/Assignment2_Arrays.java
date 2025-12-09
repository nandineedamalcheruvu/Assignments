package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {

		    int[] Semester = {1,2,3,4,5};

	        String[][][] subjectMarks = {
	            {{"Mathematics I","Pass(78)"},{"Physics","Pass(85)"},{"Chemistry","Fail(21)"},{"Computer Programming","Pass(74)"},{"Engineering Drawing","Pass(88)"},{"Basic Electrical Eng.","Pass(79)"}},
	            {{"Mathematics II","Pass(82)"},{"Mechanics","Pass(77)"},{"Environmental Sci.","Pass(93)"},{"Basic Electronics","Fail(19)"},{"Engineering Physics","Fail(24)"},{"Engineering Graphics","Pass(90)"}},
	            {{"Data Structures","Pass(88)"},{"Discrete Mathematics","Pass(81)"},{"Digital Electronics","Pass(76)"},{"Operating Systems","Fail(32)"},{"Signals and Systems","Pass(85)"},{"Object-Oriented Prog.","Pass(78)"}},
	            {{"Algorithms","Pass(91)"},{"Computer Networks","Pass(73)"},{"Database Systems","Fail(19)"},{"Microprocessors","Pass(80)"},{"Communication Eng.","Pass(76)"},{"Software Engineering","Pass(87)"}},
	            {{"Probability & Stats","Pass(86)"},{"Machine Learning","Pass(88)"},{"Compiler Design","Pass(84)"},{"Theory of Computation","Pass(95)"},{"Embedded Systems","Pass(73)"},{"Computer Graphics","Pass(90)"}}
	        };

	        // Semester 2 Subject 4 and 5 names
	        System.out.println("Semester " + Semester[1] + " Subject 4: " + subjectMarks[1][3][0]);
	        System.out.println("Semester " + Semester[1] + " Subject 5: " + subjectMarks[1][4][0]);

	        // Semester 4 Subject 3 and 6 Status/Marks
	        System.out.println("Semester " + Semester[3] + " Subject 3 Status/Marks: " + subjectMarks[3][2][1]);
	        System.out.println("Semester " + Semester[3] + " Subject 6 Status/Marks: " + subjectMarks[3][5][1]);
	        
	    	
	    };

	}


