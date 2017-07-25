package Day8.src;
/**
 * Created by kaurk on 7/20/2017.
 */
class Person{
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        Person p1 = (Person) obj;
        if(p1.getName().equals(this.getName())&& p1.getGender().equals(this.getGender()))
            return true;
        else
            return false;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
