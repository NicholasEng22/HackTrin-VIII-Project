public class Student {
  private String name;
  private int gradeLevel;
  private double gpa;

  public Student(String name, int gradeLevel, double gpa) {
    setName(name);
    setGradeLevel(gradeLevel);
    setGpa(gpa);
  }

  public Student(Student stu) {
    setName(stu.name);
    setGradeLevel(stu.gradeLevel);
    setGpa(stu.gpa);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public String getName() {
    return name;
  }

  public int getGradeLevel() {
    return gradeLevel;
  }

  public double getGpa() {
    return gpa;
  }

  public int compareTo(Student stu) {
    return (int) (this.gpa - stu.gpa);
  }

  /*  It’s possible that stu1.compareTo(stu2) == 0 is true 
    even if stu1.getGPA() !=  stu2.getGPA(). When would this occur, and how could 
    we fix this?
 */

  public String toString() {
    return "name: " + name + " gradeLevel: "
    + gradeLevel + " GPA: " + gpa;
  }
  public static void main(final String[] array) {
    //Test methods here
   //Student(String name, int gradeLevel, double gpa) {
    Student stu1 = new Student("Mike",12, 3.55); //
    Student stu3 = new Student("Mike2", 12, 3.25);
    Student stu2 = new Student(stu1);

    //System.out.println(stu1.compareTo(stu3));
    System.out.println(stu1);
    System.out.println(stu1.toString());

  }
}
