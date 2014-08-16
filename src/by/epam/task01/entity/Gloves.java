/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import by.epam.task01.ProjectExeptions.ProjectException;

/**
 *
 * @author Helena.Grouk
 */
public class Gloves extends BuiltInBodyProtection { //перчатки

    private boolean palmProtect; //защита ладони
    private boolean fingersProtect; //защита пальцев
    private boolean knucklesProtect; //защита костяшек пальцев
    
    public Gloves(int id, String name) throws ProjectException {
        super(id, name);
    }
    
    public Gloves(int id, String name, int price, float weight) throws ProjectException {
        super(id, name, price, weight);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Gloves eq = (Gloves)obj;
        if (!super.equals(eq)){
            return false;
        }
        
        if(palmProtect != eq.palmProtect) {
            return false;
        }
        if(fingersProtect != eq.fingersProtect) {
            return false;
        }
        if(knucklesProtect != eq.knucklesProtect) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.palmProtect ? 1 : 0);
        hash = 59 * hash + (this.fingersProtect ? 1 : 0);
        hash = 59 * hash + (this.knucklesProtect ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        String str1 = super.toString();
        int i = str1.indexOf("@");
        if (i > 0) {
            str1 = str1.substring(i+1);
        }
        StringBuilder str = new StringBuilder(getClass().getName());
        str.append('@');
        str.append(str1);
        str.append(", palmProtect: ");
        str.append(palmProtect);
        str.append(", fingersProtect: ");
        str.append(fingersProtect);
        str.append(", knucklesProtect: ");
        str.append(knucklesProtect);
        return str.toString();
    }
    
    public void setPalmProtect(boolean palmProtect) {
        this.palmProtect = palmProtect;
    }
    
    public boolean isPalmProtect() {
        return this.palmProtect;
    }
    
    public void setFingersProtect(boolean fingersProtect) {
        this.fingersProtect = fingersProtect;
    }
    
    public boolean isFingersProtect() {
        return this.fingersProtect;
    }
    
    public void setKnucklesProtect(boolean knucklesProtect) {
        this.knucklesProtect = knucklesProtect;
    }
    
    public boolean isKnucklesProtect() {
        return this.knucklesProtect;
    }
    
}
