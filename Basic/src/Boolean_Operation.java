public class Boolean_Operation {
    public static void main(String[] args) {
        var a =true;
        var b =false;

        System.out.println(a&&a);
        System.out.println(a&&b);
        System.out.println(b&&b);
        System.out.println(b&&a);

        System.out.println(a||a);
        System.out.println(a||b);
        System.out.println(b||b);
        System.out.println(b||a);

        System.out.println(!a);
        System.out.println(!b);

        var absen = 70;
        var score = 85;

        var passGradeAbsen = absen>=75;
        var passGradeScore = score>=75;
        var passGrade = passGradeAbsen && passGradeScore;

        System.out.println(passGrade);

    }
}
