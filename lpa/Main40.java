package dev.lpa;

public class Main40 {
    public static void main(String[] args) {
        int num=2736;
        String st=String.valueOf(num);
        System.out.println(st);
        char[] ch= st.toCharArray();
        char temp=0;
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]<ch[i+1]){
                temp = ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = temp;
            }
            break;
        }
        String st2=String.valueOf(ch);
        int aim=Integer.parseInt(st2);
        System.out.println(aim);
    }
}
