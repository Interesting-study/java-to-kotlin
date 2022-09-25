package com.lannstark.lec12;

import lec12.Person;

public class JavaPerson {

  private static final int MIN_AGE = 1;

  public static JavaPerson newBaby(String name) {
    return new JavaPerson(name, MIN_AGE);
  }

  private String name;

  private int age;

  private JavaPerson(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Person.Companion.newBaby("ABC");
    Person.newBaby("ABC");
  }

}

