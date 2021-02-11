/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepeatClasses;

/**
 *
 * @author Mark-
 */
public class User2 extends Type_plan2{
    private String name_pers;

    public User2() {
    }

    public User2(String name_pers, String desc_type, String desc_model) {
        super(desc_type, desc_model);
        this.name_pers = name_pers;
    }

    

    public String getName_pers() {
        return name_pers;
    }

    public void setName_pers(String name_pers) {
        this.name_pers = name_pers;
    }
    
    
}
