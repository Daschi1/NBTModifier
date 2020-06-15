package de.daschi.nbtmodifier;

import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

abstract class NBTModifier implements NBTBasicModifier {
    protected final JavaPlugin javaPlugin;

    public NBTModifier(final JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }

    protected void setByte(final String key, final byte value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE, value);
    }

    protected void setByteArray(final String key, final byte[] value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE_ARRAY, value);
    }

    protected void setDouble(final String key, final double value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.DOUBLE, value);
    }

    protected void setFloat(final String key, final float value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.FLOAT, value);
    }

    protected void setInteger(final String key, final int value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER, value);
    }

    protected void setIntegerArray(final String key, final int[] value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER_ARRAY, value);
    }

    protected void setLong(final String key, final long value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG, value);
    }

    protected void setLongArray(final String key, final long[] value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG_ARRAY, value);
    }

    protected void setShort(final String key, final short value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.SHORT, value);
    }

    protected void setString(final String key, final String value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.STRING, value);
    }

    protected void setTagContainer(final String key, final PersistentDataContainer value, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.set(new NamespacedKey(this.javaPlugin, key), PersistentDataType.TAG_CONTAINER, value);
    }


    protected byte getByte(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE);
    }

    protected byte[] getByteArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE_ARRAY);
    }

    protected double getDouble(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.DOUBLE);
    }

    protected float getFloat(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.FLOAT);
    }

    protected int getInteger(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER);
    }

    protected int[] getIntegerArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER_ARRAY);
    }

    protected long getLong(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG);
    }

    protected long[] getLongArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG_ARRAY);
    }

    protected short getShort(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.SHORT);
    }

    protected String getString(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.STRING);
    }

    protected PersistentDataContainer getTagContainer(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.get(new NamespacedKey(this.javaPlugin, key), PersistentDataType.TAG_CONTAINER);
    }


    protected boolean hasByte(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE);
    }

    protected boolean hasByteArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.BYTE_ARRAY);
    }

    protected boolean hasDouble(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.DOUBLE);
    }

    protected boolean hasFloat(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.FLOAT);
    }

    protected boolean hasInteger(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER);
    }

    protected boolean hasIntegerArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.INTEGER_ARRAY);
    }

    protected boolean hasLong(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG);
    }

    protected boolean hasLongArray(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.LONG_ARRAY);
    }

    protected boolean hasShort(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.SHORT);
    }

    protected boolean hasString(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.STRING);
    }

    protected boolean hasTagContainer(final String key, final PersistentDataContainer persistentDataContainer) {
        return persistentDataContainer.has(new NamespacedKey(this.javaPlugin, key), PersistentDataType.TAG_CONTAINER);
    }


    protected void remove(final String key, final PersistentDataContainer persistentDataContainer) {
        persistentDataContainer.remove(new NamespacedKey(this.javaPlugin, key));
    }
}
