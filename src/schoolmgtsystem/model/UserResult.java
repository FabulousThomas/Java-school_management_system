/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.model;

/**
 *
 * @author Thomas
 */
public class UserResult {

    private String studentID;
//    private String email;
    private String firstName;
    private String surname;
//    private int courseCode;
    private String maths;
    private String english;
    private String accounting;
    private String commerce;
    private String chemistry;
    private String government;
    private String biology;
    private String geography;
    private String physics;

    public UserResult() {

    }

    public UserResult(String studentID, /*String email,*/ String firstName,
            String surname, /*int courseCode,*/ String maths, String english,
            String accounting, String commerce, String chemistry, String government,
            String biology, String geography, String physics) {

        this.studentID = studentID;
//        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
//        this.courseCode = courseCode;
        this.maths = maths;
        this.english = english;
        this.accounting = accounting;
        this.commerce = commerce;
        this.chemistry = chemistry;
        this.government = government;
        this.biology = biology;
        this.geography = geography;
        this.physics = physics;

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    public int getCourseCode() {
//        return courseCode;
//    }
//
//    public void setCourseCode(int courseCode) {
//        this.courseCode = courseCode;
//    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getAccounting() {
        return accounting;
    }

    public void setAccounting(String accounting) {
        this.accounting = accounting;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

}
