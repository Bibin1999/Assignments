package JavaProgram1;
class Lang {
	  public void display() {
	    System.out.println("Common English Language");
	  }
	}

	class Java extends Lang {

	  public void display() {
	    System.out.println("Java Programming Language");
	  }
	}

	public class PolymorphismOverriding {
	  public static void main(String[] args) {

	   
	    Java a1 = new Java();
	    a1.display();

	   
	    Lang b1 = new Lang();
	    b1.display();
	  }
	}



