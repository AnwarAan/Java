public class Todo {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

<<<<<<< HEAD
        // testShowTodo();
        // testAddTodo();
        // testRemoveTodo();

        testInput();
=======
    // testShowTodo();
    // testAddTodo();
    // testRemoveTodo();
    // testInput();
    testViewTodo();
    testViewAddTodo();
    testViewRemoveTodo();
  }

  static void showTodo() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + "." + todo);
      }
>>>>>>> 040ef0f9222509dec49bb3ce6093bd2721ffb740
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

<<<<<<< HEAD
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
=======
    var channel = input("Alamat");
    System.out.println(channel);
  }

  public static void viewShowTodo() {
    while (true) {
      showTodo();

      System.out.println("Menu");
      System.out.println("1. Add");
      System.out.println("2. Delete");
      System.out.println("x. Exit");

      var input = input("choose");
      if (input.equals("1")) {
        addTodo(null);
      } else if (input.equals("2")) {
        removeTodo(1);

      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("choosen not deserve");
      }
    }
  }

  public static void testViewTodo() {
    addTodo("1");
    addTodo("2");
    addTodo("3");
    addTodo("4");

    viewShowTodo();
  }

  public static void viewAddTodo() {
    System.out.println("Menambah TODO");

    var todo = input("Todo (x batal)");
    if (todo.equals("x")) {

    } else {
      addTodo(todo);
    }
    viewShowTodo();
  }

  public static void testViewAddTodo() {
    addTodo("10");
    addTodo("20");

    viewAddTodo();
    showTodo();
  }

  public static void viewRemoveTodo() {
    System.out.println("Delete TODO");
    var number = input("Todo (x batal)");
    if (number.equals("x")) {

    } else {
      boolean success = removeTodo(Integer.valueOf(number));
      if (!success) {
        System.out.println("Failed to delete TODO : " + number);
      }
    }
  }

  public static void testViewRemoveTodo() {
    addTodo("10");
    addTodo("20");
    addTodo("30");
    showTodo();

    viewRemoveTodo();
    showTodo();
  }
>>>>>>> 040ef0f9222509dec49bb3ce6093bd2721ffb740
}
