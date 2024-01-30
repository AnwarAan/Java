public class Todo {

  public static String[] model = new String[10];

  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {

    // testShowTodo();
    // testAddTodo();
    // testRemoveTodo();

    testInput();
  }

  static void showTodo() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + "." + todo);
      }
    }

  }

  static void testShowTodo() {
    model[0] = "Learn Java";
    model[1] = "Take a meal";
    model[2] = "Take a bath";
    model[3] = "Take a bath";
    model[4] = "Take a bath";
    model[5] = "Take a bath";
    model[6] = "Take a bath";
    model[7] = "Take a bath";
    model[8] = "Take a bath";
    model[9] = "Take a bath";
    showTodo();
  }

  static void addTodo(String todo) {
    var isFull = true;
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        isFull = false;
        break;
      }
    }

    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
        break;
      }
    }

  }

  static void testAddTodo() {
    for (var i = 0; i < 10; i++) {
      addTodo("data" + i);
    }
    showTodo();
  }

  static boolean removeTodo(Integer number) {
    if ((number - 1) > model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (var i = number - 1; i < model.length; i++) {
        if (i == model.length - 1) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }

  }

  static void testRemoveTodo() {
    addTodo("1");
    addTodo("2");
    addTodo("3");

    var result = removeTodo(1);
    System.out.println(result);
    result = removeTodo(4);
    System.out.println(result);
    showTodo();

  }

  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput() {
    var name = input("Nama");
    System.out.println("Hi " + name);

    var channel = input("Alamat");
    System.out.println(channel);
  }
}
