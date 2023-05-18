package com.github.sib_energy_craft.machines.block.entity;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public enum EnergyMachineProperties implements EnergyMachineProperty {
    COOKING_TIME,
    COOKING_TIME_TOTAL,
    CHARGE,
    MAX_CHARGE;

    @Override
    public int getIndex() {
        return ordinal();
    }
}