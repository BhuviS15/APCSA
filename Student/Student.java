
/**
 * This Student class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Student
{
    private String studentName;
    private int studentID;
    private static String schoolName = "Barrington High School";
    private static int enrollment;      
    private static boolean isSchoolDay;                    

    public Student(String name, int id)
    {
        studentName = name;
        studentID = id;
        enrollment++;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public static String getSchoolName()
    {
        return schoolName;
    }

    public static int getEnrollment()
    {
        return enrollment;
    }

    public static boolean getIsSchoolDay()
    {
        return isSchoolDay;
    }

    public static void toggleIsSchoolDay()
    {
        isSchoolDay = !isSchoolDay;
    }

    public String toString()
    {
        String result = "   " + studentName;
        for (int i = result.length(); i < 25; i++)
            result += " ";
        result += studentID + "  " + schoolName + "       ";
        result += enrollment + "\t\t" + isSchoolDay;
        return result;
    }
}
