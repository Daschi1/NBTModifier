package de.daschi.nbtmodifier;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class NBTItemModifier extends NBTModifier {
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    public ItemStack saveItemStack() {
        this.itemStack.setItemMeta(this.itemMeta);

        return this.itemStack;
    }

    public NBTItemModifier(final JavaPlugin plugin, final ItemStack itemStack) {
        super(plugin);
        this.itemStack = Objects.requireNonNull(itemStack, "The provided itemStack is null.");
        this.itemMeta = Objects.requireNonNull(this.itemStack.getItemMeta(), "The provided itemStackMeta is null.");
    }

    @Override
    public void setByte(final String key, final byte value) {
        this.setByte(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setByteArray(final String key, final byte[] value) {
        this.setByteArray(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setDouble(final String key, final double value) {
        this.setDouble(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setFloat(final String key, final float value) {
        this.setFloat(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setInteger(final String key, final int value) {
        this.setInteger(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setIntegerArray(final String key, final int[] value) {
        this.setIntegerArray(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setLong(final String key, final long value) {
        this.setLong(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setLongArray(final String key, final long[] value) {
        this.setLongArray(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setShort(final String key, final short value) {
        this.setShort(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setString(final String key, final String value) {
        this.setString(key, value, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public void setTagContainer(final String key, final PersistentDataContainer value) {
        this.setTagContainer(key, value, this.itemMeta.getPersistentDataContainer());
    }


    @Override
    public byte getByte(final String key) {
        return this.getByte(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public byte[] getByteArray(final String key) {
        return this.getByteArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public double getDouble(final String key) {
        return this.getDouble(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public float getFloat(final String key) {
        return this.getFloat(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public int getInteger(final String key) {
        return this.getInteger(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public int[] getIntegerArray(final String key) {
        return this.getIntegerArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public long getLong(final String key) {
        return this.getLong(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public long[] getLongArray(final String key) {
        return this.getLongArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public short getShort(final String key) {
        return this.getShort(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public String getString(final String key) {
        return this.getString(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public PersistentDataContainer getTagContainer(final String key) {
        return this.getTagContainer(key, this.itemMeta.getPersistentDataContainer());
    }


    @Override
    public boolean hasByte(final String key) {
        return this.hasByte(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasByteArray(final String key) {
        return this.hasByteArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasDouble(final String key) {
        return this.hasDouble(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasFloat(final String key) {
        return this.hasFloat(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasInteger(final String key) {
        return this.hasInteger(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasIntegerArray(final String key) {
        return this.hasIntegerArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasLong(final String key) {
        return this.hasLong(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasLongArray(final String key) {
        return this.hasLongArray(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasShort(final String key) {
        return this.hasShort(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasString(final String key) {
        return this.hasString(key, this.itemMeta.getPersistentDataContainer());
    }

    @Override
    public boolean hasTagContainer(final String key) {
        return this.hasTagContainer(key, this.itemMeta.getPersistentDataContainer());
    }


    @Override
    public void remove(final String key) {
        this.remove(key, this.itemMeta.getPersistentDataContainer());
    }
}
