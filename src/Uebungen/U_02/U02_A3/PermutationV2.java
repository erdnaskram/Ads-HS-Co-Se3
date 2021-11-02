//package Uebungen.U_02.U02_A3;
//
//public class PermutationV2 {
//
//    public void permute(String str){
//        char[] chars = str.toCharArray();
//
//        permute(chars,0);
//    }
//
//
//    private void permute(char[] str, int startIndex){
//        if (str.length == 2){
//            System.out.println(str[0] + str[1]);
//            System.out.println(str[1] + str[0]);
//        } else {
//            for (int i = 0; i < str.length; i++) {
//                swap(str, i, startPos);
//
//                permute(str, startPos + 1);
//
//                swap(str, i, startPos);
//            }
//        }
//    }
//
//}
