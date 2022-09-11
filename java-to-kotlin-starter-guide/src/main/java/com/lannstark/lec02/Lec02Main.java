package com.lannstark.lec02;

public class Lec02Main {

  public static void main(String[] args) {

  }
  public boolean startsWithA(String str){
    return str.startsWith("A");
    //NullPointeException이 발생할 수 있음
  }

  public boolean startsWithA1(String str) {
    if (str == null) {
      throw new IllegalArgumentException("null이 들어왔습니다");
    }
    return str.startsWith("A");
  }


  public Boolean startsWithA2(String str) {
    if (str == null) {
      return null;
    }
    return str.startsWith("A");
  }


  public boolean startsWithA3(String str) {
    if (str == null) {
      return false;
    }
    return str.startsWith("A");
  }

}
