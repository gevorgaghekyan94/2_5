package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Dog extends Animal {

    private String name;
    private int age;
    private ArrayList<Puppy> puppies;

    public Dog() {
    }

    public Dog(String type, int weight, String name, int age, ArrayList<Puppy> puppies) {
        super(type, weight);
        this.name = name;
        this.age = age;
        this.puppies = puppies;
    }

    public void printName() {
        if (this.name == null) {
            System.out.println("The dog has no name");
        } else {
            System.out.println(this.name);
        }
    }

    public void bark() {
        System.out.println("Haf Haf");
    }

    public void giveBirthToOffSpring() {
        Random random = new Random();
        this.puppies = new ArrayList<Puppy>();
        int i = random.nextInt(4) + 2;
        while (i > 0) {
            Puppy puppy = new Puppy();
            puppy.setAge(1);
            this.puppies.add(puppy);
            i--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Puppy> getPuppies() {
        return puppies;
    }

    public void setPuppies(ArrayList<Puppy> puppies) {
        this.puppies = puppies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(puppies, dog.puppies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, puppies);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", puppies=" + puppies +
                '}';
    }
}
