package com.xworks.typeCasting;

public class CricketTournament {
	public static void main(String[] args) {
	//upcasting example
	Byte playerAge=18;
	int player1Age=playerAge;
	
	short playerScore=200;
	long player1Score =playerScore;
	
	float playerWieght=50.5f;
	double player1Wieght= playerWieght;
	  
	int teamScore=2000;
	long team1Score=teamScore;
	
	//download example
	 int chennaiSuperKingsMembers=12;
	 byte mumbaiIndianMembers=(byte)chennaiSuperKingsMembers;
	
	 double strikeRate = 156.75;
     float strikeRateFloat = (float) strikeRate;
	
     long totalScore = 1234567890L;
     int totalScoreInt = (int) totalScore;
     
     int overs = 300; 
     short oversShort = (short) overs;
     
     System.out.println(player1Age);
     System.out.println(player1Score);
     System.out.println( player1Wieght);
     System.out.println(team1Score);
     System.out.println("*****************************");
     System.out.println(mumbaiIndianMembers);
     System.out.println(strikeRateFloat);
     System.out.println(totalScoreInt);
     System.out.println(oversShort);
     
     
     System.out.println("upcasting the class");
     IndianPrimierLeague cricket=new ChennaiSuperKings();
     cricket.startTournament();
     IndianPrimierLeague cricket1=new  MumbaiIndian();
     cricket1.startTournament();
     
     System.out.println("downcasting the class");
     IndianPrimierLeague cricket2=new ChennaiSuperKings();
     ChennaiSuperKings cricket3= (ChennaiSuperKings)cricket2;
     cricket3.startTournament();
     
     IndianPrimierLeague cricket4=new MumbaiIndian();
     MumbaiIndian cricket5=(MumbaiIndian)cricket4;
     cricket4.startTournament();

}
}
