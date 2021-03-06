/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // student obj = new student();
        // obj.SetId(11);
        //System.out.println("id : "+obj.GetId());
        teacher obj=new teacher();
        obj.Setcontact(123456789);
        System.out.println(""+obj.Getcontact());
    }
    
}


class student{

private int id;
private String stdname;
private int standard;
private float marks;

//getter
public int GetId(){
    return id;
}
//Setter
void SetId(int Id){
    this.id =Id;
}
}


class teacher{
      
 private int contact;
 private String teachername;
 private String address;
 
 
 public int Getcontact(){
 return contact;
 }
 void Setcontact(int contact){
     this.contact =contact;
 }
 
}
      
 
