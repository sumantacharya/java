public class CricketTeam{
	String teamName;
	String playerName;
	int age;
	static String sportType;
	static String governingBody;
	static int totalTeams;

   static{
   	sportType="Cricket";
   	governingBody="International Cricket Council";
   	totalTeams=10;

   }

   public CricketTeam(String teamName,String playerName,int age){
   	this.teamName=teamName;
   	this.playerName=playerName;
   	this.age=age;
   }
   public void printDetails(){
      	System.out.println(teamName);
      	System.out.println(playerName);
      	System.out.println(age);
      	System.out.println(sportType);
      	System.out.println(governingBody);
      	System.out.println(totalTeams);
      	

      }
}
