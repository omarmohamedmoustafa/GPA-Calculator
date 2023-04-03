package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    StudentData s1;
    String[] subject;
    ArrayList<Double> marks;

    @BeforeEach
   void setup(){
       Double [] arr = {7.0 , 10.0 , 20.0 ,60.0};
       marks = new ArrayList<Double>(Arrays.stream(arr).toList());
       s1 = new StudentData("John Doe","1234567a",marks);
       subject = new String[]{"Software Testing","CSE307s"};
    }


    // only alphabetic
    // FirstNotSpace
    @Test
    void studentNameValidation_PositiveScenario() {
        s1.setName("John Doe");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentNameValidation_PositiveScenario");
    }

    @Test
    void studentNameValidation_FirstSpace() {
        s1.setName(" John Doe");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student name",msg,"Failed @ : studentNameValidation_FirstSpace");
    }

    @Test
    void studentNameValidation_OnlyAlphabetic() {


        s1.setName("J9hn Doe");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student name",msg,"Failed @ : studentNameValidation_OnlyAlphabetic");
    }

    // exact 8 alphanumeric
    // first 7 digits are numbers
    // last digit (7) can be alphabetic or numeric
    // no special character anywhere

    @Test
    void studentIdValidation_PositiveScenario_LastChar() {

        s1.setId("1234567a");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ :  studentIdValidation_PositiveScenario_LastChar");
    }
    @Test
    void studentIdValidation_PositiveScenario_LastNum() {

        s1.setId("12345678");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentIdValidation_PositiveScenario_LastNum");
    }

    @Test
    void studentIdValidation_Exact8digits() {

        s1.setId("123456");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id",msg,"Failed @ : studentIdValidation_Exact8digits");
    }

    @Test
    void studentIdValidation_First7digitsWithChar() {

        s1.setId("a2345678");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id",msg,"Failed @ : studentIdValidation_First7digitsWithChar");
    }

    @Test
    void studentIdValidation_WithSpecialChar_atFirst() {

        s1.setId("#2345678");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id",msg,"Failed @ : void studentIdValidation_WithSpecialChar_atFirst");
    }

    @Test
    void studentIdValidation_WithSpecialChar_atMiddle() {

        s1.setId("2345_678");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id",msg,"Failed @ : studentIdValidation_WithSpecialChar_atMiddle");

    }

    @Test
    void studentIdValidation_WithSpecialChar_atEnd() {

        s1.setId("2345678$");
        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid student id",msg,"Failed @ : studentIdValidation_WithSpecialChar_atEnd");
    }


    //activity mark           >=0  <=10
    //Oral/practical mark     >=0  <=10
    //Midterm mark            >=0  <=20
    //Final mark              >=0  <=60


    //Activity Mark
    @Test
    void studentActivityMark_PositiveScenario()
    {
       marks.set(0,5.0);
       s1.setMarks(marks);

       String msg = Validation.IsStudentDataTrue(s1);
       assertEquals("valid",msg,"Failed @ : studentActivityMark_PositiveScenario");
    }

    @Test
    void studentActivityMark_Boundary_zero()
    {
        marks.set(0,0.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentActivityMark_Boundary_zero");
    }
    @Test
    void studentActivityMark_Boundary_10()
    {
        marks.set(0,10.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentActivityMark_Boundary_10");
    }

    @Test
    void studentActivityMark_SmallerThanBoundaries()
    {
        marks.set(0,-5.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid activity mark",msg,"Failed @ : studentActivityMark_SmallerThanBoundaries");
    }

    @Test
    void studentActivityMark_BiggerThanBoundaries()
    {
        marks.set(0,11.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid activity mark",msg,"Failed @ : studentActivityMark_BiggerThanBoundaries");
    }


    //Oral Mark
    @Test
    void studentOralMark_PositiveScenario()
    {
        marks.set(1,5.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentOralMark_PositiveScenario");
    }

    @Test
    void studentOralMark_Boundary_zero()
    {
        marks.set(1,0.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentOralMark_Boundary_zero");
    }
    @Test
    void studentOralMark_Boundary_10()
    {
        marks.set(1,10.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentOralMark_Boundary_10");
    }

    @Test
    void studentOralMark_SmallerThanBoundaries()
    {
        marks.set(1,-5.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid oral/practical mark",msg,"Failed @ : studentOralMark_SmallerThanBoundaries");
    }

    @Test
    void studentOralMark_BiggerThanBoundaries()
    {
        marks.set(1,11.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid oral/practical mark",msg,"Failed @ : studentOralMark_BiggerThanBoundaries");
    }


    //MidTerm Mark
    @Test
    void studentMidTermMark_PositiveScenario()
    {
        marks.set(2,15.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentMidTermMark_PositiveScenario");
    }

    @Test
    void studentMidTermMark_Boundary_zero()
    {
        marks.set(2,0.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentMidTermMark_Boundary_zero");
    }
    @Test
    void studentMidTermMark_Boundary_20()
    {
        marks.set(2,20.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentMidTermMark_Boundary_20");
    }

    @Test
    void studentMidTermMark_SmallerThanBoundaries()
    {
        marks.set(2,-5.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid midterm exam mark",msg,"Failed @ : studentMidTermMark_SmallerThanBoundaries");
    }

    @Test
    void studentMidTermMark_BiggerThanBoundaries()
    {
        marks.set(2,21.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid midterm exam mark",msg,"Failed @ : studentMidTermMark_BiggerThanBoundaries");
    }


    //Final Mark
    @Test
    void studentFinalMark_PositiveScenario()
    {
        marks.set(3,45.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentFinalMark_PositiveScenario");
    }

    @Test
    void studentFinalMark_Boundary_zero()
    {
        marks.set(3,0.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentFinalMark_Boundary_zero");
    }
    @Test
    void studentFinalMark_Boundary_20()
    {
        marks.set(3,60.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("valid",msg,"Failed @ : studentFinalMark_Boundary_20");
    }

    @Test
    void studentFinalMark_SmallerThanBoundaries()
    {
        marks.set(3,-25.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid final exam mark",msg,"Failed @ : studentFinalMark_SmallerThanBoundaries");
    }

    @Test
    void studentFinalMark_BiggerThanBoundaries()
    {
        marks.set(3,61.0);
        s1.setMarks(marks);

        String msg = Validation.IsStudentDataTrue(s1);
        assertEquals("Invalid final exam mark",msg,"Failed @ : studentFinalMark_BiggerThanBoundaries");
    }

    // Subject Name
    //  FirstNotSpace
    //  only alphabetic
    @Test
    void subjectName_PositiveScenario() {

        subject[0]="Software Testing";
        assertDoesNotThrow(() -> Validation.IsSubjectDataTrue(subject),"Failed @ : SubjectName_PositiveScenario");
    }

    @Test
    void subjectName_FirstSpace() {

        subject[0]=" Software Testing";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : SubjectName_FirstSpace");
    }

    @Test
    void subjectName_ContainNum() {

        subject[0]="Soft9are Testing";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : SubjectName_ContainNum");
    }

    @Test
    void subjectName_ContainSpecialChar() {

        subject[0]="Software Te$ting";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : SubjectName_ContainSpecialChar");
    }

    //Subject Code
    // 6-7 alphanumeric characters (3 alphapet + 3 numeric + ('s'))
    // last must  be s if size ==7
    // else 3 alphabet + 3 number
    @Test
    void subjectCode_PositiveScenario_with_s()
    {
        subject[1]="CSE307s";
        assertDoesNotThrow(() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_PositiveScenario_with_s");
    }
    @Test
    void subjectCode_PositiveScenario_without_s()
    {
        subject[1]="CSE307";
        assertDoesNotThrow(() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_PositiveScenario_without_s");
    }

    @Test
    void subjectCode_lengthBoundaries_lessThan6digits()
    {
        subject[1]="CSE30";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_lengthBoundaries_lessThan6digits");
    }
    @Test
    void subjectCode_lengthBoundaries_MoreThan7digits()
    {
        subject[1]="CSE3077s";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_lengthBoundaries_MoreThan7digits");
    }
    @Test
    void subjectCode_alphabeticBoundaries()
    {
        subject[1]="CS7307s";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_alphabeticBoundaries");
    }
    @Test
    void subjectCode_numericBoundaries()
    {
        subject[1]="CSEE307s";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_numericBoundaries");
    }
    @Test
    void subjectCode_InvalidOrder()
    {
        subject[1]="307CSE";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_InvalidOrder");
    }

    @Test
    void subjectCode_7thDigitIsNum()
    {
        subject[1]="CSE3079";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_7thDigitIsNum");
    }
    @Test
    void subjectCode_7thDigitIsCharNotS()
    {
        subject[1]="CSE307g";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_7thDigitIsCharNotS");
    }
    @Test
    void subjectCode_7thDigitIsSpecialChar()
    {
        subject[1]="CSE307%";
        assertThrows(IllegalArgumentException.class,() -> Validation.IsSubjectDataTrue(subject),"Failed @ : subjectCode_7thDigitIsSpecialChar");
    }

}
