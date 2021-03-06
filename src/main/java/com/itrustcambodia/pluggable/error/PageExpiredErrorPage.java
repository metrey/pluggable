package com.itrustcambodia.pluggable.error;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.wicket.request.http.WebResponse;

import com.itrustcambodia.pluggable.core.Menu;
import com.itrustcambodia.pluggable.core.Mount;
import com.itrustcambodia.pluggable.layout.ErrorLayout;
import com.itrustcambodia.pluggable.wicket.authroles.authorization.strategies.role.Roles;

/**
 * @author Socheat KHAUV
 */
@Mount("/l")
public class PageExpiredErrorPage extends AbstractErrorPage {
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     */
    public PageExpiredErrorPage() {
        ErrorLayout layout = new ErrorLayout("layout");
        add(layout);
        layout.add(homePageLink("homePageLink"));
    }

    @Override
    protected void setHeaders(final WebResponse response) {
        response.setStatus(HttpServletResponse.SC_GONE);
    }

    @Override
    public String getPageTitle() {
        return "Page Expired";
    }

    @Override
    public List<Menu> getPageMenus(Roles roles) {
        return null;
    }
}