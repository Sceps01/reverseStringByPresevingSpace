public class Main {
    public static void main(String[] args) {
        String str = "My name is lionel messi";

        char[] temp = str.toCharArray();
        char[] re = new char[temp.length];

        for (int i =0; i < temp.length; i++){
            if(temp[i] ==' '){
                re[i] = ' ';
            }
        }
        int j = re.length - 1;
        for(int i =0; i < temp.length; i++){
            if(temp[i] != ' '){
                if(re[j] == ' '){
                    j--;
                }
                re[j] = temp[i];
                j--;
            }
        }
        System.out.println(String.valueOf(re));
    }
}