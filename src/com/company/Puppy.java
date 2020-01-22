package com.company;

public class Puppy extends Dog {

    @Override
    public void setAge(int age) {
        if (age > 0 && age <= 12) {
            super.setAge(age);
        }
    }
}
