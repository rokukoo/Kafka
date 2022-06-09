package com.neptunex.kafka.addon;

import com.neptunex.kafka.core.context.ContextJavaPlugin;

public interface IAddon {

    void onEnable(ContextJavaPlugin context);

    void onDisable(ContextJavaPlugin context);

}
