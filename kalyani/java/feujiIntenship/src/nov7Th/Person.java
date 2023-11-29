package nov7Th;



public class Person  implements  Comparable<String> {
	private String personname;
  int personage;
  
public Person() {
	super();
}
public Person(String personname, int personage) {
	
	this.personname = personname;
	this.personage = personage;
}
public String getPersonname() {
	return personname;
}
public void setPersonname(String personname) {
	this.personname = personname;
}
public int getPersonage() {
	return personage;
}
public void setPersonage(int personage) {
	this.personage = personage;
}
@Override
public int compareTo(String o) {
	// TODO Auto-generated method stub
	return 0;
}

}
