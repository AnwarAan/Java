public class Todo {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodo();

    }

    public static void showTodo() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + "." + todo);
            }
        }
    }

    public static void testShowTodo() {
        model[0] = "Learn Java";
        model[1] = "Take a meal";
        showTodo();
    }

    public static void addTodo() {

    }

    public static void removeTodo() {

    }

    public static void viewAddTodo() {

    }

    public static void viewShowTodo() {

    }

    public static void viewRemoveTodo() {

    }

}
