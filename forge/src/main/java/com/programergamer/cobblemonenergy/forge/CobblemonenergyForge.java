package com.programergamer.cobblemonenergy.forge;

import com.cobblemon.mod.common.api.pokemon.PokemonProperties;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.api.types.ElementalType;
import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.PokemonStats;
import com.cobblemon.mod.common.pokemon.Species;
import com.cobblemon.mod.common.util.DataKeys;
import com.programergamer.cobblemonenergy.Cobblemonenergy;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

import java.util.stream.StreamSupport;

@Mod(Cobblemonenergy.MOD_ID)
public final class CobblemonenergyForge {
    public CobblemonenergyForge() {
        // Run our common setup.
        Cobblemonenergy.init();
        Pokemon po = PokemonProperties.Companion.parse("Pikachu").create();
        //ElementalTypes.INSTANCE.getELECTRIC();
        boolean b = StreamSupport.stream(po.getTypes().spliterator(), false).anyMatch(type -> type.equals(ElementalTypes.INSTANCE.getELECTRIC()));
        if (b) {
            System.out.println("Electric is true");
        }
        //poke.getSpecialAttack();
        //poke.getSpeed();
    }
}
