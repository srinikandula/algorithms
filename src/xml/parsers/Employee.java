package xml.parsers;

class Employee{
	  String id;
	  String firstName;
	  String lastName;
	  String location;

	  @Override
	  public String toString() {
	    return firstName+" "+lastName+"("+id+")"+location;
	  }
	}
