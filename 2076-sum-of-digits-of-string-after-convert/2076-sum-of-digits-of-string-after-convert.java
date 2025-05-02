class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
     for(char ch:s.toCharArray()){
        sb.append((ch-'a')+1);
     }
     String str=sb.toString();
    for(int i=0;i<k;i++){
         int sum=0;
        for (char digit : str.toCharArray()) {
                sum += digit - '0'; 
            }
            str = String.valueOf(sum);
        }

        return Integer.parseInt(str);
      
    }
}