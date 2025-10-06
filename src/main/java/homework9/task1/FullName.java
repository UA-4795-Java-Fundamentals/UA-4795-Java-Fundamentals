package homework9.task1;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FullName {
    private String firstName;
    private String lastName;

    @Getter
    @AllArgsConstructor
    public abstract static class Person {
        private final FullName fullName;
        private int age;

        public String info() {
            return "FirstName: " + fullName.getFirstName() + ", LastName: " + fullName.getLastName() + ", Age: " + age;
        }

        abstract public String activity();

    }
}