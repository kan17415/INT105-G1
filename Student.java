/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4testna;

import week4inher.Person;
public class Student extends Person  {
    public double score;
    public Student() {
    }

    public Student(double score,String name, long cardId, String surname) {
        super(name, cardId, surname);
        this.score = score;
        
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
    
    
    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    
    public double Grade(){
        if(score>=3.6){
            System.out.println("professional Student");
        }else if(score>=3.0){
            System.out.println("Medium Student");
        }else if(score>=2.0){
            System.out.println("Poor Student");
        }else if(score>=1.8){
            System.out.println("ProHight Student");
        }else if(score>=1.5 && score<1.8){
            System.out.println("ProLow Student");
        }
        return score;
    } 
  public String toString() {
        return super.toString();
    }

  
    
    
    
    
}
