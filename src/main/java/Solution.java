public class Solution {
        public boolean Find(int target, int [][] array) {

            for(int i=0 ;i<array.length;i++){
                System.out.println("i = "+i );
                System.out.println();
                for(int j=0;j<array[i].length;j++){
                    System.out.println(" j = "+j);
                    if(target == array[i][j]){
                        System.out.println("find " +target+ " in array" +array.toString());
                        return true;
                    }
                }
            }
            System.out.println("not find "+target);
            return  false;
        }
    }
