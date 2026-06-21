package dsa.templates.twoPointerPattern;

public class TrappingRainWater {

    // time complexity - O(3N) and space complexity - O(2N)
    public static int  trapRainWater(int[] heightMap){
        int len = heightMap.length;
        int[] prefixMax = new int[len];
        int[] suffixMax = new int[len];
        prefixMax [0]=heightMap[0];
        suffixMax[len-1]=heightMap[len-1];
        for(int i=1;i<len;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],heightMap[i]);
        }
        for(int i=len-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],heightMap[i]);
        }
        int total=0, maxUnit = 0;
        for(int i=0;i<len;i++){
            if(heightMap[i]<prefixMax[i] && heightMap[i]<suffixMax[i]){
                total += Math.min(prefixMax[i],suffixMax[i])-heightMap[i];
                maxUnit = Math.max(maxUnit,total);
            }
        }
        return total;
    }

    // Reduced time complexity - O(2N) to O(N)
    public static int  trapRainWater2(int[] heightMap){
        int len = heightMap.length;
        int[] suffixMax = new int[len];
        suffixMax[len-1]=heightMap[len-1];
        for(int i=len-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],heightMap[i]);
        }
        int total=0, maxUnit = 0;
        int prefixMax = 0;
        for(int i=0;i<len;i++){
            prefixMax = Math.max(prefixMax,heightMap[i]);
            if(heightMap[i]<prefixMax && heightMap[i]<suffixMax[i]){
                total += Math.min(prefixMax,suffixMax[i])-heightMap[i];
                maxUnit = Math.max(maxUnit,total);
            }
        }
        return total;
    }

    // something is wrong - in this
    public static int  trapRainWater3(int[] heightMap){
        int len = heightMap.length;
        int total=0, maxUnit = 0;
        int leftMax = 0,  rightMax = 0;
        int l=0,r=len-1;
        while(l<r){
            if(heightMap[l]<heightMap[r]){
                if(leftMax>heightMap[l]){
                    total+=leftMax-heightMap[l];
                    maxUnit=Math.max(maxUnit,total);
                }else{
                    leftMax=heightMap[l];
                    l++;
                }
            }else {
                if(rightMax>heightMap[r]){
                    total+=rightMax-heightMap[r];
                    maxUnit=Math.max(maxUnit,total);
                }else{
                    rightMax=heightMap[r];
                    r--;
                }
            }
        }
        return total;
    }


    public static void main(String[] args) {
        int[] arr = {1,0,4,3,5,3,4,1};
        System.out.println("The trapped rain water is: "+trapRainWater(arr));
        System.out.println("The trapped rain water is: "+trapRainWater2(arr));
        System.out.println("The trapped rain water is: "+trapRainWater3(arr));
    }
}
