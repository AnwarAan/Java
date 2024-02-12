package app;

import java.util.EnumSet;

public class EnumsetApp {
  public static enum Gender {
    MALE, FEMALE
  }

  public static void main(String[] args) {
    // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
    EnumSet<Gender> genders = EnumSet.of(Gender.MALE);

    for (Gender gender : genders) {
      System.out.println(gender);
    }
  }
}
