#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.knime.core.node.KNIMEConstants;

public class ActivatorTest {

    @Test
    public void veryStupidTest() {
        assertEquals("${parentArtifactId}.plugin", Activator.PLUGIN_ID);
    }
    
    @Test
    public void myverTest() {
    	assertEquals("3.5.1", KNIMEConstants.VERSION);
    }
}
