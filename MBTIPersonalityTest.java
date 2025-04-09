package GateOne.OldSnacks;

import java.util.Scanner;
public class MBTIPersonalityTest{
	public static void main(String... ericalli){
	Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("MBTI Personality Test");
		System.out.println("---------------------------");

		System.out.println("What is ur name? ");
		String  name = input.next();

		System.out.println("Choose what best defines you:");
		String[] choices = {
				"1. (A) Expand energy, enjoy groups  \n(B)Conserve energy, enjoy one-on-one ",
				"2. (A)  Interpret literally \n(B) Look for meaning and possiblilities ",
				"3. (A) Logicalthinking, questioning  \n(B) Empathetic, feeling, accommodating ",
           		"4. (A) Organized, orderly \n(B) Flexible, adaptable ",
           		"5. (A) More outgoing, think out loud \n(B)  More reserved, think to yourself ",
           		"6. (A) Practical, realistic, experiential \n(B)  Imaginative, innovative, theoretical ",
           		"7. (A) Candid, straight forward, frank  \n(B)  Tactful, kind , encouraging ",
            		"8. (A) Plan , schedule \n(B)  Unplanned, spontaneous  ",
           		"9. (A) Seek many tasks, public activities, interaction with others \n(B)  Seek private, solitary activities with quiet to  concentrate ",
          		"10. (A) Standard,usual, conventional \n(B)  Different, novel, unique ",
          		"11. (A) Firm,tend to criticize,hold the line \n(B) Gentle, tend to appreciate,conciliate",
          		"12. (A) Regulated , structured  \n(B)  Easy-going,live and let live ",
          		"13. (A) External, communicative, express yourself \n(B)  Internal, reticent, keep to yourself ",
          		"14. (A) Focus on task, achievement \n(B)  Sensitive, people-oriented, compassionate  ",
          		"15. (A) Tough-minded, just \n(B)  Tender-hearted, merciful ",
         		"16. (A) Preparation, plan ahead \n(B)  Go with the flow, adapt as you go",
       			"17. (A) Active, initiate \n(B) reflective, deliberate",
          		"18. Facts, things, what is \n(B) Ideas , dreams,what could be,philosophical",
            		"19. Matter of fact, issue-oriented \n(B) Sensitive, people-oriented,compassionate",
            		"20. (A) Control, govern \n(B)  Latitude, freedom "
      		     };
		
		 String[] categories = {
				 "EI", "SN", "TF", "JP",  "EI",
    			"SN", "JP", "EI", "EI", "SN", 
    			"TF", "JP", "EI", "SN", "TF", 
    			"JP", "EI", "JP", "TF", "JP"
			};


		int scoreE = 0, scoreI = 0, scoreS = 0, scoreN = 0, scoreT = 0, scoreF = 0, scoreJ = 0, scoreP = 0;
		int countA = 0,  countB = 0;

		for (int count = 0; count < choices.length; count++) {
            		System.out.println(choices[count]);
            		String answer = input.next().toUpperCase();

		if (answer.equals("A")) {
		countA++;
                switch (categories[count]) {
                    case "EI": scoreE++; break;
                    case "SN": scoreS++; break;
                    case "TF": scoreT++; break;
                    case "JP": scoreJ++; break;
                   }
              } else if (answer.equals("B")) {
		countB++;
                switch (categories[count]) {
                    case "EI": scoreI++; break;
                    case "SN": scoreN++; break;
                    case "TF": scoreF++; break;
                    case "JP": scoreP++; break;
                    }
            } else {
                System.out.println("Invalid input. Please answer A or B.");
                count--;
            }
        }


			String personalityType = " ";
        		personalityType += (scoreE > scoreI) ? "E" : "I";
        		personalityType += (scoreS > scoreN) ? "S" : "N";
        		personalityType += (scoreT > scoreF) ? "T" : "F";
        		personalityType += (scoreJ > scoreP) ? "J" : "P";


		String[][] traits = {
            		{"ISTJ", "The Inspector - Practical, fact-minded, and reliable."},
           			{"ISFJ", "The Protector - Caring, loyal, and hardworking."},
            		{"INFJ", "The Advocate - Insightful, creative, and idealistic."},
            		{"INTJ", "The Mastermind - Strategic, logical, and independent."},
            		{"ISTP", "The Virtuoso - Bold, practical, and experiment-oriented."},
            		{"ISFP", "The Adventurer - Flexible, charming, and artistic."},
            		{"INFP", "The Mediator - Empathetic, imaginative, and driven by values."},
            		{"INTP", "The Thinker - Analytical, curious, and innovative."},
            		{"ESTP", "The Entrepreneur - Energetic, spontaneous, and action-oriented."},
            		{"ESFP", "The Entertainer - Sociable, enthusiastic, and fun-loving."},
            		{"ENFP", "The Campaigner - Optimistic, curious, and enthusiastic."},
            		{"ENTP", "The Debater - Witty, innovative, and intellectually curious."},
            		{"ESTJ", "The Executive - Organized, outgoing, and leader-like."},
            		{"ESFJ", "The Consul - Supportive, caring, and people-oriented."},
            		{"ENFJ", "The Protagonist - Inspiring, empathetic, and charismatic."},
            		{"ENTJ", "The Commander - Strategic, confident, and ambitious."}
        		};

			String description = "Unknown Personality Type";
        		for (String[] trait : traits) {
            			if (trait[0].equalsIgnoreCase(personalityType)) {
               				 description = trait[1];
               				 break;
            }
        }

			System.out.println("---------------------------");
       			System.out.println("Hello, " + name + "!");
       		 	System.out.println("Your MBTI Personality Type is: " + personalityType);
        		System.out.println(description);
        		System.out.println("---------------------------");
        		System.out.println("Total 'A' selections: " + countA);
        		System.out.println("Total 'B' selections: " + countB);

	}
}