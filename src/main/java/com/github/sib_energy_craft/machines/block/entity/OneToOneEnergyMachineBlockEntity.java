package com.github.sib_energy_craft.machines.block.entity;

import com.github.sib_energy_craft.machines.block.AbstractEnergyMachineBlock;
import com.github.sib_energy_craft.machines.utils.EnergyMachineUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

/**
 * @since 0.0.28
 * @author sibmaks
 */
public abstract class OneToOneEnergyMachineBlockEntity<B extends AbstractEnergyMachineBlock>
        extends AbstractEnergyMachineBlockEntity<B> {


    public OneToOneEnergyMachineBlockEntity(@NotNull BlockEntityType<?> blockEntityType,
                                            @NotNull BlockPos blockPos,
                                            @NotNull BlockState blockState,
                                            @NotNull B block) {
        super(blockEntityType, blockPos, blockState, block);
    }

    public OneToOneEnergyMachineBlockEntity(@NotNull BlockEntityType<?> blockEntityType,
                                            @NotNull BlockPos blockPos,
                                            @NotNull BlockState blockState,
                                            @NotNull B block,
                                            int slots) {
        super(blockEntityType, blockPos, blockState, block, slots, slots, slots);
    }

    @Override
    protected boolean canAcceptRecipeOutput(int process,
                                            @NotNull World world,
                                            @NotNull Recipe<Inventory> recipe,
                                            int count) {
        return EnergyMachineUtils.canAcceptRecipeOutput(process, inventory, world, recipe, count);
    }

    @Override
    public boolean craftRecipe(int process,
                               @NotNull World world,
                               @NotNull Recipe<Inventory> recipe,
                               int decrement,
                               int maxCount) {
        return EnergyMachineUtils.craftRecipe(process, inventory, world, recipe, decrement, maxCount);
    }
}
