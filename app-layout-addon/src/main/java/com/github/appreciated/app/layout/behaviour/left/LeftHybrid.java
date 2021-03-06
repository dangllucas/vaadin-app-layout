package com.github.appreciated.app.layout.behaviour.left;

import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.JavaScript;

import java.io.IOException;

/**
 * Created by appreciated on 01.05.2017.
 */
@JavaScript("vaadin://addons/app-layout/babel-helpers.js")
@JavaScript("vaadin://bower_components/webcomponentsjs/custom-elements-es5-adapter.js")
@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents-lite.js")

@HtmlImport("vaadin://bower_components/iron-icons/iron-icons.html")
@HtmlImport("vaadin://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("vaadin://bower_components/app-layout/app-drawer-layout/app-drawer-layout.html")
@HtmlImport("vaadin://bower_components/app-layout/app-drawer/app-drawer.html")
@HtmlImport("vaadin://bower_components/app-layout/app-scroll-effects/app-scroll-effects.html")
@HtmlImport("vaadin://bower_components/app-layout/app-header/app-header.html")
@HtmlImport("vaadin://bower_components/app-layout/app-header-layout/app-header-layout.html")
@HtmlImport("vaadin://bower_components/app-layout/app-toolbar/app-toolbar.html")

public class LeftHybrid extends AbstractLeftAppLayout {

    public LeftHybrid() throws IOException {
        super("left-hybrid.html");
    }

    @Override
    public String getStyleName() {
        return "left-hybrid";
    }
}
