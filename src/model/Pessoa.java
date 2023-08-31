package model;

import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
    
    private String name;
    private String sexo;

    public Pessoa (String name , String sexo){
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo.equals("M") || sexo.equals("F")){
            this.sexo = sexo;
        }else {
            this.sexo = null;
        }
    }

    public static  List<Pessoa> getListSexo(List<Pessoa> listp, String searchSexo ){
     return  listp.stream().filter(p -> p.getSexo().toUpperCase() == searchSexo.toUpperCase()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Pessoa [ name = " + name + ", sexo = " + sexo + " ]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sexo == null) {
            if (other.sexo != null)
                return false;
        } else if (!sexo.equals(other.sexo))
            return false;
        return true;
    }
}
