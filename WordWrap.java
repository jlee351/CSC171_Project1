import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordWrap{
  public static void main(String args[]){
    Scanner scnr = new Scanner(System.in);
    int no_letter;
    String line;
    List<String> wordlist = new ArrayList<String>();

    no_letter = scnr.nextInt();
    scnr.nextLine();
    line = scnr.nextLine();

    while(!line.equals("Stop.")){
      if(line.equals("")){
        wordlist.add("..");
      }
      String[] splitted = line.split("\\s+");
      for(String element:splitted){
        wordlist.add(element);

      }
      line = scnr.nextLine();
    }

    System.out.print("\n\nOUTPUT: \n\n");

    int counter = 0;
    for(int i = 0; i < wordlist.size();i++){

      if(wordlist.get(i).length() > no_letter){
        System.out.print("\n"+wordlist.get(i) + "\n");
        counter = 0;
        continue;
      }

      else if(wordlist.get(i).equals("..")){
        System.out.print("\n\n");
        counter = 0;
        continue;
      }

      counter += wordlist.get(i).length();

      if(counter > no_letter){
        counter = 0;
        counter += wordlist.get(i).length();
        System.out.print("\n");
      }

      System.out.print(wordlist.get(i) + " " );
      counter ++;
    }
    System.out.print("\n");
  }
}
