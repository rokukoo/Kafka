package com.neptunex.kafka.addon;

import com.neptunex.kafka.core.context.ContextJavaPlugin;

public class AddonDefinition implements IAddon {

    private String name;
    private Class<? extends IAddon> clazz;

    public String getName() {
        return null;
    }

    public String getVersion() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getAuthor() {
        return null;
    }

    public String getWebsite() {
        return null;
    }

    @Override
    public void onEnable(ContextJavaPlugin context) {

    }

    @Override
    public void onDisable(ContextJavaPlugin context) {

    }
}
