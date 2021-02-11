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
public class Type_plan2 extends Model_Payment2{

    private String desc_type;

    public Type_plan2() {
    }

    public Type_plan2(String desc_type, String desc_model) {
        super(desc_model);
        this.desc_type = desc_type;
    }


    public String getDesc_type() {
        return desc_type;
    }

    public void setDesc_type(String desc_type) {
        this.desc_type = desc_type;
    }
    
    
    
}
