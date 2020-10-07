MAX_MIN.java
public class MAX_MIN {
    public static void main(String[] args) {
        int[] data = new int[]{5,77,23,24,25,26,27,28,29};
        int max = data[0];   //假设第一个数为最大值
        int min = data[0];   //假设第一个数为最小值
        int sum = data[0];
        for(int i = 1;i  < data.length;i++){
            if(data[i] > max){
                max = data[i];
            }
            if(data[0] <min){
                min = data[i];
            }
            sum +=data[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("最大值最小值为："+sum);
    }
}