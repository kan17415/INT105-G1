/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4inher;

public class Person {
    private String name;
    public long cardId;
    private String surname;
    
    public Person(){
        System.out.println("Person constructor is working !");
    }

    public Person(String name, long cardId, String surname) {
        this.name = name;
        this.cardId = cardId;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public long getCardId() {
        return cardId;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cardId=" + cardId + ", surname=" + surname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.cardId != other.cardId) {
            return false;
        }
        return true;*/
        if(obj !=null && obj instanceof Person){
            Person ps = (Person)obj;
            if(cardId==ps.cardId){
                return true;
             
            }
        }
        return false;
        
    }
    
    
    
    
}
