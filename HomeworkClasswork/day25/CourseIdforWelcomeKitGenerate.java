package day25;

public class CourseIdforWelcomeKitGenerate {
	 public static void main(String[] args) {
	String[] courses = {
			"Welcome Kit",
			"Online-Java Programming",
	    	"Online-Software Development Lifecycle",
	    	"Online-Software QA Testing",
	    	"Online-Team Activity",
	    	"Online-Mentoring", 
	    	"Online-Selenium",
	    	"Online-SQL",
	    	"Online-API Testing"
			} ;
int[] courseId = {143,166,168,170,163,203,169,171,164} ;
// use above two array to generate below messages
//The course id for <Welcome Kit> is<143>




  
  // System.out.println("<"+courses[i]+"> is <"+courseId[i]+">");
 
//find out the ID online Java Programming course
	for (int i = 0; i <courses.length; i++) {
		String eachCourse=courses[i];
		System.out.println(eachCourse);
		
	}

}


}