import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LocalClassTest {
    @Test
    void checkPerson(){
        List<Person> listOfPeople =new ArrayList<>();
        listOfPeople.add(new Person("Joe", LocalDate.of(2010, Month.APRIL,24)
                ,Person.Sex.MALE,"joehunt@gmail.com"));
        listOfPeople.add(new Person("Bob", LocalDate.of(2014, Month.AUGUST,11)
                ,Person.Sex.MALE,"BobLee@gmail.com"));
        listOfPeople.add(new Person("Jill", LocalDate.of(2000, Month.MARCH,24)
                ,Person.Sex.FEMALE,"Jillian@gmail.com"));
        listOfPeople.add(new Person("woman", LocalDate.of(2000, Month.DECEMBER,24)
                ,Person.Sex.FEMALE,"woman@gmail.com"));
        //When
        CheckPersonConcrete tester=new CheckPersonConcrete();

        Person.printPersons(listOfPeople,tester);
    }

}
