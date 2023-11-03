 import java.util.*;;
 public class trappingRainWater {


    public static void rainwater( int height[]){
        //Steps 
        //calculate left max boundary-array
        int leftMax[]=new int [height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
            
        }
        // calculete right max boundary-array
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
           rightMax[i]=Math.max(height[i], rightMax[i+1]);
           
        }
        int trappedWater =0;
        //loop
        for(int i=0;i<height.length;i++){
            //waterLevel=min(leftmax boundary,rightmax boundary)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //Trapped Water=waterLevel-height[i];
            trappedWater+=waterLevel-height[i];

        
        }
        System.out.println(trappedWater);
        //
        //

    }
    public static void main(String[] args) {
        int height[]={4,0,0,0,0,0,9};
        rainwater(height);
    }
    
}
