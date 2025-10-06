package homework9.task1;

class RunPerson {
    public static void main(String[] args) {
        FullName name = new FullName("Serhii", "Popovniak");
        FullName.Person person = new FullName.Person(name, 22) {
            @Override
            public String activity() {
                return "I`m alive";
            }
        };
        System.out.println(person.info());
        System.out.println(person.activity());

    }
}