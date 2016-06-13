package esp.spring.SpringCore;

public class Person {
private int pid;
private String name;
private String address;
public Person() {
	System.out.println("person object is created");
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", address=" + address
			+ "]";
}
}
