package com.neptunex.kafka;

import com.neptunex.kafka.core.context.Context;
import com.neptunex.kafka.core.context.ContextJavaPlugin;
import lombok.Getter;
import org.bukkit.Bukkit;

public class Kafka extends ContextJavaPlugin {

    @Getter
    private static Kafka instance;

    public Kafka(){
        instance = this;
    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

}
