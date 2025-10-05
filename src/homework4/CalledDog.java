public class CalledDog {
    public enum PopularDogBreed {
        LABRADOR_RETRIEVER("Labrador Retriever"),
        GERMAN_SHEPHERD("German Shepherd"),
        GOLDEN_RETRIEVER("Golden Retriever"),
        BULLDOG("Bulldog"),
        POODLE("Poodle"),
        BEAGLE("Beagle"),
        ROTTWEILER("Rottweiler"),
        YORKSHIRE_TERRIER("Yorkshire Terrier"),
        DACHSHUND("Dachshund"),
        BOXER("Boxer");

        private final String breed;

        PopularDogBreed(String breed) {
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        @Override
        public String toString() {
            return breed;
        }
    }

    public static void main(String[] args) {
        CalledDogNumber dog1 = new CalledDogNumber("Marta", "Boxer", 2);
        CalledDogNumber dog2 = new CalledDogNumber("Bella", "Beagle", 3);
        CalledDogNumber dog3 = new CalledDogNumber("Bella", "Rottweiler", 1);

        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Dogs with the same name: " + dog1.getName());
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Dogs with the same name: " + dog2.getName());
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("Dogs with the same name: " + dog1.getName());
        } else {
            System.out.println("Dogs with different names");
        }

        if (dog1.getAge() > dog2.getAge()) {
            System.out.println("The youngest dog is: " + dog1.getName());
        } else if (dog2.getAge() > dog3.getAge()) {
            System.out.println("The youngest dog is: " + dog2.getName());
        } else {
            System.out.println("The youngest dog is: " + dog3.getName());
        }

    }
}
