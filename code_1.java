

class code_1{
    public static void main(String[] args) {
    int nums[] = {48, 26, 87, 70};


    
    int highnum = nums[0];
    for (int age : nums) {
      if (highnum < age) {
         highnum = age;
        }
}
    System.out.println("the nums array length is :"+nums.length);
    System.out.println("The high num in the array is: " + highnum);
     
  }
}
