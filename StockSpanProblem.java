import java.util.*;
public class solution {

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(0);//index 0 ko push

        for(int i=1;i<stock.length;i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]){ //jab tak stack empty na ho aur currPrice top se bada ho
                s.pop();//pop karte jao
            }
            if(s.isEmpty()){//agar stack empty ho gaya to iska matlab pura left wala bada tha
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();//iska matlab yeh index pe jo price hai wo currPrice se bada hai
                span[i] =i-prevHigh;
            }
            s.push(i);//current index push kar do
        }


    }
    public static void main(String[] args) {
        int stock[] ={100,80,60,70,80,85,100};
        int span[] = new int[stock.length];

        stockSpan(stock,span);

        


    }
}
