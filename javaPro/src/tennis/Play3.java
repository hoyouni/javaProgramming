package tennis;

import java.util.Scanner;

public class Play3 {
      static Scanner scan = new Scanner(System.in);
      public static void main(String[] args) {
         System.out.print("게임의 형식을 결정해 주세요(1 = 단식 / 2 = 복식) => ");
       
          
            int pNum = scan.nextInt();

            while (pNum != 1 &&  pNum != 2) {
                try {
                   System.out.print("잘못입력하셨습니다 다시 입력해주세요 (1 = 단식 / 2 = 복식)=> ");
                   pNum = scan.nextInt();
                   System.out.println();
                } catch (Exception e) {
                }
          }
             
             System.out.print("> 성별을 입력해 주세요 ? (1.남자  2.여자)\t");
             int gender = scan.nextInt();
             System.out.println();
             while (gender != 1 && gender != 2) {
                try {
                   System.out.print("잘못입력하셨습니다 다시 입력해주세요 (1 = 남자/ 2 = 여자)=> ");
                   gender = scan.nextInt();
                   System.out.println();
                } catch (Exception e) {
                }

             }
             
             int set = gender == 1 ? 5: 3;
             
             String[] names = new String[pNum*2];
             for (int i = 0; i < names.length; i++) {
                System.out.printf("> %d번째 선수 이름을 입력하세요 ?\t", i+1);
                names[i] = scan.next();
             }

             String[] team = new String[2];
             if(names.length == 4) {
                team[0] = names[0]+"/"+names[1];
                team[1] = names[2]+"/"+names[3];
             }else {
                team[0] = names[0];
                team[1] = names[1];
             }


             
             
             
         int[][] playPoint = new int [2][set+2];
         int[] scoreArr = {0,15,30,40,45};

         //playPoint배열을 0으로 초기화
         for (int i = 0; i < playPoint.length; i++) {
            for (int j = 0; j < playPoint[i].length; j++) {
               playPoint[i][j] = 0;
            }
         }

         //듀스: 포인트 듀스, 게임 듀스
         //1set당 game 이긴수가 6이면 1set 승리-> Score 1증가
         //최종 승리: 5set 중 3set를 이겨야함

         int pointCnt1 = 0;
         int pointCnt2 = 0;
         int gameCnt1 = 0;
         int gameCnt2 = 0;
         int sumCnt1 = 0;
         int sumCnt2 = 0;
         int setCnt = 1;
         int deuceCnt1 = 0;
         int deuceCnt2 = 0;
         

         while (setCnt<=set ) {
            System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");
            int winTeam = scan.nextInt();
            //  int[] scoreArr = {0,15,30,40,45};

            if(winTeam == 1) { // 1팀이 이긴 경우
               int k = scoreArr[++pointCnt1];
               playPoint[winTeam-1][0] = k;  //1팀이 이긴 경우 포인트 득점

               if(pointCnt1==4) {
                  System.out.println(team[0] + "팀 승리!");
                  playPoint[0][setCnt] = ++gameCnt1;
                  playPoint[0][0] = 0;
                  playPoint[1][0] = 0;

                  pointCnt1 = 0;
                  pointCnt2 = 0;
               }
            }

            else { // 2 팀이 이긴 경우 
               int k = scoreArr[++pointCnt2];
               playPoint[winTeam-1][0] = k;

               if(pointCnt2==4) {
                  System.out.println(team[1] + "팀 승리!");
                  playPoint[1][setCnt] = ++gameCnt2;
                  playPoint[0][0] = 0;
                  playPoint[1][0] = 0;

                  pointCnt1 = 0;
                  pointCnt2 = 0;
               }
            }
            
            
            if(pointCnt1==3 && pointCnt2==3) {  //포인트가 3:3 동점인 경우 듀스 대결
              disp(playPoint,team,set);
               System.out.println("포인트 듀스 대결!");
               boolean flag = true;
               
               for(int i = 1; i <= 2; i++) {
              
               while(flag) {
                  System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");
                  winTeam = scan.nextInt();
                  
                  if(deuceCnt1 == 1 && deuceCnt2 == 1) {
                     deuceCnt1 = 0;
                     deuceCnt2 = 0;
                   
                  }
                  
                  
                  if(winTeam==1) {
                     deuceCnt1 = deuceCnt1 + 1;
                     
                     //1팀이 듀스 성공 시킨 경우
                     if(deuceCnt1==2) {
                        System.out.println(team[0] + "팀 승리!");
                        playPoint[0][setCnt] = ++gameCnt1;
                        playPoint[0][0] = 0;
                        playPoint[1][0] = 0;
                        
                        //game 승리시 pointCnt 초기화
                        pointCnt1 = 0;
                        pointCnt2 = 0;
                        deuceCnt1 = 0;
                        deuceCnt2 = 0;
                        flag = false;
                        //break;
                     } 
                  }
                  else if(winTeam == 2) {
                     deuceCnt2 = deuceCnt2 + 1;
                     // 2팀이 듀스 성공시킨 경우
                     
                     if(deuceCnt2 == 2){
                        System.out.println(team[1] + "팀 승리!");
                        playPoint[1][setCnt] = ++gameCnt2;
                        playPoint[0][0] = 0;
                        playPoint[1][0] = 0;

                        //game 승리시 pointCnt 초기화
                        pointCnt1 = 0;
                        pointCnt2 = 0;
                        deuceCnt1 = 0;
                        deuceCnt2 = 0;
                        flag = false;
                        
                     }

                  }
                  
               } 
            }
            }
            
            //point 듀스 끝
            
            //SET 듀스 
            int finalWinner = 0;
           
            if(playPoint[0][setCnt]==6) {
               if(playPoint[1][setCnt]==6) {
                  System.out.println("게임 듀스 대결!");
                  int gameDeuceCnt = 0;
                  for (int i = 1; i <=2; i++) {
                     for (int j = 0; j < 6; j++) {
                        System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");
                        winTeam = scan.nextInt();

                        if(winTeam==j) gameDeuceCnt++;


                     }
                  }
               }
               System.out.println(setCnt+"set 승리!");
               //set 승리 시 gameCnt 초기화
               gameCnt1 = 0;
               gameCnt2 = 0;

               playPoint[0][set+1] = ++sumCnt1;

               if(sumCnt1==3) { 
                  finalWinner = 1;
                  finalDisp(finalWinner, sumCnt1, sumCnt2);
                  break;
               }
               setCnt++;
            }else if(playPoint[1][setCnt]==6){
               if(playPoint[0][setCnt]==6) {
                  System.out.println("게임 듀스 대결!");
                  //
               }
               System.out.println(setCnt+"set 승리!");
               gameCnt1 = 0;
               gameCnt2 = 0;

               playPoint[1][set+1] = ++sumCnt2;

               if(sumCnt2==3) {
                  finalWinner = 2;
                  finalDisp(finalWinner, sumCnt1, sumCnt2);
                  break;
               }
               setCnt++;
            }

            //클래스 및 함수 분리
            disp(playPoint,team,set);

         } //while

      }
      private static void finalDisp(int finalWinner, int sumCnt1, int sumCnt2) {
         System.out.println("축하합니다! Player"+finalWinner+"가 이겼습니다!");
         System.out.print("최종스코어"); 
         System.out.print(finalWinner==1?sumCnt1:sumCnt2+":");
         System.out.print(finalWinner==1?sumCnt2:sumCnt1);

      }
      private static void disp(int[][] playPoint, String[] name, int set) {
         String [] menu1 = {"NAME\t","Point\t","Set1\t","Set2\t","Set3\t","Set4\t","Set5\t","Score"};
         String [] menu2 = {"NAME\t","Point\t","Set1\t","Set2\t","Set3\t","Score"};

         if(set==5) {
            for (int i = 0; i < menu1.length; i++) {
               System.out.print(menu1[i]);
            }
            System.out.println();
         }else if(set==3) {
            for (int i = 0; i < menu2.length; i++) {
                System.out.print(menu2[i]);
             }
             System.out.println();
         }

         for (int i = 0; i < playPoint.length; i++) {
            System.out.printf("[%s]\t",name[i]);
            for (int j = 0; j < playPoint[i].length; j++) {
               System.out.printf("[%d]\t",playPoint[i][j]);
            }
            System.out.println();
         }

      }

   }