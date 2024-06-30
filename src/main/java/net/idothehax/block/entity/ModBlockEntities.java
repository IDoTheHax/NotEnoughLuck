package net.idothehax.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.idothehax.NotEnoughLuck;
import net.idothehax.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<SlotsEntity> SLOTS_ENTITY;

    public static void registerAllBlockEntities() {
        SLOTS_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(NotEnoughLuck.MOD_ID, "slots_entity"),
                FabricBlockEntityTypeBuilder.create(SlotsEntity::new,
                        ModBlocks.SLOTS).build());
    }
}
