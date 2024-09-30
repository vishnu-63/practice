import java.util.*;
class solution{
    public solution(){}
    String reverseWords(String str) {
        String res="";
        ArrayList<String> words = new ArrayList<>(List.of(str.split("\\.")));
        System.out.println(str);
        int n=words.size();
        Collections.reverse(words);
        for(int i=0;i<words.size();i++) {
            res+=words.get(i);
            if(i!=n) {
                res+=".";
            }

        }
        return res;
    }
}

public class practice {

    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        solution sol=new solution();
        String res=sol.reverseWords(str);
        System.out.println(res);


    }
}
