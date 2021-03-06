package com.itrustcambodia.pluggable.validation.controller;

import java.io.Serializable;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * @author Socheat KHAUV
 */

public class Navigation implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1729466773629304522L;

    private Class<? extends WebPage> clazz;

    private WebPage instance;

    private PageParameters parameters;

    public Navigation(Class<? extends WebPage> clazz) {
        this.clazz = clazz;
    }

    public Navigation(WebPage instance) {
        this.instance = instance;
    }

    public Navigation(WebPage instance, PageParameters parameters) {
        this.instance = instance;
        this.parameters = parameters;
    }

    public Class<? extends WebPage> getClazz() {
        return clazz;
    }

    public WebPage getInstance() {
        return instance;
    }

    public PageParameters getParameters() {
        return parameters;
    }
}
