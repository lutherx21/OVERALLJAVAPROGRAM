package com.company;

public class Main {

    public static void main(String[] args) {

//        int highscore =  calculateScore(true , 800 ,5 , 100);
//        System.out.println("Your final score was : " + highscore);
////        calculateScore(true, 10000 , 8, 200);
//        int anotherhighscore =  calculateScore(true, 10000 , 8, 200);
//        System.out.println("Your final score was : " + anotherhighscore);
//    }
//    public static int calculateScore(boolean gameOver, int score , int LevelCompleted , int bonus){
//
//        if(gameOver == true){
//            int finalscore = score +(LevelCompleted * bonus);
//            score += 1000;
//            return finalscore;
//        }
//        return -1;
      int position = calculateHighscoreTable(1500);
      displayHighScorePosition("luther", position);

      position = calculateHighscoreTable(900);
      displayHighScorePosition("bob", position);

      position = calculateHighscoreTable(400);
      displayHighScorePosition("sabrine", position);

      position = calculateHighscoreTable(50);
      displayHighScorePosition("james", position);

      position = calculateHighscoreTable(1000);
      displayHighScorePosition("tim", position);

      position = calculateHighscoreTable(500);
      displayHighScorePosition("shalom", position);

      position = calculateHighscoreTable(100);
      displayHighScorePosition("drake", position);

      position = calculateHighscoreTable(40);
      displayHighScorePosition("tob", position);


    }
    public static void displayHighScorePosition(String playername ,  int position) {
        System.out.println(playername  +" " +  "Managed to get into postion : " + position + " "+ "on the highscore table");

    }
    public static int calculateHighscoreTable(int playerscore){
//        if(playerscore >=1000){
//            return 1;
//
//        }else if(playerscore >= 500){
//           return 2;
//        }else if (playerscore >= 100) {
//           return 3;
//        }
//        return 4;
        int position = 4 ;
        if(playerscore >= 1000){
            position = 1;

        }else if(playerscore >= 500 ){
            position = 2;
        } else if(playerscore >= 100){
            position = 3;
        }
            return position;
    }
}
