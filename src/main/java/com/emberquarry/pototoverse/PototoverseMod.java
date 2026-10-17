package com.emberquarry.pototoverse;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PototoverseMod implements ModInitializer {
    public static final String MOD_ID = "pototoverse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Pototoverse is loading. Needs peace and some La Peace.");
    }
}
