public class HitTheBreaks {
    public static void main(String[] args) {
     int num =1;
     for ( int i =1; i<=10; i++){
         System.out.println("i =" + i);
         if ( num % 2 == 0 && num % 3== 0){
             break;
         }
     }
    }
}
