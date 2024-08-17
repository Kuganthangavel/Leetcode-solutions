class Solution 
{
    public String largestNumber(int[] nums) 
    {
        String[] numString= new String[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            numString[i] = nums[i]+"";
        }

          Arrays.sort(numString, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab); 
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < numString.length; i++)
        {
            sb.append(numString[i]);
        }
        String result = sb.toString();
        if(result.length() > 0 && result.charAt(0) == '0')
        {
            return "0";
        }
        return result;
    }
}