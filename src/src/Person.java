import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person implements CheckPerson {


    @Override
    public boolean test(Person p) {
        return false;
    }
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
   private  LocalDate birthday;
  private   Sex gender;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Person(){

    }

    public Person(String name, LocalDate birthday, Sex gender,String emailAddress){
this.name=name;
this.age=age;
this.birthday=birthday;
this.gender=gender;
this.emailAddress=emailAddress;
    }

    public void setAge(int age) {
         this.age=age;
    }
    public int getAge() {
        if(birthday == null){
            return -1;
        }
        // get the current time?
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    public void printPerson() {
        String output="%s is %d years old. They are a %s. find them at %s\n";
        System.out.format(output,name,getAge(),gender,emailAddress);
    }

    public  static void printPersons( List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
