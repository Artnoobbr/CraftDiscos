package net.artnoobbr.craftdiscos.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGrupo {

    public static final ItemGroup DISCOS_GROUP = new ItemGroup("CraftDiscosTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BASE_DISCO.get());
        }
    };

}
