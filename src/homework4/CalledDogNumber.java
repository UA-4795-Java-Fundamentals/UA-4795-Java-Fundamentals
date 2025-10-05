public class CalledDogNumber {
    private String name;
    private String breed;
    private int age;

    public CalledDogNumber(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public CalledDogNumber() {
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }

    public void getMaxAge(int age1, int age2, int age3) {
        System.out.println("The oldest dog is: " + Math.max(Math.max(age1, age2), age3));

    }
    }

