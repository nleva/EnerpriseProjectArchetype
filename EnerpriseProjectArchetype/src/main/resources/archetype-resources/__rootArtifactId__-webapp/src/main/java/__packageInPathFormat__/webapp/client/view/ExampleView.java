#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.webapp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ExampleView extends Composite {

	interface FormUiBinder extends UiBinder<Widget, ExampleView> {}
	{initWidget(((FormUiBinder)GWT.create(FormUiBinder.class)).createAndBindUi(this));}

}
