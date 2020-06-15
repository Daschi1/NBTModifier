package de.daschi.nbtmodifier;

import org.bukkit.persistence.PersistentDataContainer;

interface NBTBasicModifier {
    void setByte(String key, byte value);

    void setByteArray(String key, byte[] value);

    void setDouble(String key, double value);

    void setFloat(String key, float value);

    void setInteger(String key, int value);

    void setIntegerArray(String key, int[] value);

    void setLong(String key, long value);

    void setLongArray(String key, long[] value);

    void setShort(String key, short value);

    void setString(String key, String value);

    void setTagContainer(String key, PersistentDataContainer value);


    byte getByte(String key);

    byte[] getByteArray(String key);

    double getDouble(String key);

    float getFloat(String key);

    int getInteger(String key);

    int[] getIntegerArray(String key);

    long getLong(String key);

    long[] getLongArray(String key);

    short getShort(String key);

    String getString(String key);

    PersistentDataContainer getTagContainer(String key);


    boolean hasByte(String key);

    boolean hasByteArray(String key);

    boolean hasDouble(String key);

    boolean hasFloat(String key);

    boolean hasInteger(String key);

    boolean hasIntegerArray(String key);

    boolean hasLong(String key);

    boolean hasLongArray(String key);

    boolean hasShort(String key);

    boolean hasString(String key);

    boolean hasTagContainer(String key);

    void remove(String key);
}
