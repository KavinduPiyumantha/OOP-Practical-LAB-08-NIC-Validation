/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAVINDU PIYUMANTHA
 */
import  java.util.Scanner;




public class IDValidation {
    
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in );
        
        while(true){
        
                System.out.print("Enter Id Number  : ");
                String id = scn.next();

                    if(  (id.length() == 10)  ||  ( id.length() == 12)  ){

                            if((id.length() == 10)){
                                    //System.out.print("This is Old ID \n");

                                    boolean digitStatus = false ;

                                        if(id.endsWith("V") || id.endsWith("v")){ //last letter check

                                            //System.out.print("Last Character is v \n");

                                            //first 9  Characters are number check
                                            for(int i=0 ; i<9 ; i++){

                                                    if(  Character.isDigit(id.charAt(i))  ){

                                                        digitStatus =true;

                                                    }else{
                                                        digitStatus =false;
                                                        break;  
                                                    }    
                                            }

                                        if(digitStatus){
                                                 //System.out.print("First 9 Characters are Numbers \n");
                                                 
                                                 int febdates=28;
                                                 String Year = id.substring(0, 2);
                                                 String strYear = "19"+ Year;
                                                 
                                                 int intYear =Integer.parseInt(strYear);
                                                 
                                                 
                                                 if (intYear % 4 == 0) {

                                                        // if the year is century
                                                        if (intYear % 100 == 0) {

                                                              // if year is divided by 400
                                                              // then it is a leap year
                                                              if (intYear % 400 == 0){
                                                                    febdates=29;
                                                              }else{
                                                                    febdates=28;
                                                              }

                                                    // if the year is not century
                                                        }else{
                                                           febdates=29;
                                                         }

                                                 }else{
                                                         febdates=28;
                                                 }
                                                 
                                                 //System.out.println(febdates );
                                                 System.out.print("\nThis Id  is a Correct Old Version NIC \n");
                                                 
                                                 System.out.print("Birth Year : 19"+Year+"\n");
                                                 
                                                 String gender = id.substring(2, 5);
                                                
                                                 int intgender  = Integer.parseInt(gender);
                                                 int dates = intgender ;
                                                 //System.out.println(intgender );
                                                 //System.out.println(dates );
                                                 
                                                 if(intgender<=500){
                                                     System.out.print("Gender : Male \n");
                                                     
                                                     monthDate(febdates, dates);
                                                   
                                                 }else{
                                                     System.out.print("Gender : Female: \n");
                                                     dates = dates-500;
                                                     
                                                     monthDate(febdates, dates);
                                                     
                                                     
                                                 }
                                                 
                                                 
                                                 
                                                 
                                        }else{    
                                                System.out.print("First all 9 Characters are not Numbers \n\n");
                                        }

                                        }else{
                                                    System.out.print("Last Character is not a v \n");
                                         }

                             }else { //new Id check
                                //System.out.print("This is new ID \n");

                                    boolean digitStatus = false ;


                                            //System.out.print("Last Character is v \n");

                                            //first 9  Characters are number check
                                            for(int i=0 ; i<id.length() ; i++){

                                                    if(  Character.isDigit(id.charAt(i))  ){

                                                        digitStatus =true;

                                                    }else{
                                                        digitStatus =false;
                                                        break;  
                                                    }    
                                            }

                                        if(digitStatus){
                                                 //System.out.print("First 9 Characters are Numbers \n");
                                                 
                                                 int febdates=28;
                                                 String Year = id.substring(0, 4);
                                                 //String strYear = "19"+ Year;
                                                 
                                                 int intYear =Integer.parseInt(Year);
                                                 
                                                 
                                                 if (intYear % 4 == 0) {

                                                        // if the year is century
                                                        if (intYear % 100 == 0) {

                                                              // if year is divided by 400
                                                              // then it is a leap year
                                                              if (intYear % 400 == 0){
                                                                    febdates=29;
                                                              }else{
                                                                    febdates=28;
                                                              }

                                                    // if the year is not century
                                                        }else{
                                                           febdates=29;
                                                         }

                                                 }else{
                                                         febdates=28;
                                                 }
                                                 
                                                 //System.out.println(febdates );
                                                 System.out.print("\nThis Id  is a Correct New Version NIC \n");
                                                 
                                                 System.out.print("Birth Year : "+Year+"\n");
                                                 
                                                 String gender = id.substring(4, 7);
                                                
                                                 int intgender  = Integer.parseInt(gender);
                                                 int dates = intgender ;
                                                 //System.out.println(intgender );
                                                 //System.out.println(dates );
                                                 
                                                 if(intgender<=500){
                                                     System.out.print("Gender : Male \n");
                                                     
                                                     monthDate(febdates, dates);
                                                   
                                                 }else{
                                                     System.out.print("Gender : Female: \n");
                                                     dates = dates-500;
                                                     
                                                     monthDate(febdates, dates);
                                                     
                                                     
                                                 }
                                                 
                                                 
                                                 
                                                 
                                        }else{    
                                                System.out.print("First all 9 Characters are not Numbers \n\n");
                                        }
                              
                             }
                    }else{
                                 System.out.print("Wrong Id Lentgth \n\n");
                    }
        }         //while loop close tkps
    
    }         //main close
   
        public static void monthDate(int nfebdates, int ndates){
            int febdates =nfebdates;
            int dates=ndates;
            
                                                         if(dates<=31){
                                                              System.out.print("Month : January \n");
                                                              System.out.print("Day : "+dates+" \n\n");  
                                                          
                                                         }else if(dates<= (31+febdates)  ){
                                                              System.out.print("Month : February \n");
                                                              System.out.print("Day : "+ (dates-31)+" \n\n");
                                                              
                                                         }else if(dates<= (31+febdates+31)  ){
                                                              System.out.print("Month : March \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +1))+" \n\n");
                                                              
                                                         }else if(dates<= (31+febdates+31+30)  ){
                                                              System.out.print("Month : April \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31     +1 ))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31)  ){
                                                              System.out.print("Month : May \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30     +1 ))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30)  ){
                                                              System.out.print("Month : June \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31     +1))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30+31  )  ){
                                                              System.out.print("Month : July \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31+30     +1))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30+31+31  )  ){
                                                              System.out.print("Month : August \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31+30+31   +1 ))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30+31+31+30  )  ){
                                                              System.out.print("Month : September \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31+30+31+31    +1 ))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30+31+31+30+31  )  ){
                                                              System.out.print("Month : October \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31+30+31+31+30    +1 ))+" \n\n");  
                                                              
                                                         }else if(dates<= (31+febdates+31+30+31+30+31+31+30+31+30  )  ){
                                                              System.out.print("Month : November \n");
                                                              System.out.print("Day : "+ (dates-(31+febdates +31+30+31+30+31+31+30+31    +1 ))+" \n\n");  
                                                              
                                                         }else{
                                                             System.out.print("Month : December \n");
                                                             System.out.print("Day : "+ (dates-(31+febdates+31+30+31+30+31+31+30+31+30   +1 ))+" \n\n");
                                                         }
            
            
        }
    
}
