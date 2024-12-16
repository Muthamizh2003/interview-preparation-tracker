package 2Darraysolutions;
//03. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

class Solution {
    public int[][] flipAndInvertImage(int[][] images) {
        int n=images.length;
        int m=images[0].length;
        int[][] inverse=new int[images.length][images[0].length];
        int i=0;
        for(int[] image:images)
        {
            inverse[i++]=reverse(image);
        }        
        return inverse;
    }
    private static int[] reverse(int[] image)
    {
        for(int i=0;i<image.length/2;i++)
        {
            int temp=image[i];
            image[i]=image[image.length-i-1];
            image[image.length-i-1]=temp;
        }
        for(int i=0;i<image.length;i++)
        {
            image[i]=image[i]^1;
        }
        return image;
    }
}
