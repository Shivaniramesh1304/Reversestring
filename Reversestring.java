public class Reversestring {
        public static void main(String[] args) {
            String str="hello world";
            String reversedStr=new StringBuilder(str).reverse().toString();
            System.out.println(reversedStr);
        }
    }
