package com.infumia.fakeplayer.api;

import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public interface INPC {

    void spawn(@NotNull Location location);

    void deSpawn();

    void tp(@NotNull Location location);

    void update();

}
