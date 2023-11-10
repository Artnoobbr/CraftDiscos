package net.artnoobbr.craftdiscos.item;

import net.artnoobbr.craftdiscos.CraftDiscos;
import net.artnoobbr.craftdiscos.util.ModSomEventos;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //DefferredRegister é uma lista que localiza de todos os items ou blocos e outras coisas
    // Que o forge pode registrar e localizar
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, CraftDiscos.MOD_ID);


    public static final RegistryObject<Item> BASE_DISCO = ITEMS.register("base_disco",
            () -> new Item(new Item.Properties().group(ModItemGrupo.DISCOS_GROUP)));

    public static final RegistryObject<Item> HEROBRINE_MUSIC_DISC = ITEMS.register("herobrine_music_disc",
            () -> new MusicDiscItem(1, () -> ModSomEventos.HEROBRINE.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGrupo.DISCOS_GROUP)));

    public static final RegistryObject<Item> DESCONHECIDO_MUSIC_DISC = ITEMS.register("desconhecido_music_disc",
            () -> new MusicDiscItem(1, () -> ModSomEventos.DESCONHECIDO.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGrupo.DISCOS_GROUP)));

    public static final RegistryObject<Item> MEME_MUSIC_DISC = ITEMS.register("meme_music_disc",
            () -> new MusicDiscItem(1, () -> ModSomEventos.MEME.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGrupo.DISCOS_GROUP)));


    //Registro dos ITEMS no EventBus (Olher o CraftDiscos.java)
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
