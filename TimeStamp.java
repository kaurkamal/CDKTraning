import java.lang.annotation.*;
 
class YearValues{
public static final int y1 = 2015;
public static final int y2 = 2016;
public static final int y3 = 2017;
public static final int y4 = 2018;
public static final int y5 = 2019;
public static final int y6 = 2020;
}
enum DAY {
	MONDAY , TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
enum MONTH{
JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
}

enum YEAR {
 y1,y2,y3,y4,y5,y6;
}

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface TimeStamp {
DAY day();
MONTH month();
YEAR year();
}