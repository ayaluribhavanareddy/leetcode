class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1000000007;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        while (t > 0) {
           int res[]=new int[26];
           for(int i=0;i<25;i++)
                res[i+1]=freq[i];
            res[0]=(res[0]+freq[25])%mod;
             res[1]=(res[1]+freq[25])%mod;
            t--;
            freq=res;
           }
        
       long ans=0l;
        for(int i:freq){
            ans+=i;
        }
        return (int)(ans%mod);


       
    }
}
