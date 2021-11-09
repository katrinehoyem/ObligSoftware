import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLeapYear {

    @Test
    public void year_divisible_by_4_not_100(){
        assertTrue(LeapYear.is_leap_year(16));
    }
    @Test
    public void year_divisible_by_400(){
        assertTrue(LeapYear.is_leap_year(2000));
    }
    @Test
    public void year_not_divisible_by_4(){
        assertFalse(LeapYear.is_leap_year(1995));
    }
    @Test
    public void year_divisible_by_100_not_400(){
        assertFalse(LeapYear.is_leap_year(2015));
    }


}
