package mchorse.capabilities.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

/**
 * Mana provider
 *
 * This class is responsible for providing a capability. Other modders may 
 * attach their own provider with implementation that returns another 
 * implementation of IMana to the target's (Entity, TE, ItemStack, etc.) disposal.
 */
public class ManaProvider implements ICapabilitySerializable<NBTBase>
{
    @CapabilityInject(IMana.class)
    public static final Capability<IMana> MANA_CAP = null;

    private IMana instance = MANA_CAP.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return capability == MANA_CAP;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return capability == MANA_CAP ? MANA_CAP.<T> cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT()
    {
        return MANA_CAP.getStorage().writeNBT(MANA_CAP, this.instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt)
    {
        MANA_CAP.getStorage().readNBT(MANA_CAP, this.instance, null, nbt);
    }
}