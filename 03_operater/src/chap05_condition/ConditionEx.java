package chap05_condition;

public class ConditionEx {

  public static void main(String[] args) {

    // 조건 연산(삼항 연산)
    
    int hour = 9;
    String amPm = hour < 12 ? "AM" : "PM";
    System.out.println(amPm);
    
    int month = 6;
    int mod = month % 12;
    String season = mod <= 2 ? "겨울" : mod <= 5 ? "봄" : mod <= 8 ? "여름" : "가.을";
    System.out.println(season);

  }

}
