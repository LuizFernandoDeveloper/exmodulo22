package src.testeModel;

import model.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testPessoa {
    Pessoa p = new Pessoa("luiz", "M");

    @Test
    public void testSetName(){
        p.setName("marcio");
        Assert.assertEquals("marcio", p.getName());
    }

    @Test
    public void  testSetSexo(){
        p.setSexo("M");
        Assert.assertEquals("M", p.getSexo());
    }
    @Test
    public void TestListSexo(){
        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa("Jailson", "M"));
        list.add(new Pessoa("Renata","F"));
        list.add(new Pessoa("Tiago", "M"));
        list.add(new Pessoa("Bel", "F"));
        Pessoa.getListSexo(list, "F").forEach(p -> Assert.assertEquals("F", p.getSexo()));
    }
    @Test
    public  void testEquals(){
        Assert.assertEquals(true, p.equals(p));
    }

    @Test
    public void testHashCode(){
        Pessoa p2 = new Pessoa("Luiz", "M");
        Assert.assertNotEquals(p.hashCode(), p2.hashCode());
    }

    @Test
    public void testToString(){
        Assert.assertEquals( p, p);
    }
}
