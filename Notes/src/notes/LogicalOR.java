package notes;

public class LogicalOR {

	public static void main(String[] args) {
		String team ="Tester";
		
		// the "&&" or "||" is used is called logical short circuit where need not to check for second condition accordingly
		if(team=="Developer" || team=="Tester") {
			System.out.println("They belong to Tech");
		}else
			System.out.println("They doesnt belong to tech");
				

	}

}
