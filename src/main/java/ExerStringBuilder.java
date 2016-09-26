/**
 * Created by twcn on 9/25/16.
 */
public class ExerStringBuilder {
    public static void main(String[] args){
//        String str = "this is a string";
//        StringBuilder st1 = new StringBuilder();  //空字符串
//        StringBuilder st = new StringBuilder(str);
//        st.replace(10, 16, "sentence");
//        System.out.println(st);
//        st.delete(0, 3);
//        System.out.println(st);
//        st.insert(0, "haha");
//        System.out.println(st);
//        st.append("---liyu");
////        System.out.println(st);
//        st.reverse();
//        System.out.println(st);

        String s = "able was i ere i saw elba";
        boolean flag = true;
//        for (int i=0; i<s.length()/2;i++){
//            if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                flag = false;
//                break;
//            }
//        }
//        if(flag == true){
//            System.out.println("回文");
//        }else{
//            System.out.println("不是回文");
//        }

//        for(int i=0; i<s.length()/2; i++){
//            if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                System.out.println("不是回文");
//                return;
//            }
//        }
//        if(flag){
//            System.out.println("回文");
//        }
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        String s2 = st.toString();
        if(s2.equals(s)){
            System.out.println("回文");
        }else{
            System.out.println("不是回文");
        }

    }
}
