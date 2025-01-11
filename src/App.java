import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> familyMembers = new ArrayList<>();
        familyMembers.add("Brad");
        familyMembers.add("Chad");
        familyMembers.add("Thad");
        familyMembers.add("Chuck");
        familyMembers.add("Larry");
        HashSet<String> iceCreamFlavors = new HashSet<>();
        iceCreamFlavors.add("Chocolate");
        iceCreamFlavors.add("Vanilla");
        iceCreamFlavors.add("Strawberry");
        iceCreamFlavors.add("Moosetracks");
        iceCreamFlavors.add("Superman");
        iceCreamFlavors.add("Cookiedough");
        HashMap<String,Integer> voteCount = new HashMap<>();
        voteCount.put("Chocolate", 0);
        voteCount.put("Vanilla",0);
        voteCount.put("Strawberry",0);
        voteCount.put("Moosetracks",0);
        voteCount.put("Superman",0);
        voteCount.put("Cookiedough",0);

        System.out.println("Let's vote on ice cream flavors. Here are your options:");
        // #1 - loop through options.
        for(String flavor: iceCreamFlavors){
            System.out.println(flavor);
        }

        for(String member: familyMembers){
            boolean isValidAnswer = true;
            do{
                System.out.println("What flavor do you want to vote for " + member +"?");
                String userChoice = sc.nextLine();
                if(voteCount.containsKey(userChoice)){
                    voteCount.put(userChoice,voteCount.get(userChoice)+1);
                }
                else{
                    System.out.println("That is not a valid flavor. Please try again");
                }
            }while(isValidAnswer==false);
        }
        for(String i: voteCount.keySet()){
            System.out.println(i + "-" + voteCount.get(i));
        }
        int highestVotes = Collections.max(voteCount.values());
        System.out.println("The flavor(s) with the most votes are:");
        for (String flavor: voteCount.keySet()){
            if(voteCount.get(flavor) == highestVotes){
                System.out.println(flavor + ": " + highestVotes);
            }
        }

    }
}
