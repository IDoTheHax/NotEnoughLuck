package net.idothehax.block;

import net.fabricmc.fabric.mixin.object.builder.AbstractBlockSettingsAccessor;
import net.idothehax.NotEnoughLuck;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SLOTS = registerBlock("slots_geo",
            new Block(AbstractBlock.Settings.create().burnable().instrument(Instrument.PLING).hardness(3).jumpVelocityMultiplier(2).sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NotEnoughLuck.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NotEnoughLuck.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        NotEnoughLuck.LOGGER.info("Registering ModBlocks for " + NotEnoughLuck.MOD_ID);
    }
}
