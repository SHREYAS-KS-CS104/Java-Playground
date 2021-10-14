public class Song{
 public static void main(String[] args){
  verse1();
  System.out.println();
  verse2();
  System.out.println();
  verse3();
  System.out.println();
  verse4();
  System.out.println();
  verse5();
  System.out.println();
  verse6();
  System.out.println();
  verse7();
 }

 public static void verse1(){
  System.out.println("There was an old woman who swallowed a fly.");
  lastStanza1();
 }
 
 public static void lastStanza1(){
  System.out.println("I don't know why she swallowed that fly,");
  System.out.println("Perhaps she'll die.");
 }

 public static void verse2(){
  System.out.println("There was an old woman who swallowed a spider,");
  System.out.println("That wriggled and iggled and jiggled inside her.");
  lastStanza2();
 }

 public static void lastStanza2(){
  System.out.println("She swallowed the spider to catch the fly,");
  lastStanza1();
 }
 
 public static void verse3(){
  System.out.println("There was an old woman who swallowed a bird,");
  System.out.println("How absurd to swallow a bird.");
  lastStanza3();
 }
 
 public static void lastStanza3(){
  System.out.println("She swallowed the bird to catch the spider,");
  lastStanza2();
 }
 
 public static void verse4(){
  System.out.println("There was an old woman who swallowed a cat,");
  System.out.println("Imagine that to swallow a cat.");
  lastStanza4(); 
 }

 public static void lastStanza4(){
  System.out.println("She swallowed the cat to catch the bird,");
  lastStanza3();
 }

 public static void verse5(){
  System.out.println("There was an old woman who swallowed a dog,");
  System.out.println("What a hog to swallow a dog.");
  lastStanza5();
 }
 
 public static void lastStanza5(){
  System.out.println("She swallowed the dog to catch the cat,");
  lastStanza4();
 }

 public static void verse6(){
  System.out.println("There was an old woman who swallowed a fox,");
  System.out.println("How could anybody even swallow a fox.");
  lastStanza6();
 }
 
 public static void lastStanza6(){
  System.out.println("She swallowed the fox to catch the dog,");
  lastStanza5();
 }
 
 public static void verse7(){
  System.out.println("There was an old woman who swallowed a horse,");
  System.out.println("She died of course.");
 }

}
   
 
 

  

