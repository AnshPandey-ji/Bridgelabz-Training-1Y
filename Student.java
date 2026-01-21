class Student{
    // Non-static variables
    int rollNo = 10;
    String name = "Ram Sharma";
    double percent = 71.89;
    char result = 'P';

    void display()
    {
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Percent Marks = " + percent);
        System.out.println("Result = " + result);
    }

    public static void main(String[] args)
    {
        // Creating object to access non-static variables
        Student s = new Student();
        s.display();
    }
}