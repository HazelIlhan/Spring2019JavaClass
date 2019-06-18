package day41;

public class TeacherAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher akbar     = new Teacher();
		//akbar.name yazamaiz cunku fields are private we cant access it 
		//System.out.println(akbar.name); private
		//System.out.println(akbar.specialty);private 
		//lets give them a value 
		akbar.setName("Akbar");
		akbar.setSpecialty("magic");
		//LETS READ MY VALUES
		// WE NEED GETTER TO READ MY VALUE AND RETURN IT AS A VALUE
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
				
		akbar.setName("MagicMan");
		akbar.setSpecialty("release horse");
		
		System.out.println(akbar.getName());
		
		System.out.println(akbar.getSpecialty());
	}

}
