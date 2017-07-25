import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Company {
String name();
String location();
}