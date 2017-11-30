package ut.com.antonybaasan.jiraplugin;

import org.junit.Test;
import com.antonybaasan.jiraplugin.api.MyPluginComponent;
import com.antonybaasan.jiraplugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}