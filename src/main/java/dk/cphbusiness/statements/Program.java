package dk.cphbusiness.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
  private static String name;
  
  public static void setName(String value) { name = value; }

  private static void sequenceThing() {
    int a = 8;
    setName("Kurt");
    {
      // This is a block
      int b = 9;
      System.out.println("Result: "+(a + b));
      // int a = 10; not legal
      }
    int b = 12; // This is legal
    ;;;;;;;;; // Empty statements - beware
    {}{}{}{}  // More empty statements
    class X {
      int y;
      }
    }
  
  private static void selectionThing() {
    int a = 8;
    if (a > 7) System.out.println("A was: "+a);
    
    if (a < 12) {
      a += 6;
      System.out.println("Now A is: "+a);
      }
    
    int choice = 5;
    if (choice == 1) System.out.println("Monday");
    else System.out.println("Not Monday");
    
    if (choice < 4) {
      if (choice > 2) System.out.println("Wednesday");
      else System.out.println("Very early in the week");
      }
    else System.out.println("Weekend approaching");
    
    if (choice == 1) System.out.println("Monday");
    else if (choice == 2) System.out.println("Tuesday");
    else if (choice == 3) System.out.println("Wednesday");
    else if (choice == 4) System.out.println("Thursday");
    else if (choice == 5) System.out.println("Friday");
    else System.out.println("Weekend");

    switch (choice) {
      case 1: System.out.println("Monday"); break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      default:
        System.out.println("Weekend");
        break;
        }
   
    try {
      Program program = new Program();
      Method method = program.getClass().getMethod("setName", String.class);
      method.invoke(program, "Yvonne");
      }
    catch (NoSuchMethodException ex) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }
    catch (SecurityException ex) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }
    catch (IllegalAccessException ex) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }
    catch (IllegalArgumentException ex) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }
    catch (InvocationTargetException ex) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }

    try {
      Program program = new Program();
      Method method = program.getClass().getMethod("setName", String.class);
      method.invoke(program, "Yvonne");
      }
    catch ( NoSuchMethodException
          | SecurityException
          | IllegalAccessException
          | IllegalArgumentException
          | InvocationTargetException ex
          ) {
      Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
      }
      

    }
  
  private static void iterationThing() throws IOException {
    for (int i = 0; i < 10; i++) {
      System.out.println("#"+i);
      }
    
    int[] as = new int[] { 7, 9, 13, 17, 23, 56 };
    https://google.com
    for (int a : as) {
      if (a == 13) continue https; // Plain stupid label name
      //if (a == 23) break; 
      
      switch (a) {
      case 23: break https;
        }
      System.out.println("#"+a);
      }
  
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line = in.readLine();
    while (line != null && !line.isEmpty()) {
      System.out.println(">>"+line+"<<");
      line = in.readLine();
      }
    
    do { // use do-while when all the code should be executed once
      String otherLine = in.readLine();
      if (otherLine == null) break;
      System.out.println("<<"+otherLine+">>");
      }
    while (true);
      
    }
  
  public static void main(String... args) throws IOException {
    // sequenceThing();
    // selectionThing();
    iterationThing();
    }
  }
