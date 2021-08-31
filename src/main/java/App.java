import java.util.Scanner;

/*
    Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough

    Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
    Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
    (VD: You Only Live Once. But If You Do It Right. Once Is Enough)
    Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường
    (VD: You only live once. But if you do it right. Once is enough)
     */

public class App {
    public static void main(String[] args) {

        System.out.println("Bài 1");
        String s1 = inputString();
        System.out.format("Chuỗi trên có %d ký tự in hoa\n",countUppercase(s1));
        System.out.format("%s\n", upperFirstChar(s1));
        System.out.format("%s\n", upperFirstWords(s1));
    }


    public static String inputString () {//Nhập chuỗi
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chuỗi: ");
            String s = sc.nextLine();
            return s;
        }

    public static int countUppercase(String str) {//Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count ++;
            }
        }
        return count;
    }
    public static String upperFirstChar(String str){//Đếm số từ viết in hoa trong chuỗi
        String[] words= str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String remainingLetters = words[i].substring(1);
            result += firstLetter + remainingLetters + " ";
        }
        return result;
    }

    public static String upperFirstWords(String str){//Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa
        String[] words= str.split("\\. ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String remainingLetters = words[i].substring(1).toLowerCase();
            result += firstLetter + remainingLetters + ". ";
        }
        return result;
    }

}
