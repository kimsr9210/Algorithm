package lv0;

class Lv0_019 {
    public static void  main(String[] args) {
      int price = 589260;
      System.out.println(solution(price));
    }
    //옷가게 할인 받기
    public static int solution(int price) {
      /*
       * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 
       * 50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 
       * 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
       */
          int answer = 0;
        if(100000 <= price && 300000 > price) {
          answer = (int) (price - (price * 0.05)) ;
        }else if(300000 <= price && 500000 > price) {
          answer = (int) (price - (price * 0.1)) ;
        }else if(500000 <= price) {
          answer = (int) (price - (price * 0.2)) ;
        }else {
          answer = price;
        }
  
          return answer;
    }
}