package de.daschi.nbtmodifier;

import org.bukkit.entity.Entity;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class NBTEntityModifier extends NBTModifier {
    private final Entity entity;

    public Entity saveEntity() {
        return this.entity;
    }

    public NBTEntityModifier(final JavaPlugin plugin, final Entity entity) {
        super(plugin);
        this.entity = Objects.requireNonNull(entity, "The provided entity is null.");
    }

    @Override
    public void setByte(final String key, final byte value) {
        this.setByte(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setByteArray(final String key, final byte[] value) {
        this.setByteArray(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setDouble(final String key, final double value) {
        this.setDouble(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setFloat(final String key, final float value) {
        this.setFloat(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setInteger(final String key, final int value) {
        this.setInteger(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setIntegerArray(final String key, final int[] value) {
        this.setIntegerArray(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setLong(final String key, final long value) {
        this.setLong(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setLongArray(final String key, final long[] value) {
        this.setLongArray(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setShort(final String key, final short value) {
        this.setShort(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setString(final String key, final String value) {
        this.setString(key, value, this.entity.getPersistentDataContainer());
    }

    @Override
    public void setTagContainer(final String key, final PersistentDataContainer value) {
        this.setTagContainer(key, value, this.entity.getPersistentDataContainer());
    }


    @Override
    public byte getByte(final String key) {
        return this.getByte(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public byte[] getByteArray(final String key) {
        return this.getByteArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public double getDouble(final String key) {
        return this.getDouble(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public float getFloat(final String key) {
        return this.getFloat(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public int getInteger(final String key) {
        return this.getInteger(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public int[] getIntegerArray(final String key) {
        return this.getIntegerArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public long getLong(final String key) {
        return this.getLong(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public long[] getLongArray(final String key) {
        return this.getLongArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public short getShort(final String key) {
        return this.getShort(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public String getString(final String key) {
        return this.getString(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public PersistentDataContainer getTagContainer(final String key) {
        return this.getTagContainer(key, this.entity.getPersistentDataContainer());
    }


    @Override
    public boolean hasByte(final String key) {
        return this.hasByte(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasByteArray(final String key) {
        return this.hasByteArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasDouble(final String key) {
        return this.hasDouble(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasFloat(final String key) {
        return this.hasFloat(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasInteger(final String key) {
        return this.hasInteger(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasIntegerArray(final String key) {
        return this.hasIntegerArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasLong(final String key) {
        return this.hasLong(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasLongArray(final String key) {
        return this.hasLongArray(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasShort(final String key) {
        return this.hasShort(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasString(final String key) {
        return this.hasString(key, this.entity.getPersistentDataContainer());
    }

    @Override
    public boolean hasTagContainer(final String key) {
        return this.hasTagContainer(key, this.entity.getPersistentDataContainer());
    }


    @Override
    public void remove(final String key) {
        this.remove(key, this.entity.getPersistentDataContainer());
    }
}
