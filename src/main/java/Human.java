public class Human {
    private int age;
    private String name;
    private String lastName;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Human(int age, String name, String lastName) {
        this.age = 10;
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastNameAndName() {
        return lastName+" "+name;
    }

    public Boolean ageIsGreaterThan30() {
        if (age > 30) {
            return true;
        }
        else return false;
    }
}
