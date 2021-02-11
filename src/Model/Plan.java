/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import RepeatClasses.Client2;

import java.sql.Date;

/**
 *
 * @author Mark-
 */
public class Plan extends Client2{
    private int cod_plan;
    private Date date_in;
    private Date date_end;

    public Plan() {
    }

    public Plan(int cod_plan, Date date_in, Date date_end, String name_client, String name_pers, String desc_type, String desc_model) {
        super(name_client, name_pers, desc_type, desc_model);
        this.cod_plan = cod_plan;
        this.date_in = date_in;
        this.date_end = date_end;
    }

    

    public int getCod_plan() {
        return cod_plan;
    }

    public void setCod_plan(int cod_plan) {
        this.cod_plan = cod_plan;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }
    
    
}
