#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.serialization;

import org.restexpress.serialization.json.JacksonJsonProcessor;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializationProcessor
extends JacksonJsonProcessor
{
	@Override
    protected void initializeModule(SimpleModule module)
    {
	    super.initializeModule(module);
    }
}
