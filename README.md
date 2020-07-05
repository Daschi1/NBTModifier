# NBTModifier

## A nbt api for minecraft 1.13+.

# Usage

```java
NBTEntityModifier nbtEntityModifier = new NBTEntityModifier(/*plugin-instance*/,/*entity*/); //same for NBTItemModifier(with itemStack) and NBTTileEntityModifier(with e.g. chests)

nbtEntityModifier.setInteger(/*key*/, /*value*/); //same for any other datatypes
nbtEntityModifier.hasInteger(/*key*/); //same for any other datatypes
nbtEntityModifier.getInteger(/*key*/); //same for any other datatypes
nbtEntityModifier.remove(/*key*/); //same for any other datatypes

nbtEntityModifier.saveEntity(); //saves changes and returns modified entity, .saveItemStack(); for NBTItemModifier and .saveTileState(); for NBTTileEntityModifier
```
