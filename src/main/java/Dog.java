public class Dog {
    Dog name;
    Dog age;
    Dog breed;

    public Dog(Dog name, Dog age, Dog breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog getName() {
        return name;
    }

    public void setName(Dog name) {
        this.name = name;
    }

    public Dog getAge() {
        return age;
    }

    public void setAge(Dog age) {
        this.age = age;
    }

    public Dog getBreed() {
        return breed;
    }

    public void setBreed(Dog breed) {
        this.breed = breed;
    }
}
