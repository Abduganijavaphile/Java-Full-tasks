public class Main51 {
    public static void main(String[] args) {

    }
    public String parenBit(String str) {
        if(str.length()<2){
            return "";
        }else{
            char a = str.charAt(0);
            char b = str.charAt(str.length()-1);
            if(a == '(' && b == ')'){
                return str;
            }else if(a == '(' && b!= ')'){
                return parenBit(str.substring(0,str.length()-1));
            }else if(a != '(' && b== ')'){
                return parenBit(str.substring(1));
            }else{
                return parenBit(str.substring(1,str.length()-1));
            }
        }
    }
}
