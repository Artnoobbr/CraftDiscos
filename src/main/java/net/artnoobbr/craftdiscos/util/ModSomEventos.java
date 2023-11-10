package net.artnoobbr.craftdiscos.util;

import net.artnoobbr.craftdiscos.CraftDiscos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSomEventos {

    public static DeferredRegister<SoundEvent> SOM_EVENTOS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftDiscos.MOD_ID);

    //registro do som
    public static final RegistryObject<SoundEvent> HEROBRINE =
            registrarEventoSom("herobrine");

    public static final RegistryObject<SoundEvent> DESCONHECIDO =
            registrarEventoSom("desconhecido");

    public static final RegistryObject<SoundEvent> MEME =
            registrarEventoSom("meme");


    //Ajudante
    private static RegistryObject<SoundEvent> registrarEventoSom(String name) {
        return SOM_EVENTOS.register(name, () -> new SoundEvent(new ResourceLocation(CraftDiscos.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOM_EVENTOS.register(eventBus);
    }

}
