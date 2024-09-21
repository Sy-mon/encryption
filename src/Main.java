//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int key = 9;
        String text = "I have to land a software engineering job, watch me!";

        char [] chars = text.toCharArray();
        System.out.println(chars);

        for(char x : chars){
            x += key;
            System.out.print(x);
        }
    }
}