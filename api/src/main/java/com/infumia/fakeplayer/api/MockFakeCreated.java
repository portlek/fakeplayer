package com.infumia.fakeplayer.api;

import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

public final class MockFakeCreated implements FakeCreated {
    @NotNull
    @Override
    public INPC create(@NotNull final String name, @NotNull final World world) {
        return new MockNPC();
    }

}
