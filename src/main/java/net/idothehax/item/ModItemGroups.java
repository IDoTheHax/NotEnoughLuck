package net.idothehax.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.idothehax.NotEnoughLuck;
import net.idothehax.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GAMBLING = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NotEnoughLuck.MOD_ID, "Gambling"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.Gambling"))
                    .icon(() -> new ItemStack(ModItems.CHIP)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CHIP);

                        entries.add(ModBlocks.SLOTS);
                    }).build());

    public static void registerItemGroups() {
        NotEnoughLuck.LOGGER.info("Registering Item Groups For " + NotEnoughLuck.MOD_ID);
    }
}
