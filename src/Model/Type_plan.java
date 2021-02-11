/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mark-
 */
public class Type_plan {
    private int cod_type;
    private String desc_type;

    public Type_plan() {
    }

    public Type_plan(int cod_type, String desc_type) {
        this.cod_type = cod_type;
        this.desc_type = desc_type;
    }
    

    public Type_plan(String desc_type) {
        this.desc_type = desc_type;
    }

    public int getCod_type() {
        return cod_type;
    }

    public void setCod_type(int cod_type) {
        this.cod_type = cod_type;
    }

    public String getDesc_type() {
        return desc_type;
    }

    public void setDesc_type(String desc_type) {
        this.desc_type = desc_type;
    }

    @Override
    public String toString(){
    return desc_type;
    }
}
