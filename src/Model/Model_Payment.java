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
public class Model_Payment {
    private int cod_model;
    private String desc_model;

    public Model_Payment() {
    }

    public Model_Payment(String desc_model) {
        this.desc_model = desc_model;
    }

    public Model_Payment(int cod_model, String desc_model) {
        this.cod_model = cod_model;
        this.desc_model = desc_model;
    }

    public int getCod_model() {
        return cod_model;
    }

    public void setCod_model(int cod_model) {
        this.cod_model = cod_model;
    }

    public String getDesc_model() {
        return desc_model;
    }

    public void setDesc_model(String desc_model) {
        this.desc_model = desc_model;
    }
    
    @Override
    public String toString(){
    return desc_model;
    }
}
