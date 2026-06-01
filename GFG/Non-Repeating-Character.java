class Solution {
    public char nonRepeatingChar(String s) {
       for(int i=0; i<s.length(); i++){
           boolean unique=true;
           for(int j=0; j<s.length();j++){
               if(i!=j && s.charAt(i)==s.charAt(j)){
                   unique=false;
                   break;
               }
           }
           if(unique){
               return s.charAt(i);
           }
       }
       return '$';
    }
}
