package com.infumia.fakeplayer.api;

import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public interface Fake {

    @NotNull
    String getName();

    @NotNull
    Location getSpawnPoint();

    void spawn();

}