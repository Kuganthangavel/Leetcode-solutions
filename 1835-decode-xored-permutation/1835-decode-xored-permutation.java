
class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int[] decoded = new int[n + 1];
        int xorAll = 0;
        for(int i = 1; i <= n + 1; i++){
            xorAll ^= i;
        }

        for(int i = 0; i < n; i += 2){
            xorAll ^= encoded[i];
        }
        int last_element = xorAll;
        decoded[n] = last_element;
        for(int i = n - 1; i >= 0; i--){
            last_element ^= encoded[i];
            decoded[i] = last_element;
        }
        return decoded;
    }
}