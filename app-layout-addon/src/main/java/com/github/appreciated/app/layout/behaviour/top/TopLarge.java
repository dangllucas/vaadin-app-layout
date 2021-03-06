package com.github.appreciated.app.layout.behaviour.top;

import com.github.appreciated.app.layout.component.HorizontalFlexBoxLayout;
import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.Component;

import java.io.IOException;

/**
 * Created by appreciated on 01.05.2017.
 */
@JavaScript("vaadin://addons/app-layout/babel-helpers.js")
@JavaScript("vaadin://bower_components/webcomponentsjs/custom-elements-es5-adapter.js")
@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents-lite.js")

@HtmlImport("vaadin://bower_components/iron-icons/iron-icons.html")
@HtmlImport("vaadin://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("vaadin://bower_components/app-layout/app-toolbar/app-toolbar.html")
@HtmlImport("vaadin://bower_components/app-layout/app-drawer/app-drawer.html")

public class TopLarge extends AbstractTopAppLayout {

    private final HorizontalFlexBoxLayout appHeaderHolder = new HorizontalFlexBoxLayout();
    private final HorizontalFlexBoxLayout appElementHolder = new HorizontalFlexBoxLayout();
    private final HorizontalFlexBoxLayout appFooterHolder = new HorizontalFlexBoxLayout();

    private final HorizontalFlexBoxLayout appbarMenuHolder = new HorizontalFlexBoxLayout(appHeaderHolder, appElementHolder, appFooterHolder);

    public TopLarge() throws IOException {
        super("top-large.html");
        addComponent(appbarMenuHolder, "app-bar-menu-content");
        appHeaderHolder.setAlignCenter();
        appElementHolder.setAlignCenter();
        appFooterHolder.setAlignCenter();
        appbarMenuHolder.grow(appElementHolder);
    }

    @Override
    public void addToTopHeader(Component component) {
        appHeaderHolder.addComponent(component);
    }

    @Override
    public void addToTop(Component component) {
        appElementHolder.addComponent(component);
    }

    @Override
    public void addToTopFooter(Component component) {
        appFooterHolder.addComponent(component);
    }

    @Override
    public String getStyleName() {
        return "top-large";
    }
}
