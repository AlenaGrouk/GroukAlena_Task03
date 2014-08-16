/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import by.epam.task01.ProjectExeptions.ProjectException;
import java.util.Objects;


/**
 *
 * @author Helena.Grouk
 */
public class Helmet extends MainEquip { //шлем
    
    private HelmetType helmetType; //тип шлема
    private String shellMaterial; //материал поверхности
    private String insertMaterial; //материал внутренней обшивки
    private int vents; //кол-во вентиляционнных каналов
    private boolean sunVisor; //наличие встроенного сонцезащитного визора 
    private boolean headsetConnector; //наличие разъема под гарнитуру
    private boolean admissionGp; //наличие сертификата доступа к motoGP
    
    public Helmet(int id, String name) throws ProjectException {
        super(id, name);
    }
    
    public Helmet(int id, String name, int price, int weight)
            throws ProjectException {
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
        
        Helmet eq = (Helmet)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(helmetType != eq.helmetType) {
            return false;
        }
        if(shellMaterial == null ? eq.shellMaterial != null : 
                !shellMaterial.equals(eq.shellMaterial)) {
            return false;
        }
        if(insertMaterial == null ? eq.insertMaterial != null : 
                !insertMaterial.equals(eq.insertMaterial)) {
            return false;
        }
        if(vents != eq.vents) {
            return false;
        }
        if(sunVisor != eq.sunVisor) {
            return false;
        }
        if(headsetConnector != eq.headsetConnector) {
            return false;
        }
        if(admissionGp != eq.admissionGp) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.helmetType);
        hash = 19 * hash + Objects.hashCode(this.shellMaterial);
        hash = 19 * hash + Objects.hashCode(this.insertMaterial);
        hash = 19 * hash + this.vents;
        hash = 19 * hash + (this.sunVisor ? 1 : 0);
        hash = 19 * hash + (this.headsetConnector ? 1 : 0);
        hash = 19 * hash + (this.admissionGp ? 1 : 0);
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
        str.append(", helmetType: ");
        str.append(helmetType);
        str.append(", shellMaterial: ");
        str.append(shellMaterial);
        str.append(", insertMaterial: ");
        str.append(insertMaterial);
        str.append(", vents: ");
        str.append(vents);
        str.append(", sunVisor: ");
        str.append(sunVisor);
        str.append(", headsetConnector: ");
        str.append(headsetConnector);
        str.append(", admissionGp: ");
        str.append(admissionGp);
        
        return str.toString();
    }
    
    public void setHelmetType(String helmetType) throws ProjectException {
        if (helmetType == null) {
            throw new ProjectException("Helmet.helmetType == null");
        }
        
        try {
            this.helmetType = HelmetType.valueOf(helmetType);
        }
        catch(IllegalArgumentException e) {
            throw new ProjectException("Helmet.helmetType = " + helmetType
                    + " is unnoun.");
        }  
    }
    
    public HelmetType getHelmetType(){
        return helmetType;
    }
    
    public void setShellMaterial(String shellMaterial) throws ProjectException {
        if (shellMaterial == null || shellMaterial.isEmpty()) {
            throw new ProjectException("Helmet.shellMaterial == null or empty.");
        }
        this.shellMaterial = shellMaterial;
    }
    
    public String getShellMaterial() {
        return shellMaterial;
    }
    
    public void setInsertMaterial(String insertMaterial) 
            throws ProjectException {
        if (insertMaterial == null || insertMaterial.isEmpty()) {
            throw new ProjectException("Helmet.shellMaterial == null or empty.");
        }
        this.insertMaterial = insertMaterial;
    }
    
    public String getInsertMaterial() {
        return insertMaterial;
    }
    
    public void setVents(Integer vents) throws ProjectException {
        if (vents < 0) {
            throw new ProjectException("Helmet.vents < 0");
        }
        this.vents = vents;
    }
    
    public int getVents() {
        return vents;
    }
    
    public void setSunVisor(Boolean sunVisor) {
        this.sunVisor = sunVisor;
    }
    
    public boolean isSunVisor() {
        return sunVisor;
    }
    
    public void setHeadsetConnector(Boolean headsetConnector) {
        this.headsetConnector = headsetConnector;
    }
    
    public boolean isHeadsetConnector() {
        return headsetConnector;
    }
    
    public void setAdmissionGp(Boolean admissionGp) {
        this.admissionGp = admissionGp;
    }
    
    public boolean isAdmissionGp() {
        return admissionGp;
    }
}
