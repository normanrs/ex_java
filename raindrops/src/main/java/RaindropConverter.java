class RaindropConverter {


  String convert(int number) {
    String first = "";
    String second = "";
    String third = "";

    if (number % 3 == 0) {
      first = "Pling";
    }
    if (number % 5 == 0) {
      second = "Plang";
    }
    if (number % 7 == 0) {
      third = "Plong";
    }
    if ((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0)) {
      return String.valueOf(number);
    } else {
      return first + second + third;
    }
  }

}
