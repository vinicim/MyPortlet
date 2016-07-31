package br.com.my;

import java.io.IOException;
import java.sql.SQLException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.persistence.ContactActionableDynamicQuery;

public class MyPortlet extends GenericPortlet {
	
	private static Log _log = LogFactory.getLog(MyPortlet.class);
	
	protected String view;
	
	@Override
	public void init() throws PortletException {
		super.init();
		view = getInitParameter("view-template");
	}

	public void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
	}

	public void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
	}

	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		System.out.println("In doView");
		
	
		include(view, request, response);
	}
	
	public void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException{
		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);
	    if (portletRequestDispatcher == null) {
	      _log.error(path + " is not a valid include");
	    } else {
	      portletRequestDispatcher.include(renderRequest, renderResponse);
	    }
	}
	
	

}
