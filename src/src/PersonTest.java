import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getAge(){
        //Given
        Person bob=new Person();
        int expected=21;
        //When
        bob.setAge(21);
        int actual=bob.getAge();
        //Then
        Assert.assertEquals(expected,actual);

    }

}
