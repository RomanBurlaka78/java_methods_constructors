public class Student {
    private String firstname;
    private String lastname;
    private int yearOfStudy;
    private boolean activeAccount;

    public Student(String firstname, String lastname, int yearOfStudy, boolean activeAccount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfStudy = yearOfStudy;
        this.activeAccount = activeAccount;
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }
}
