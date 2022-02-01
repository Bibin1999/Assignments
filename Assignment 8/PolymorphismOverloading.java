package JavaProgram1;
class Disp {

	 
	  public void display() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print("*");
	    }
	  }

	  
	  public void display(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }
	}

public class PolymorphismOverloading {
	  public static void main(String[] args) {
	    Disp d1 = new Disp();
	    d1.display();
	    System.out.println("\n");
	    d1.display('#');
	  }
	}



	
