public class quick {

    public static void main(String[] args) {
        int k=0;
        int n = 6;
      for(int i = 1;i<n;i++){
        for(int j = 1;j<n*n;j*=2){
            System.out.println("hello "+k++);
        }
      }
    }
    
}
