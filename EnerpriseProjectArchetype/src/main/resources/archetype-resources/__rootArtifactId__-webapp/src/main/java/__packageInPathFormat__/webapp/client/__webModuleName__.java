#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.webapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

import ru.sendto.rest.gwt.Websocket;

public class ${webModuleName} implements EntryPoint{

	@Override
	public void onModuleLoad() {
		Websocket.init(GWT.getHostPageBaseURL() + "ws");
	}
	
}
