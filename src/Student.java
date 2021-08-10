public class Student {
    private String name = "John";
    private String classes = "C02";

    public void setName1(String name) {
        this.setName(name);
    }

    public Student() {
    }

    void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public String toString() {
        String toString = "Name = " + getName() + " Class = " + getClasses();
        return toString;
    }
}