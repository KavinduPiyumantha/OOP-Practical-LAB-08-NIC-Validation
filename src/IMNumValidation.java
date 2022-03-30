/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAVINDU PIYUMANTHA
 */


import java.util.Scanner;

public class IMNumValidation {
    public static void main(String[] args) {
        
//    IM/2019/071        
        
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter the MIT Student Number  (IM/xxxx/xxx) : ");
        String stNum =scn.next();
        
        if(stNum.length()==11){
            
                if(stNum.charAt(2)=='/' && stNum.charAt(7)== '/'){
                     
                    String depCode =stNum.substring(0, 2);
                    // System.out.print(depCode);
                    if(  (stNum.charAt(0)=='i' ||  stNum.charAt(0)=='I'  )    &&   (stNum.charAt(1)=='m' ||  stNum.charAt(1)=='M'  )  ){
                            //System.out.print(stNum.substring(0, 2));
                             boolean digitStatus = false ;

                                    
                            for(int i=3 ; i<stNum.length() ; i++){

                                    if(i !=7){
                                            if(  Character.isDigit(stNum.charAt(i))  ){

                                                digitStatus =true;

                                            }else{
                                                digitStatus =false;
                                                break;  
                                            } 
                                    }
                            }                           
                        
                             if(digitStatus){
                                
                                     System.out.println("\n----------------  Valid MIT Student Number  ---------------- \n");
                                
                             }
                                
                    
                     }else{
                        System.out.println(" \nNot Valid !  Incorrect Department Code . \n");
                    }
                    
                    
                }else{
                        System.out.println(" \nNot Valid !  Incorrect separations (\"/\").  \n");
                }
    
        }else{
             System.out.println(" \nNot Valid !  Wrong character  Lentgth. \n");
        }

    }
}
