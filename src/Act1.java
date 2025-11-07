import java.util.Scanner;

public class Act1 extends Act{
	
	private Player player;
	Scanner scanner = new Scanner(System.in);
	
	public Act1(Player player) {
		this.player = player;
	}
	
	
	@Override
	public void start(){
		incidentInTavern();
		sneakingIntoTargetsHome();
	}
	
	private void incidentInTavern() {
		System.out.println("""
		The tavern was quiet.
		You were calmly sipping your ale when a few quarreling voices began to gnaw at your patience.
		
		Hoping it might lead to some kind of work - and a few coins, if luck allowed - you decided to listen in. 
		These were harsh times; money had a way of keeping one alive.
		
		One man spoke loudly of the kingdom's distractions, claiming this was "an internal affair."
		Another spat curses at the crown, swearing their days were numbered.
		
		You rose from your seat.
		Being the only one who hadn't joined the argument, your sudden movement drew every eye in the tavern.
		For a brief, uneasy moment, all sound died — and every gaze turned to you.
		
		What will you do?
		1) Defend the man who defends the crown.
		2) Defend the man who curses at the crown.
		
		""");
		
		int decision = scanner.nextInt();
		
		switch(decision){
			case 1:
			defendTheCrown();
			break;
			case 2:
			curseTheCrown();
			break;
		}
	}
	
	private void defendTheCrown(){
		GameStats.setCrownAlignment(1);
		String target = "Reeve";
		System.out.println("""
					  You don't know what these “internal affairs” are, but you shout angrily:
					  - How dare you insult a man whose only concern is the sake of this town? We're on the same side - 
					  our country will end the war and come for this village too. We are not forgotten.
		
					  You pull the man from their grasp and drag him outside. The villagers, frightened by your appearance, disperse.
		
					  The man thanks you and then leans in, lowering his voice. He is not just any villager — he was sent by the crown to check the people's loyalty. 
					  When you ask him about the “internal affairs,” he tells you this: a large band of outlaws calling themselves the Dark Hands are trying to take 
					  advantage of the kingdom's turmoil to seize the village. Although the kingdom is at war, it has not ignored the problem — agents are quietly monitoring 
					  the situation and planning to dismantle the Dark Hands from within.
		
					  Then he asks a favor. He says he saw the Reeve at the his home secretly write several letters and hand them to a few young people. 
					  He wants you to slip into the house and bring back any letters you can find.
		
					  You think this could bring you some coin. Therefore you do not have any choice but the accept it.
						  
					  """);
			Quest sneakingHome = new Quest("Sneaking into " + target + "'s home to retrieve some evidents that shows his guilt", 
											"Bailiff");
	}
	
	private void curseTheCrown(){
		GameStats.setCrownAlignment(-1);
		String target = "Bailiff";
		System.out.println("""
					  You don't know what these “internal affairs” are, but you shout angrily:
					  - How dare you insult a man whose only concern is the sake of this town? We're on the same side -
					  we only wish to end this affair, with or without our country's help. And it seems it will happen
					  without our country's help. 
		
					  You pull the man from their grasp and drag him outside. The villagers, frightened by your appearance, disperse.
		
					  The man thanks you and then introduce himself, he is the reeve of this village and welcomes you.
					  When you ask him about the “internal affairs,” he tells you this: a large band of outlaws calling themselves the Dark Hands are trying to take 
					  advantage of the kingdom's turmoil to seize the village. Since the kingdom is at war, they ignored any letter they send.
					  
					  Then he asks a favor. He says he saw the Bailiff at the his home secretly write several letters and hand them to a few young people. 
					  He wants you to slip into the house and bring back any letters you can find.
		
					  You think this could bring you some coin. Therefore you do not have any choice but the accept it.
		
					  """);
		Quest sneakingHome = new Quest("Sneaking into " + target + "'s home to retrieve some evidents that shows his guilt", 
										"Reeve");
		System.out.println(sneakingHome);
	}
	
	private void sneakingIntoTargetsHome(){
	}
	
}
