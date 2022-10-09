package PractiseWithBuddies;
public class sortedRotated {
public static int search(int[]nums,int target){

// Brute force
//         for(int i=0; i<nums.length;i++)
//             if(nums[i]==target)
//                 return i;

//                 return -1;

// binary Search ALgorithmn
//4,5,6,7,0,1,2 
//  Arrays.sort(nums);
int low=0;int high=nums.length-1;

while(low<=high){int mid=low+((high-low)/2);

if(nums[mid]==target){return mid;}else if(nums[low]<=nums[mid]){ // it means they are sorted
if(target>=nums[low]&&target<nums[mid])high=mid-1;else low=mid+1;}

else{if(target>nums[mid]&&target<=nums[high])low=mid+1;

else high=mid-1;}}

return-1;

}

public static void main(String[] args) {
    int[] nums = new int[] {4,5,6,7,0,1,2};
    int  target = 0;

    int ans = search(nums,target);
    System.out.println(ans);   
    //Output : 4 
}
  
}

