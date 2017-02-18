/**
 * Created by fatos on 18/02/2017.
 */
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;

public class UnitTestClass {

    Class<?> testClass;
    @Before
    public void method() throws ClassNotFoundException {

        testClass = Class.forName("MyTestClass");

    }

    @Test
    public void moreThanFourFields(){
        assertThat(Stream.of(testClass.getDeclaredFields()).collect(Collectors.toList()).size(), Matchers.lessThanOrEqualTo(4));
    }


    @Test
    public void anyNonPrivateFields(){
        assertThat(Stream.of(testClass.getDeclaredFields()).collect(Collectors.toList()).size(), Matchers.equalTo(0));
    }

    @Test
    public void anyFieldsOfTypeArray(){
        Stream.of(testClass.getDeclaredFields()).map(c -> c.getType().toString()).collect(Collectors.toList()).forEach(System.out::println);
        assertThat(Stream.of(testClass.getDeclaredFields()).anyMatch(c -> c.getType().toString().equalsIgnoreCase(ArrayList.class.toString())),Matchers.is(false));
    }

    @Test
    public void fewerThanTwoPrivateHelperMethods(){

    }

    @Test
    public void anyMethodsThaThrowsClause(){

    }

    @Test
    public void anyMethodThatReturnsAnInt(){

    }

    @Test
    public void missingZeroArgsConstructor(){

    }

}
