

class Solution {
    
    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        
        else return gcd(b,a%b);
    }
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        int [] frac = new int[n];
        HashMap<Integer,HashMap<Integer,Integer>> hasMap = new HashMap<>();
          int count = 0;
        for(int i=0;i<n;i++){
            int fraction = gcd(numerator[i], denominator[i]);
            int x = numerator[i]/fraction;
            int y = denominator[i]/fraction;
            int z = y-x;
         
            if(hasMap.containsKey(z) && hasMap.get(z).containsKey(y)){
                
                count+=hasMap.get(z).get(y);
            }
            
            if(hasMap.containsKey(x)){
                 HashMap<Integer,Integer> hm = hasMap.get(x);
                 hm.put(y,hm.getOrDefault(y,0)+1);
            }
            else{
                HashMap<Integer,Integer> hm = new HashMap<>();
                hm.put(y,1);
                hasMap.put(x,hm);
            }
           
        }
        
        
        return count;
        
}
}
        