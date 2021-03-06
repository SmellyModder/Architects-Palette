package architectspalette.core.registry;

import architectspalette.core.ArchitectsPalette;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class APTileEntities {
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ArchitectsPalette.MOD_ID);
	//Gone.
//	public static final RegistryObject<TileEntityType<ChiseledAbyssalineTileEntity>> CHISELED_ABYSSALINE = TILE_ENTITY_TYPES.register("chiseled_abyssaline", () -> new TileEntityType<>(ChiseledAbyssalineTileEntity::new, Sets.newHashSet(APBlocks.CHISELED_ABYSSALINE_BRICKS.get()), null));
}