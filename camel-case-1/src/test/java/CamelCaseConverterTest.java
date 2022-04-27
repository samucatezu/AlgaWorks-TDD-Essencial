import CamelCase.CamelCaseConverter;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTest {

    private CamelCaseConverter camelCase;

    @Before
    public void setup(){

         camelCase = new CamelCaseConverter();

    }

    @Test
    public void deveConverterNomeSimples() throws Exception{
        assertEquals("Samuel", camelCase.converter("samuel"));
    }

    @Test
    public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() throws Exception{
        assertEquals("Samuel", camelCase.converter("SAMuel"));
    }
}
