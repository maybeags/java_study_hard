package chapter16_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("안근수");     // final때문에 name변수는 꼭 대입돼야 함.
        Person person2 = new Person("안근순", 20); // AllArgsConstructor

        person1.setAge(38);

        System.out.println(person1);
        System.out.println(person2);

        PersonLombok person3 = new PersonLombok("김삼");
        person3.setAge(12);

        System.out.println(person3);

        PersonLombok person4 = new PersonLombok("김사", 19);
        System.out.println(person4);
    }
}
