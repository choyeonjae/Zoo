# Zoo
public class Zoo{
public static void main(String[] args){
  //all_sounds(my_zoo);
  Scanner scan = new Scanner(System.in);
   System.out.println("welcom zoo!");
   System.out.println("tourist or keeper (T / K)");
   String choice = scan.nextLine();
}

public static void all_sounds(Animals[] zoo){
  int i=1;
    while (i==1){
  if (choice == T){
    System.out.println("What animal do you want to see?" );
    String name = scan.nextLine();
      System.out.println("The",name,"goes",sound);
  }
  if(choice == K){
    System.out.println("What animal(name,sound) do you want to add? Write (name,sound)");
    String Animal = scan.nextLine();
  }
  }
}
}
