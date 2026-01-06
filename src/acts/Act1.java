package acts;
import characters.Enemy;
import characters.Player;
import combat.CombatSimulation;
import dataholder.GameStats;
import java.util.InputMismatchException;
import java.util.Scanner;
import quest.Quest;

public class Act1{
	
	private final Player player;
	Scanner scanner = new Scanner(System.in);
	
	public Act1(Player player) {
		this.player = player;
	}
	
	
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
		int decision;
		while(true){
			try{
				decision = scanner.nextInt();
				break;
			} catch(InputMismatchException e) {
					System.out.println("Invalid Input");
			}
		}
		
		switch(decision){
			case 1 -> defendTheCrown();
			case 2 -> curseTheCrown();
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
			System.out.println(sneakingHome);
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
		System.out.println("""
										You wait for the sun to set. Your heart is pounding like hell—this is the first time you’re doing something that 
										could actually be called a crime. Even though your intentions are good, the thought still gnaws at you.
										Fortunately, your target leaves his home exactly when he’s supposed to. He’s probably heading to the tavern. 
										You search for a way in but find nothing, and while you’re still thinking, you notice someone turning into the alley.
										It’s now or never.

										Panicking, you break the window, hoping whoever is approaching didn’t hear it. You rummage 
										through cabinets and chests and quickly find papers proving his guilt—unsurprisingly.

										But when you turn around, you see a boy. A real child, trembling, holding a small sword 
										that almost reaches up to his hair as he grips it. You assume he must be your target’s son. 
										Wasn’t he supposed to be somewhere else? School, maybe?
										He’s terrified of you, yet he’s trying to be the hero, of course.

										He swings the sword at you, but you dodge it without effort. And now, you have no choice but to fight this little kid.    
											""");
										System.out.println("Press ENTER to Continue");
										scanner.nextLine();
										Enemy targetsChild = new Enemy("Bertran", 30, 5, 5, 5);
										CombatSimulation combatWithChild = new CombatSimulation(player.getAttributes().get("HP"),
																																						player.getAttributes().get("Attack"),
																																						player.getAttributes().get("Luck"),
																																						player.getAttributes().get("Defence"),
																																						targetsChild.getAttributes().get("HP"),
																																						targetsChild.getAttributes().get("Attack"),
																																						targetsChild.getAttributes().get("Luck"),
																																						targetsChild.getAttributes().get("Defence"));

										combatWithChild.start();
	}
	
	
}
