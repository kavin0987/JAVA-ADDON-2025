
package ClassTask;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail1() { return email; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', email='" + email + "'}";
    }

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
