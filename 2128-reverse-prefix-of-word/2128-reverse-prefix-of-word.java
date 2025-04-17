class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int k=-1;
        char che[]=word.toCharArray();
        for(int i=0;i<word.length();i++){
            
            if(che[i]==ch){
                 k=i;
                for(int j=i;j>=0;j--){
                    sb.append(che[j]);
                }
              break;
            }
        }
        if(k==-1)
         return word;
      for(int i=k+1;i<word.length();i++){
         sb.append(che[i]);
      }
      return sb.toString();
    }
}